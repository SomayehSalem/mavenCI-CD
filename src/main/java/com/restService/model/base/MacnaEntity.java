package com.restService.model.base;

import javax.persistence.*;
import java.io.Serializable;

import java.util.Date;

/**
 * Created by S_Salem on 10/3/2020.
 */
@Entity
@Table(name = "MACNA", schema = "", catalog = "")
public class MacnaEntity implements Serializable {
    private String name;
    private String family;
    private String nationalid;
    private String fathersname;
    private String gender;
    private String birthdate;
    private String cardno;
    private String accountdate;
    private String serialid;
    private String seriid;
    private String citycode;
    private String cardissudate;
    private String issudate;
    private String creditlimit;
    private String expdate;
    private String GAGE;
    private String currency;
    private String creditused;
    private String residualcredit;
    private String customerstatus;
    private String id;


    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Column(name = "FAMILY")
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }


    @Column(name = "NATIONALID")
    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }


    @Column(name = "FATHERSNAME")
    public String getFathersname() {
        return fathersname;
    }

    public void setFathersname(String fathersname) {
        this.fathersname = fathersname;
    }


    @Column(name = "GENDER")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    @Column(name = "BIRTHDATE")
    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }


    @Column(name = "CARDNO")
    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }


    @Column(name = "ACCOUNTDATE")
    public String getAccountdate() {
        return accountdate;
    }

    public void setAccountdate(String accountdate) {
        this.accountdate = accountdate;
    }


    @Column(name = "SERIALID")
    public String getSerialid() {
        return serialid;
    }

    public void setSerialid(String serialid) {
        this.serialid = serialid;
    }


    @Column(name = "SERIID")
    public String getSeriid() {
        return seriid;
    }

    public void setSeriid(String seriid) {
        this.seriid = seriid;
    }


    @Column(name = "CITYCODE")
    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }


    @Column(name = "CARDISSUDATE")
    public String getCardissudate() {
        return cardissudate;
    }

    public void setCardissudate(String cardissudate) {
        this.cardissudate = cardissudate;
    }


    @Column(name = "ISSUDATE")
    public String getIssudate() {
        return issudate;
    }

    public void setIssudate(String issudate) {
        this.issudate = issudate;
    }


    @Column(name = "CREDITLIMIT")
    public String getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(String creditlimit) {
        this.creditlimit = creditlimit;
    }


    @Column(name = "EXPDATE")
    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }


    @Column(name = "GAGE")
    public String getGAGE() {
        return GAGE;
    }

    public void setGAGE(String GAGE) {
        this.GAGE = GAGE;
    }


    @Column(name = "CURRENCY")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }


    @Column(name = "CREDITUSED")
    public String getCreditused() {
        return creditused;
    }

    public void setCreditused(String creditused) {
        this.creditused = creditused;
    }


    @Column(name = "RESIDUALCREDIT")
    public String getResidualcredit() {
        return residualcredit;
    }

    public void setResidualcredit(String residualcredit) {
        this.residualcredit = residualcredit;
    }


    @Column(name = "CUSTOMERSTATUS")
    public String getCustomerstatus() {
        return customerstatus;
    }

    public void setCustomerstatus(String customerstatus) {
        this.customerstatus = customerstatus;
    }


    @Id
    @Column(name = "ID")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




}
