package com.restService.repository;

import com.restService.model.base.dto.InquiryResult;
import com.restService.model.base.dto.cheque.Cheque;
import com.restService.model.base.dto.cheque.ChequeComplementary;
import com.restService.model.base.dto.cheque.ChequeInfo;
import com.restService.model.base.dto.macna.BillInfo;
import com.restService.model.base.dto.macna.Macna;
import com.restService.model.base.dto.macna.MacnaInfo;
import com.restService.model.base.dto.nahab.CorporatePerson;
import com.restService.model.base.dto.nahab.Nahab;
import com.restService.model.base.dto.nahab.NahabBaseModel;
import com.restService.model.base.dto.nahab.NahabInfo;
import com.restService.model.base.dto.samat.Bond;
import com.restService.model.base.dto.samat.Credit;
import com.restService.model.base.dto.samat.Facility;
import com.restService.model.base.dto.samat.Samat;
import com.restService.model.base.dto.sepam.DocumentaryCredit;
import com.restService.model.base.dto.sepam.DocumentaryCreditDiscount;
import com.restService.model.base.dto.sepam.Guaranty;
import com.restService.model.base.dto.sepam.Sepam;
import com.restService.model.tahlil.ActivityLog;
import com.restService.model.tahlil.ChequeTotal;
import com.restService.model.tahlil.FactCmsReserve;
import com.restService.model.tahlil.RequestSummary;
import com.restService.utils.DateUtils;
import org.hibernate.jpa.QueryHints;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by EDW on 2/9/2021.
 */
@Service
public class GeneralRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public InquiryResult get(String nationalCode) {
        try {
            InquiryResult inquiryResult = new InquiryResult();
            inquiryResult.setNationalCode(nationalCode);

//            List<Facility> facilities = (List<Facility>) entityManager.createQuery("select f from Facility f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//                inquiryResult.setFacilities(facilities);
//
//            List<Credit> credits = (List<Credit>) entityManager.createQuery("select f from Credit f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//            inquiryResult.setCredits(credits);
//
//            List<Bond> bonds = (List<Bond>) entityManager.createQuery("select f from Bond f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//            inquiryResult.setBonds(bonds);
//
//            List<DocumentaryCredit> documentaryCredits = (List<DocumentaryCredit>) entityManager.createQuery("select f from DocumentaryCredit f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//            inquiryResult.setDocumentaryCredits(documentaryCredits);
//
//            List<DocumentaryCreditDiscount> documentaryCreditDiscounts = (List<DocumentaryCreditDiscount>) entityManager.createQuery("select f from DocumentaryCreditDiscount f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//            inquiryResult.setDocumentaryCreditDiscounts(documentaryCreditDiscounts);

            String natIdLen = String.valueOf(nationalCode.length());
            List<Guaranty> guaranties = (List<Guaranty>) entityManager.createQuery("select f from Guaranty f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
                    .setParameter("nationalCode", nationalCode)
                    .getResultList();
            inquiryResult.setGuaranties(guaranties);

//            List<MacnaInfo> macnas = (List<MacnaInfo>)  entityManager.createQuery("select f from MacnaInfo f where function('lpad', f.nationalid, " + natIdLen + ", '0') = :nationalCode ")
//                    .setParameter("nationalCode", nationalCode)
//                    .getResultList();
//            inquiryResult.setMacnaInfos(macnas);

            return inquiryResult;
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ActivityLog addLog(String clientName, String serviceName, String parameters) {
        ActivityLog log = new ActivityLog();
        log.setClientName(clientName);
        log.setServiceName(serviceName);
        log.setParameter(parameters);
        log.setRequestTime(DateUtils.format(new Date(), "yyyyMMdd:HHmmssss"));
        boolean isValid = getTodayRequestCount(log) < 100;
        if(!isValid) {
            log.setMessage("MAXIMUM NUMBER OF REQUEST EXCEEDED.");
        }
        entityManager.persist(log);
        return isValid ? log : null;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public ActivityLog completeLog(ActivityLog log, String status, String message) {
        log.setResponseTime(DateUtils.format(new Date(), "yyyyMMdd:HHmmssss"));
        log.setDescription(status);
        try{
            if(message != null) {
                log.setMessage(message.length() > 500 ? message.substring(0, 499) : message);
            } else {
                log.setMessage("NO MESSAGE");
            }
        } catch (Exception ex) {
            log.setMessage("ERROR IN READING MESSAGE");
        }
        entityManager.merge(log);
        return log;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void increaseCount(ActivityLog log) {
        List<RequestSummary> requestSummaries = (List<RequestSummary>) entityManager.createQuery("select drs from RequestSummary  drs where drs.clientName = :clientName and drs.serviceName = :serviceName and drs.requestDate = :requestDate ")
                .setParameter("clientName", log.getClientName())
                .setParameter("serviceName", log.getServiceName())
                .setParameter("requestDate", DateUtils.format(new Date(), "yyyyMMdd"))
                .getResultList();
        if(requestSummaries == null || requestSummaries.size() == 0) {
            RequestSummary requestSummary = new RequestSummary();
            requestSummary.setClientName(log.getClientName());
            requestSummary.setRequestCount(1);
            requestSummary.setRequestDate(DateUtils.format(new Date(), "yyyyMMdd"));
            requestSummary.setServiceName(log.getServiceName());
            entityManager.persist(requestSummary);
        } else {
            requestSummaries.get(0).setRequestCount(requestSummaries.get(0).getRequestCount() + 1);
            entityManager.merge(requestSummaries.get(0));
        }


    }

    public Integer getTodayRequestCount(ActivityLog log) {
        List<RequestSummary> requestSummaries = (List<RequestSummary>) entityManager.createQuery("select drs from RequestSummary  drs where drs.clientName = :clientName and drs.serviceName = :serviceName and drs.requestDate = :requestDate ")
                .setParameter("clientName", log.getClientName())
                .setParameter("serviceName", log.getServiceName())
                .setParameter("requestDate", DateUtils.format(new Date(), "yyyyMMdd"))
                .getResultList();
        if(requestSummaries == null || requestSummaries.size() == 0) {
            return 0;
        } else {
            return requestSummaries.get(0).getRequestCount();
        }
    }

    @Transactional
    public List<FactCmsReserve> getFactCmsReserveByNationalCode(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
//        return (List<FactCmsReserve>) entityManager.createQuery("select f from FactCmsReserve f where function('lpad', f.CREDITOR_NATIONAL_ID, " + natIdLen + ", '0') = :nationalCode ")
        return (List<FactCmsReserve>) entityManager.createQuery("select f from FactCmsReserve f where function('lpad', f.chkbPartyNationalId, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
    }

    @Transactional
    public Samat getSamat(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
        Samat samat = new Samat();
        samat.setNationalCode(nationalCode);

        List<Facility> facilities = (List<Facility>) entityManager.createQuery("select f from Facility f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        samat.setFacilities(facilities);

//        List<Credit> credits = (List<Credit>) entityManager.createQuery("select f from Credit f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
//                .setParameter("nationalCode", nationalCode)
//                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
//                .getResultList();
//        samat.setCredits(credits);

        List<Bond> bonds = (List<Bond>) entityManager.createQuery("select f from Bond f where function('lpad', f.idMain, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        samat.setBonds(bonds);
        return samat;
    }

    @Transactional
    public Sepam getSepam(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
        Sepam sepam = new Sepam();
        sepam.setNationalCode(nationalCode);

        List<DocumentaryCredit> documentaryCredits = (List<DocumentaryCredit>) entityManager.createQuery("select f from DocumentaryCredit f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        sepam.setDocumentaryCredits(documentaryCredits);

        List<DocumentaryCreditDiscount> documentaryCreditDiscounts = (List<DocumentaryCreditDiscount>) entityManager.createQuery("select f from DocumentaryCreditDiscount f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        sepam.setDocumentaryCreditDiscounts(documentaryCreditDiscounts);

        List<Guaranty> guaranties = (List<Guaranty>) entityManager.createQuery("select f from Guaranty f where function('lpad', f.natidno, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();

        sepam.setGuaranties(guaranties);
        return sepam;
    }

    @Transactional
    public Macna getMacna2(String nationalCode, String accountDate) {
        String natIdLen = String.valueOf(nationalCode.length());
        Macna macna = new Macna();
        macna.setNationalCode(nationalCode);

        List<MacnaInfo> macnaInfos = (List<MacnaInfo>) entityManager.createNamedQuery("MacnaInfo.findByNationalId")
                .setParameter("nationalId", nationalCode)
                .getResultList();
        if(macnaInfos != null && macnaInfos.size() > 0) {
            MacnaInfo macnaInfo = macnaInfos.get(0);
            List<BillInfo> billInfos = (List<BillInfo>) entityManager.createNamedQuery("BilInfo.findByMacnaId")
                    .setParameter("billUniqueId", macnaInfo.getId())
                    .getResultList();
            macnaInfo.setBillInfos(billInfos);
            macna.setMacnaInfo(macnaInfo);
        }
        return macna;
    }

    @Transactional
    public Macna getMacna(String nationalCode, String accountDate) {
        String natIdLen = String.valueOf(nationalCode.length());
        Macna macna = new Macna();
        macna.setNationalCode(nationalCode);

        List<MacnaInfo> macnaInfos = (List<MacnaInfo>) entityManager.createQuery("select f from MacnaInfo f where function('lpad', f.nationalCode, " + natIdLen + ", '0') = :nationalCode and f.macnaUpdateDate <= :accountDate order by f.macnaUpdateDate desc ")
                .setParameter("nationalCode", nationalCode)
                .setParameter("accountDate", DateUtils.persianToGregorian(accountDate, "YYYY-MM-DD"))
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        if(macnaInfos != null && macnaInfos.size() > 0) {
            macna.setMacnaInfo(macnaInfos.get(0));
        }
        return macna;
    }

    @Transactional
    public Nahab getNahab(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
        Nahab nahab = new Nahab();
        nahab.setNationalCode(nationalCode);
        List<NahabInfo> nahabInfos = (List<NahabInfo>) entityManager.createQuery("select f from NahabInfo f where function('lpad', f.nationalId, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        List<NahabBaseModel> result = new ArrayList<>();
        if(nahabInfos != null && nahabInfos.size() > 0) {
            for(NahabInfo nahabInfo: nahabInfos) {
                if("0".equals(nahabInfo.getIsNatural())) {
                    List<CorporatePerson> corporatePersons = (List<CorporatePerson>) entityManager.createQuery("select f from CorporatePerson f where function('lpad', f.nationalId, " + natIdLen + ", '0') = :nationalCode and f.shahabId = :shahabId ")
                            .setParameter("nationalCode", nationalCode)
                            .setParameter("shahabId", nahabInfo.getShahabId())
                            .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                            .getResultList();
                    result.add(nahabInfo.getLegalNahabInfo(corporatePersons != null && corporatePersons.size() > 0 ? corporatePersons.get(0) : null));
                } else {
                    result.add(nahabInfo.getNaturalNahabInfo());
                }
            }
        }
        nahab.setNahabInfos(result);
        return nahab;
    }

    @Transactional
    public Nahab getNahab2(String nationalCode) {
        Nahab nahab = new Nahab();
        nahab.setNationalCode(nationalCode);
        String natIdLen = String.valueOf(nationalCode.length());
        List<Object[]> objs = (List<Object[]>) entityManager.createNativeQuery("select /*+  PARALLEL(32) NOLOGGING */SHAHAB_ID,NATIONAL_ID,FIRST_NAME,LAST_NAME,FATHER_NAME,IS_NATURAL,IS_MALE,BIRTH_DATE,BIRTH_LOCATION,ID_NUMBER,POSTAL_CODE,POSTAL_ADDRESS from dim_nahab f where lpad(f.national_Id, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .getResultList();
        List<NahabBaseModel> result = new ArrayList<>();
        if(objs != null && objs.size() > 0) {
            for(Object[] obj: objs) {
                result.add(castObjectToNahab(obj));
            }
        }
        nahab.setNahabInfos(result);
        return nahab;
    }

    private String returnObjectAsString(Object object) {
        if(object == null) return null;
        return String.valueOf(object);
    }
    private Boolean returnObjectAsBoolean(Object object) {
        if(object == null) return null;
        return "1".equals(String.valueOf(object));
    }
    private NahabBaseModel castObjectToNahab(Object[] obj) {
        String nationalCode = returnObjectAsString(obj[1]);
        if(nationalCode == null) return null;
        NahabInfo nahabInfo = new NahabInfo();
        nahabInfo.setIsNatural(returnObjectAsString(obj[5]));
//        nahabInfo.setCorporatePerson(CorporatePerson corporatePerson);
        nahabInfo.setShahabId(returnObjectAsString(obj[0]));
        nahabInfo.setNationalId(returnObjectAsString(obj[1]));
        nahabInfo.setFirstName(returnObjectAsString(obj[2]));
        nahabInfo.setLastName(returnObjectAsString(obj[3]));
        nahabInfo.setFatherName(returnObjectAsString(obj[4]));
        nahabInfo.setBirthDate(returnObjectAsString(obj[7]));
        nahabInfo.setBirthLocation(returnObjectAsString(obj[8]));
        nahabInfo.setIsMale(returnObjectAsBoolean(obj[6]));
        nahabInfo.setPostalCode(returnObjectAsString(obj[10]));
        nahabInfo.setPostalAddress(returnObjectAsString(obj[11]));
        nahabInfo.setIdNumber(returnObjectAsString(obj[9]));
        if("0".equals(nahabInfo.getIsNatural())) {

            String natIdLen = String.valueOf(nationalCode.length());
            List<Object[]> corporatePersonObjects = (List<Object[]>) entityManager.createNativeQuery("select /*+  PARALLEL(32) NOLOGGING */NATIONAL_ID,SHAHAB_ID,LEGAL_TYPE,ESTABLISHMENT_DATE,REGISTER_DATE,BREAK_UP_DATE,IS_SETTLE,IS_BREAKUP,IS_BANKRUPT,IS_VALID from TB_CORPORATE_PERSON f where lpad(f.national_Id, " + natIdLen + ", '0') = :nationalCode and f.shahab_Id = :shahabId ")
                    .setParameter("nationalCode", nationalCode)
                    .setParameter("shahabId", nahabInfo.getShahabId())
                    .getResultList();
            CorporatePerson corporatePerson = corporatePersonObjects != null && corporatePersonObjects.size() > 0 ? castObjectToCorporatePerson(corporatePersonObjects.get(0)) : null;
            return nahabInfo.getLegalNahabInfo(corporatePerson);
        } else {
            return nahabInfo.getNaturalNahabInfo();
        }
    }

    private CorporatePerson castObjectToCorporatePerson(Object[] obj) {
        if(obj == null) return null;
        CorporatePerson corporatePerson = new CorporatePerson();
        corporatePerson.setNationalId(returnObjectAsString(obj[0]));
        corporatePerson.setShahabId(returnObjectAsString(obj[1]));
        corporatePerson.setLegalType(returnObjectAsString(obj[2]));
        corporatePerson.setEstablishmentDate(returnObjectAsString(obj[3]));
        corporatePerson.setRegisterDate(returnObjectAsString(obj[4]));
        corporatePerson.setBreakUpDate(returnObjectAsString(obj[5])) ;
        corporatePerson.setIsSettle(returnObjectAsBoolean(obj[6]));
        corporatePerson.setIsBreakUp(returnObjectAsBoolean(obj[7])) ;
        corporatePerson.setIsBankRupt(returnObjectAsBoolean(obj[8]));
        corporatePerson.setIsValid(returnObjectAsBoolean(obj[9])) ;
        return corporatePerson;
    }

    @Transactional
    public Cheque getCheque(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
        Cheque cheque = new Cheque();
        cheque.setNationalCode(nationalCode);
        List<ChequeInfo> chequeInfos = (List<ChequeInfo>) entityManager.createQuery("select f from ChequeInfo f where function('lpad', f.idNo, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
        cheque.setChequeInfos(chequeInfos);

        return cheque;
    }

    public List<ChequeTotal> getChequeTotalByNationalCode(String nationalCode) {
        String natIdLen = String.valueOf(nationalCode.length());
        return (List<ChequeTotal>) entityManager.createQuery("select f from ChequeTotal f where function('lpad', f.nationalId, " + natIdLen + ", '0') = :nationalCode ")
                .setParameter("nationalCode", nationalCode)
                .setHint(QueryHints.HINT_COMMENT, "+ parallel(5) nologging ")
                .getResultList();
    }
}
