package com.restService.model.tahlil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by s_homayouni on 5/26/2021.
 */
@Entity
@Table(name = "TBL_SAMT_WEB_SERVICE", schema = "", catalog = "")
public class ChequeTotal implements Serializable {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "NATONAL_ID")
    private String nationalId;

    @Column(name = "CUST_TYP")
    private String custType;

    @Column(name = "CUST_NAME")
    private String custName;

    @Column(name = "AMNT_INSIDE_BANKS")
    private String amntInsideBanks;

    @Column(name = "AMNT_CMS")
    private String amntCms;

    @Column(name = "CNT_INSIDE_BANKS")
    private String cntInsideBanks;

    @Column(name = "CNT_CMS")
    private String cntCms;

    @Column(name = "AMNT_SAYAD")
    private String amntSayad;

    @Column(name = "CNT_SAYAD")
    private String cntSayad;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getAmntInsideBanks() {
        return amntInsideBanks;
    }

    public void setAmntInsideBanks(String amntInsideBanks) {
        this.amntInsideBanks = amntInsideBanks;
    }

    public String getAmntCms() {
        return amntCms;
    }

    public void setAmntCms(String amntCms) {
        this.amntCms = amntCms;
    }

    public String getCntInsideBanks() {
        return cntInsideBanks;
    }

    public void setCntInsideBanks(String cntInsideBanks) {
        this.cntInsideBanks = cntInsideBanks;
    }

    public String getCntCms() {
        return cntCms;
    }

    public void setCntCms(String cntCms) {
        this.cntCms = cntCms;
    }

    public String getAmntSayad() {
        return amntSayad;
    }

    public void setAmntSayad(String amntSayad) {
        this.amntSayad = amntSayad;
    }

    public String getCntSayad() {
        return cntSayad;
    }

    public void setCntSayad(String cntSayad) {
        this.cntSayad = cntSayad;
    }
}