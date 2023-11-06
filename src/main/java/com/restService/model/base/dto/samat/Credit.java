package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VETBRFILE1", schema = "", catalog = "")
public class Credit implements Serializable {

    @Id
    @Column(name = "ID_TTN", nullable = true, length = 16)
    private String idTtn;

    @Column(name = "TP_CSTMR", nullable = true, precision = 0)
    private Long tpCstmr;

    @Column(name = "SHAHABCD", nullable = true, length = 16)
    private String shahabcd;

    @Column(name = "ID_MAIN", nullable = true, length = 255)
    private String idMain;


    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;

    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;

    @Column(name = "DT_OPEN_ETBR", nullable = true, length = 8)
    private String dtOpenEtbr;

    @Column(name = "DT_LSTMAT", nullable = true, length = 8)
    private String dtLstmat;

    @Column(name = "CD_ARZ", nullable = true, length = 3)
    private String cdArz;

    @Column(name = "CONV_RATE", nullable = true, precision = 0)
    private Long convRate;

    @Column(name = "AM_ETBR", nullable = true, precision = 0)
    private Long amEtbr;

    @Column(name = "TP_ETBR", nullable = true, length = 2)
    private String tpEtbr;

    @Column(name = "MALIAT_ESTNO", nullable = true, length = 14)
    private String maliatEstno;

    @Column(name = "PRSN_NUM", nullable = true, length = 1)
    private String prsnNum;

    @Column(name = "EQNMC_PRT", nullable = true, length = 2)
    private String eqnmcPrt;

    @Column(name = "EQNMC_DTL", nullable = true, length = 4)
    private String eqnmcDtl;
    @Column(name = "TP_OWNER", nullable = true, length = 1)
    private String tpOwner;

    @Column(name = "TASTAM_RESRC", nullable = true, length = 2)
    private String tastamResrc;

    @Column(name = "DT_PAY", nullable = true, length = 8)
    private String dtPay;

    @Column(name = "TASHILAT_STATE", nullable = true, length = 1)
    private String tashilatState;

    @Column(name = "RMTOTAL", nullable = true, precision = 0)
    private Long rmtotal;

    @Column(name = "RMMSHK", nullable = true, precision = 0)
    private Long rmmshk;

    @Column(name = "RMSKHT", nullable = true, precision = 0)
    private Long rmskht;

    @Column(name = "RMTHD", nullable = true, precision = 0)
    private Long rmthd;

    @Column(name = "ELTZM_TKHR", nullable = true, precision = 0)
    private Long eltzmTkhr;

    @Column(name = "GRM_DRKRD", nullable = true, precision = 0)
    private Long grmDrkrd;

    @Column(name = "ID", nullable = false, precision = 0)
    private long id;

    @JsonManagedReference
    @OneToMany(mappedBy = "credit")
    private List<CreditBail> creditBails;

    @JsonManagedReference
    @OneToMany(mappedBy = "credit")
    private List<CreditGroup> creditGroups;

    @JsonManagedReference
    @OneToMany(mappedBy = "credit")
    private List<CreditGuarantor> creditGuarantors;

    @JsonManagedReference
    @OneToMany(mappedBy = "credit")
    private List<CreditSettlement> creditSettlements;

    public String getIdTtn() {
        return idTtn;
    }

    public void setIdTtn(String idTtn) {
        this.idTtn = idTtn;
    }

    public Long getTpCstmr() {
        return tpCstmr;
    }

    public void setTpCstmr(Long tpCstmr) {
        this.tpCstmr = tpCstmr;
    }

    public String getShahabcd() {
        return shahabcd;
    }

    public void setShahabcd(String shahabcd) {
        this.shahabcd = shahabcd;
    }

    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public String getCdBnk() {
        return cdBnk;
    }

    public void setCdBnk(String cdBnk) {
        this.cdBnk = cdBnk;
    }

    public String getCdShb() {
        return cdShb;
    }

    public void setCdShb(String cdShb) {
        this.cdShb = cdShb;
    }

    public String getDtOpenEtbr() {
        return dtOpenEtbr;
    }

    public void setDtOpenEtbr(String dtOpenEtbr) {
        this.dtOpenEtbr = dtOpenEtbr;
    }

    public String getDtLstmat() {
        return dtLstmat;
    }

    public void setDtLstmat(String dtLstmat) {
        this.dtLstmat = dtLstmat;
    }

    public String getCdArz() {
        return cdArz;
    }

    public void setCdArz(String cdArz) {
        this.cdArz = cdArz;
    }

    public Long getConvRate() {
        return convRate;
    }

    public void setConvRate(Long convRate) {
        this.convRate = convRate;
    }

    public Long getAmEtbr() {
        return amEtbr;
    }

    public void setAmEtbr(Long amEtbr) {
        this.amEtbr = amEtbr;
    }

    public String getTpEtbr() {
        return tpEtbr;
    }

    public void setTpEtbr(String tpEtbr) {
        this.tpEtbr = tpEtbr;
    }

    public String getMaliatEstno() {
        return maliatEstno;
    }

    public void setMaliatEstno(String maliatEstno) {
        this.maliatEstno = maliatEstno;
    }

    public String getPrsnNum() {
        return prsnNum;
    }

    public void setPrsnNum(String prsnNum) {
        this.prsnNum = prsnNum;
    }

    public String getEqnmcPrt() {
        return eqnmcPrt;
    }

    public void setEqnmcPrt(String eqnmcPrt) {
        this.eqnmcPrt = eqnmcPrt;
    }

    public String getEqnmcDtl() {
        return eqnmcDtl;
    }

    public void setEqnmcDtl(String eqnmcDtl) {
        this.eqnmcDtl = eqnmcDtl;
    }

    public String getTpOwner() {
        return tpOwner;
    }

    public void setTpOwner(String tpOwner) {
        this.tpOwner = tpOwner;
    }

    public String getTastamResrc() {
        return tastamResrc;
    }

    public void setTastamResrc(String tastamResrc) {
        this.tastamResrc = tastamResrc;
    }

    public String getDtPay() {
        return dtPay;
    }

    public void setDtPay(String dtPay) {
        this.dtPay = dtPay;
    }

    public String getTashilatState() {
        return tashilatState;
    }

    public void setTashilatState(String tashilatState) {
        this.tashilatState = tashilatState;
    }

    public Long getRmtotal() {
        return rmtotal;
    }

    public void setRmtotal(Long rmtotal) {
        this.rmtotal = rmtotal;
    }

    public Long getRmmshk() {
        return rmmshk;
    }

    public void setRmmshk(Long rmmshk) {
        this.rmmshk = rmmshk;
    }

    public Long getRmskht() {
        return rmskht;
    }

    public void setRmskht(Long rmskht) {
        this.rmskht = rmskht;
    }

    public Long getRmthd() {
        return rmthd;
    }

    public void setRmthd(Long rmthd) {
        this.rmthd = rmthd;
    }

    public Long getEltzmTkhr() {
        return eltzmTkhr;
    }

    public void setEltzmTkhr(Long eltzmTkhr) {
        this.eltzmTkhr = eltzmTkhr;
    }

    public Long getGrmDrkrd() {
        return grmDrkrd;
    }

    public void setGrmDrkrd(Long grmDrkrd) {
        this.grmDrkrd = grmDrkrd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<CreditBail> getCreditBails() {
        return creditBails;
    }

    public void setCreditBails(List<CreditBail> creditBails) {
        this.creditBails = creditBails;
    }

    public void setCreditBail(CreditBail creditBail) {
        if(this.creditBails == null) {
            this.setCreditBails(new ArrayList<>());
        }
        this.creditBails.add(creditBail);
    }

    public List<CreditGroup> getCreditGroups() {
        return creditGroups;
    }

    public void setCreditGroups(List<CreditGroup> creditGroups) {
        this.creditGroups = creditGroups;
    }

    public void addCreditGroups(CreditGroup creditGroup) {
        if(this.creditGroups == null) {
            this.setCreditGroups(new ArrayList<>());
        }
        this.creditGroups.add(creditGroup);
    }

    public List<CreditGuarantor> getCreditGuarantors() {
        return creditGuarantors;
    }

    public void setCreditGuarantors(List<CreditGuarantor> creditGuarantors) {
        this.creditGuarantors = creditGuarantors;
    }

    public void addCreditGuarantors(CreditGuarantor creditGuarantor) {
        if(this.creditGuarantors == null) {
            this.setCreditGuarantors(new ArrayList<>());
        }
        this.creditGuarantors.add(creditGuarantor);    }


    public List<CreditSettlement> getCreditSettlements() {
        return creditSettlements;
    }

    public void setCreditSettlements(List<CreditSettlement> creditSettlements) {
        this.creditSettlements = creditSettlements;
    }
}
