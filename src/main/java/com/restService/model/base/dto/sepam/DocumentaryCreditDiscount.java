package com.restService.model.base.dto.sepam;

/**
 * Created by EDW on 2/13/2021.
 */

import com.restService.model.base.dto.sepam.baseinfo.DiscountCustType;
import com.restService.model.base.dto.sepam.baseinfo.DiscountStatus;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/13/2021.
 */
@Entity
@Table(name = "SEPAM_TBLDSCNT", schema = "", catalog = "")
public class DocumentaryCreditDiscount implements Serializable {


    @Id
    @Column(name = "DLCCODE", nullable = true, length = 255)
    private String dlccode;


    @Column(name = "LCCODE", nullable = true, length = 255)
    private String lccode;
    @ManyToOne
    @JoinColumn(name = "STATCODE", nullable = true)
    private DiscountStatus statcode;
    @Column(name = "CURRDATE", nullable = true, length = 255)
    private String currdate;
    @Column(name = "BRCODE", nullable = true, length = 255)
    private String brcode;
    @Column(name = "FNAME", nullable = true, length = 255)
    private String fname;
    @Column(name = "LNAME", nullable = true, length = 255)
    private String lname;
    @Column(name = "NATIDNO", nullable = true, length = 255)
    private String natidno;
    @Column(name = "IDNO", nullable = true, length = 255)
    private String idno;
    @Column(name = "BTHDATE", nullable = true, length = 255)
    private String bthdate;
    @Column(name = "CITYCODE", nullable = true, length = 255)
    private String citycode;
    @Column(name = "AMOUNT", nullable = true, length = 255)
    private String amount;
    @Column(name = "OPTINFO", nullable = true, length = 255)
    private String optinfo;
    @Column(name = "GENDATE", nullable = true, length = 255)
    private String gendate;
    @Column(name = "USEDATE", nullable = true, length = 255)
    private String usedate;
    @Column(name = "EXPDATE", nullable = true, length = 255)
    private String expdate;
    @Column(name = "DDNREFID", nullable = true, length = 255)
    private String ddnrefid;
    @Column(name = "RDNREFID", nullable = true, length = 255)
    private String rdnrefid;
    @Column(name = "DSCREFID", nullable = true, length = 255)
    private String dscrefid;
    @ManyToOne
    @JoinColumn(name = "CUSTYPE", nullable = true)
    private DiscountCustType custype;
    @Column(name = "SENDER", nullable = true, length = 255)
    private String sender;
    @Column(name = "RECEIVER", nullable = true, length = 255)
    private String receiver;
    @Column(name = "BNKCODE", nullable = true, length = 255)
    private String bnkcode;
//    @Id
//    @Column(name = "ID", nullable = true, length = 255)
//    private long id;

    public String getDlccode() {
        return dlccode;
    }

    public void setDlccode(String dlccode) {
        this.dlccode = dlccode;
    }

    public String getLccode() {
        return lccode;
    }

    public void setLccode(String lccode) {
        this.lccode = lccode;
    }

    public String getCurrdate() {
        return currdate;
    }

    public void setCurrdate(String currdate) {
        this.currdate = currdate;
    }

    public String getBrcode() {
        return brcode;
    }

    public void setBrcode(String brcode) {
        this.brcode = brcode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNatidno() {
        return natidno;
    }

    public void setNatidno(String natidno) {
        this.natidno = natidno;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getBthdate() {
        return bthdate;
    }

    public void setBthdate(String bthdate) {
        this.bthdate = bthdate;
    }

    public String getCitycode() {
        return citycode;
    }

    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getOptinfo() {
        return optinfo;
    }

    public void setOptinfo(String optinfo) {
        this.optinfo = optinfo;
    }

    public String getGendate() {
        return gendate;
    }

    public void setGendate(String gendate) {
        this.gendate = gendate;
    }

    public String getUsedate() {
        return usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = usedate;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getDdnrefid() {
        return ddnrefid;
    }

    public void setDdnrefid(String ddnrefid) {
        this.ddnrefid = ddnrefid;
    }

    public String getRdnrefid() {
        return rdnrefid;
    }

    public void setRdnrefid(String rdnrefid) {
        this.rdnrefid = rdnrefid;
    }

    public String getDscrefid() {
        return dscrefid;
    }

    public void setDscrefid(String dscrefid) {
        this.dscrefid = dscrefid;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getBnkcode() {
        return bnkcode;
    }

    public void setBnkcode(String bnkcode) {
        this.bnkcode = bnkcode;
    }

    public DiscountStatus getStatcode() {
        return statcode;
    }

    public void setStatcode(DiscountStatus statcode) {
        this.statcode = statcode;
    }

    public DiscountCustType getCustype() {
        return custype;
    }

    public void setCustype(DiscountCustType custype) {
        this.custype = custype;
    }
}
