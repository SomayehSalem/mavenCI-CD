package com.restService.model.base.dto.nahab;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
@Entity
@Table(name = "DIM_NAHAB", schema = "", catalog = "")
@IdClass(NahabPK.class)
public class NahabInfo implements Serializable {

    @Id
    @Column(name = "SHAHAB_ID", nullable = true, length = 300)
    private String shahabId;
    @Id
    @Column(name = "NATIONAL_ID", nullable = true, length = 300)
    private String nationalId;
    @Column(name = "FIRST_NAME", nullable = true, length = 300)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = true, length = 300)
    private String lastName;
    @Column(name = "FATHER_NAME", nullable = true, length = 300)
    private String fatherName;
    @Column(name = "IS_NATURAL", nullable = true, length = 300)
    private String isNatural;
    @Column(name = "IS_MALE", nullable = true, length = 300)
    private boolean isMale;
    @Column(name = "BIRTH_DATE", nullable = true, length = 300)
    private String birthDate;
    @Column(name = "BIRTH_LOCATION", nullable = true, length = 300)
    private String birthLocation;
    @Column(name = "ID_NUMBER", nullable = true, length = 300)
    private String idNumber;
    @Column(name = "POSTAL_CODE", nullable = true, length = 300)
    private String postalCode;
    @Column(name = "POSTAL_ADDRESS", nullable = true, length = 300)
    private String postalAddress;

    @Transient
    private CorporatePerson corporatePerson;

//    public CorporatePerson getCorporatePerson() {
//        if(corporatePersons != null && corporatePersons.size() > 0)
//            return corporatePersons.get(0);
//        else
//            return null;
//    }

    public void setCorporatePerson(CorporatePerson corporatePerson) {
        this.corporatePerson = corporatePerson;
    }

    public String getIsNatural() {
        return isNatural;
    }

    public void setIsNatural(String isNatural) {
        this.isNatural = isNatural;
    }

//    public List<CorporatePerson> getCorporatePersons() {
//        return corporatePersons;
//    }
//
//    public void setCorporatePersons(List<CorporatePerson> corporatePersons) {
//        this.corporatePersons = corporatePersons;
//    }

    public String getShahabId() {
        return shahabId;
    }

    public void setShahabId(String shahabId) {
        this.shahabId = shahabId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public boolean getIsMale() {
        return isMale ;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }


    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public com.restService.model.base.dto.nahab.legal.NahabInfo getLegalNahabInfo(CorporatePerson corporatePerson) {
        com.restService.model.base.dto.nahab.legal.NahabInfo nahabInfo = new com.restService.model.base.dto.nahab.legal.NahabInfo();
        nahabInfo.setShahabId(this.getShahabId());
        nahabInfo.setNationalId(this.getNationalId());
        nahabInfo.setFirstName(this.getFirstName());
        nahabInfo.setEstablishmentLocation(this.getBirthLocation());
        nahabInfo.setIdNumber(this.getIdNumber());
        nahabInfo.setPostalCode(this.getPostalCode());
        nahabInfo.setPostalAddress(this.getPostalAddress());
        nahabInfo.setRegisterLocation(this.getBirthLocation());
        if(corporatePerson != null) {
            nahabInfo.setIsSettle(corporatePerson.getIsSettle());
            nahabInfo.setBreakUpDate(corporatePerson.getBreakUpDate());
            nahabInfo.setRegisterDate(corporatePerson.getRegisterDate());
            nahabInfo.setLegalType(corporatePerson.getLegalType());
            nahabInfo.setStatus(corporatePerson.getStatus());
        }
        return nahabInfo;
    }

    public com.restService.model.base.dto.nahab.natural.NahabInfo getNaturalNahabInfo() {
        com.restService.model.base.dto.nahab.natural.NahabInfo nahabInfo = new com.restService.model.base.dto.nahab.natural.NahabInfo();
        nahabInfo.setShahabId(this.getShahabId());
        nahabInfo.setNationalId(this.getNationalId());
        nahabInfo.setFirstName(this.getFirstName());
        nahabInfo.setLastName(this.getLastName());
        nahabInfo.setFatherName(this.getFatherName());
        nahabInfo.setBirthDate(this.getBirthDate());
        nahabInfo.setBirthLocation(this.getBirthLocation());
        nahabInfo.setPostalCode(this.getPostalCode());
        nahabInfo.setPostalAddress(this.getPostalAddress());
        nahabInfo.setIsMale(this.getIsMale());
//        nahabInfo.setIsMale("0".equals(this.getIsMale()) ? false : true);
        return nahabInfo;
    }
}
