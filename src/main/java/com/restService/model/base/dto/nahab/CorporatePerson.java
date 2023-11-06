package com.restService.model.base.dto.nahab;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by EDW on 4/12/2021.
 */
@Entity
@Table(name = "TB_CORPORATE_PERSON", schema = "", catalog = "")
public class CorporatePerson {

    @Id
    @Column(name = "NATIONAL_ID", nullable = true, length = 300)
    private String nationalId;

    @Column(name = "SHAHAB_ID", nullable = true, length = 300)
    private String shahabId;

    @Column(name = "LEGAL_TYPE", nullable = true, length = 300)
    private String legalType;

    @Column(name = "ESTABLISHMENT_DATE", nullable = true, length = 300)
    private String establishmentDate;

    @Column(name = "REGISTER_DATE", nullable = true, length = 300)
    private String registerDate;

    @Column(name = "BREAK_UP_DATE", nullable = true, length = 300)
    private String breakUpDate;

    @Column(name = "IS_SETTLE", nullable = true, length = 300)
    private String isSettle;

    @Column(name = "IS_BREAKUP", nullable = true, length = 300)
    private String isBreakUp;

    @Column(name = "IS_BANKRUPT", nullable = true, length = 300)
    private String isBankRupt;

    @Column(name = "IS_VALID", nullable = true, length = 300)
    private String isValid;

//    @JsonIgnore
//    @ManyToOne
//    @JoinColumns({
//            @JoinColumn(name = "NATIONAL_ID", insertable = false, updatable = false),
//            @JoinColumn(name = "SHAHAB_ID", insertable = false, updatable = false)
//    })
//    private NahabInfo nahab;

    @Transient
    private String status;

//    public NahabInfo getNahab() {
//        return nahab;
//    }
//
//    public void setNahab(NahabInfo nahab) {
//        this.nahab = nahab;
//    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getShahabId() {
        return shahabId;
    }

    public void setShahabId(String shahabId) {
        this.shahabId = shahabId;
    }

    public String getLegalType() {
        return legalType;
    }

    public void setLegalType(String legalType) {
        this.legalType = legalType;
    }

    public String getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getBreakUpDate() {
        return breakUpDate;
    }

    public void setBreakUpDate(String breakUpDate) {
        this.breakUpDate = breakUpDate;
    }


    public Boolean getIsSettle() {
        return "1".equals(isSettle);
    }

    public void setIsSettle(Boolean isSettle) {
        this.isSettle = isSettle  ? "1" : "0";
    }

    public Boolean getIsBreakUp() {
        return  "1".equals(isBreakUp);
    }

    public void setIsBreakUp(Boolean isBreakUp) {
        this.isBreakUp = isBreakUp ? "1" : "0";
    }

    public Boolean getIsBankRupt() {
        return "1".equals(isBankRupt);
    }

    public void setIsBankRupt(Boolean isBankRupt) {
        this.isBankRupt = isBankRupt  ? "1" : "0";
    }

    public Boolean getIsValid() {
        return "1".equals(this.isValid);
    }

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid  ? "1" : "0";
    }

    public String getStatus() {
        return Boolean.TRUE.equals(this.getIsValid()) ? "فعال" : Boolean.TRUE.equals(this.getIsBreakUp()) ? "منحل شده" : Boolean.TRUE.equals(this.getIsBankRupt()) ? "ورشکسته" : "نامشخص";
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
