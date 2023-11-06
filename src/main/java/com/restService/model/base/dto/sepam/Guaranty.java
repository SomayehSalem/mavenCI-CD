package com.restService.model.base.dto.sepam;

import com.restService.model.base.dto.sepam.baseinfo.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SEPAM_TBLLG", schema = "", catalog = "")
public class Guaranty implements Serializable {

    @Id
    @Column(name = "LGCODE", nullable = false, length = 16)
    private String lgcode;
    @ManyToOne
    @JoinColumn(name = "CUSTYPE", nullable = false)
    private GuarantyCustType custype;
    @Column(name = "BNKCODE", nullable = false, length = 4)
    private String bnkcode;
    @ManyToOne
    @JoinColumn(name = "STATCODE", nullable = false)
    private GuarantyStatus statcode;
//    @ManyToOne
//    @JoinColumn(name = "ISSUSPENDED", nullable = false)
//    private GuarantySuspendFlag issuspended;
//    @ManyToOne
//    @JoinColumn(name = "ISTERMINATED", nullable = false)
//    private GuarantyTerminateFlag isterminated;
//    @ManyToOne
//    @JoinColumn(name = "ISDEBTOR", nullable = false)
//    private GuarantyDebtorFlag isdebtor;
//    @Column(name = "SENDERID", nullable = false, length = 11)
//    private String senderid;
    @Column(name = "BRCODE", nullable = false, length = 5)
    private String brcode;
//    @Column(name = "FNAME", nullable = false, length = 66)
//    private String fname;
//    @Column(name = "LNAME", nullable = false, length = 66)
//    private String lname;
    @Column(name = "NATIDNO", nullable = false, length = 13)
    private String natidno;
//    @Column(name = "IDNO", nullable = false, length = 13)
//    private String idno;
//    @Column(name = "BTHDATE", nullable = false, length = 8)
//    private String bthdate;
//    @Column(name = "CITYCODE", nullable = false, length = 10)
//    private String citycode;
    @Column(name = "AMOUNT", nullable = false, precision = 4)
    private String amount;
    @Column(name = "REMAINAMNT", nullable = false, precision = 4)
    private String remainamnt;
//    @Column(name = "PAIDAMOUNT", nullable = false, precision = 4)
//    private String paidamount;
//    @Column(name = "OPTINFO", nullable = true, length = 60)
//    private String optinfo;
//    @Column(name = "GENDATE", nullable = false, length = 8)
//    private String gendate;
    @Column(name = "USEDATE", nullable = true, length = 8)
    private String usedate;
//    @Column(name = "SETTLDATE", nullable = true, length = 8)
//    private String settldate;
//    @Column(name = "TERMINATEDATE", nullable = true, length = 8)
//    private String terminatedate;
//    @Column(name = "CODEEXPDATE", nullable = true, length = 8)
//    private String codeexpdate;
    @Column(name = "LGEXPDATE", nullable = true, length = 8)
    private String lgexpdate;
//    @Column(name = "LGSARRESIDDATE", nullable = true, length = 8)
//    private String lgsarresiddate;
//    @Column(name = "REFIDREQ", nullable = false, length = 29)
//    private String refidreq;
//    @Column(name = "REFIDGEN", nullable = false, length = 29)
//    private String refidgen;
//    @Column(name = "REFIDUSE", nullable = true, length = 29)
//    private String refiduse;
//    @Column(name = "SUSFLAG", nullable = true, length = 255)
//    private String susflag;
//    @Column(name = "MT760F32", nullable = true, precision = 4)
//    private String mt760F32;
    @Column(name = "MT760F40A", nullable = true, length = 16)
    private String mt760F40A;
//    @ManyToOne
//    @JoinColumn(name = "MT760F40C", nullable = true)
//    private GuarantyMt760f40c mt760F40C;
//    @ManyToOne
//    @JoinColumn(name = "MT760F40E", nullable = true)
//    private GuarantyMt760f40e mt760F40E;
//    @Column(name = "MT760F20", nullable = true, length = 16)
//    private String mt760F20;
//    @Column(name = "MT760F30", nullable = true, length = 8)
//    private String mt760F30;
//    @ManyToOne
//    @JoinColumn(name = "MT760F40B", nullable = true)
//    private GuarantyMt760f40b mt760F40B;
//    @Column(name = "MT760F31D", nullable = true, length = 8)
//    private String mt760F31D;
//    @Column(name = "MT760F71BCOST", nullable = true, precision = 4)
//    private String mt760F71Bcost;
//    @Column(name = "MT760AMOBILE", nullable = true, length = 11)
//    private String mt760Amobile;
//    @Column(name = "MT760AACNO", nullable = true, length = 26)
//    private String mt760Aacno;
//    @Column(name = "MT760APCODE", nullable = true, length = 10)
//    private String mt760Apcode;
//    @Column(name = "MT760ADDRESS", nullable = true, length = 255)
//    private String mt760Address;
//    @Column(name = "MT760BFNAME", nullable = true, length = 66)
//    private String mt760Bfname;
//    @Column(name = "MT760BLNAME", nullable = true, length = 66)
//    private String mt760Blname;
    @Column(name = "MT760BNIDNO", nullable = true, length = 13)
    private String mt760Bnidno;
//    @Column(name = "MT760BPCODE", nullable = true, length = 10)
//    private String mt760Bpcode;
//    @Column(name = "MT760BMOBILE", nullable = true, length = 11)
//    private String mt760Bmobile;
//    @Column(name = "MT760RECEIVER", nullable = true, length = 11)
//    private String mt760Receiver;
//    @Id
//    @Column(name = "ID", nullable = false, precision = 0)
//    private Long id;

    public String getLgcode() {
        return lgcode;
    }

    public void setLgcode(String lgcode) {
        this.lgcode = lgcode;
    }

    public GuarantyCustType getCustype() {
        return custype;
    }

    public void setCustype(GuarantyCustType custype) {
        this.custype = custype;
    }

    public String getBnkcode() {
        return bnkcode;
    }

    public void setBnkcode(String bnkcode) {
        this.bnkcode = bnkcode;
    }

    public GuarantyStatus getStatcode() {
        return statcode;
    }

    public void setStatcode(GuarantyStatus statcode) {
        this.statcode = statcode;
    }

    public String getBrcode() {
        return brcode;
    }

    public void setBrcode(String brcode) {
        this.brcode = brcode;
    }

    public String getNatidno() {
        return natidno;
    }

    public void setNatidno(String natidno) {
        this.natidno = natidno;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRemainamnt() {
        return remainamnt;
    }

    public void setRemainamnt(String remainamnt) {
        this.remainamnt = remainamnt;
    }

    public String getUsedate() {
        return usedate;
    }

    public void setUsedate(String usedate) {
        this.usedate = usedate;
    }

    public String getLgexpdate() {
        return lgexpdate;
    }

    public void setLgexpdate(String lgexpdate) {
        this.lgexpdate = lgexpdate;
    }

    public String getMt760F40A() {
        return mt760F40A;
    }

    public void setMt760F40A(String mt760F40A) {
        this.mt760F40A = mt760F40A;
    }

    public String getMt760Bnidno() {
        return mt760Bnidno;
    }

    public void setMt760Bnidno(String mt760Bnidno) {
        this.mt760Bnidno = mt760Bnidno;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
