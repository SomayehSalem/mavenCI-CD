package com.restService.model.base.dto.sepam;

import com.restService.model.base.dto.sepam.baseinfo.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SEPAM_TBLLC", schema = "", catalog = "")
public class DocumentaryCredit implements Serializable {

    @Id
    @Column(name = "LCCODE", nullable = false, length = 16)
    private String lccode;
    @ManyToOne
    @JoinColumn(name = "LCTYPE", nullable = false)
    private CreditLcType lctype;
    @Column(name = "BNKCODE", nullable = false, length = 4)
    private String bnkcode;
//    @Column(name = "CURRDATE", nullable = false, length = 4)
//    private String currdate;
    @Column(name = "BRCODE", nullable = false, length = 5)
    private String brcode;
//    @Column(name = "FNAME", nullable = false, length = 66)
//    private String fname;
//    @Column(name = "LNAME", nullable = true, length = 66)
//    private String lname;
    @Column(name = "NATIDNO", nullable = false, length = 13)
    private String natidno;
//    @Column(name = "IDNO", nullable = false, length = 13)
//    private String idno;
//    @Column(name = "BTHDATE", nullable = false, length = 10)
//    private String bthdate;
//    @Column(name = "CITYCODE", nullable = false, length = 10)
//    private String citycode;
//    @Column(name = "AMOUNT", nullable = true, precision = 4)
//    private Long amount;
//    @Column(name = "OPTINFO", nullable = true, length = 60)
//    private String optinfo;
//    @ManyToOne
//    @JoinColumn(name = "STATCODE", nullable = false)
//    private CreditStatus statcode;
//    @Column(name = "GENDATE", nullable = false, length = 8)
//    private String gendate;
    @Column(name = "USEDATE", nullable = true, length = 8)
    private String usedate;
    @Column(name = "EXPDATE", nullable = true, length = 8)
    private String expdate;
//    @Column(name = "REFIDGEN", nullable = false, length = 29)
//    private String refidgen;
//    @Column(name = "REFIDUSE", nullable = true, length = 29)
//    private String refiduse;


    @ManyToOne
    @JoinColumn(name = "CUSTYPE", nullable = false)
    private CreditCustType custype;

    @Column(name = "MT700AMT", nullable = true, precision = 4)
    private Long mt700Amt;
//    @ManyToOne
//    @JoinColumn(name = "MT700TYPE", nullable = true)
//    private CreditMt700type mt700Type;
//    @ManyToOne
//    @JoinColumn(name = "MT700PTYPE", nullable = true)
//    private CreditMt700ptype mt700Ptype;
//    @Column(name = "MT700OIDATE", nullable = true, length = 8)
//    private String mt700Oidate;
//    @ManyToOne
//    @JoinColumn(name = "MT700ORTYPE", nullable = true)
//    private CreditMt700ortype mt700Ortype;
//    @Column(name = "MT700OABANK", nullable = true, length = 34)
//    private String mt700Oabank;
//    @Column(name = "MT700OAFNAME", nullable = true, length = 66)
//    private String mt700Oafname;
//    @Column(name = "MT700OALNAME", nullable = true, length = 66)
//    private String mt700Oalname;
//    @Column(name = "MT700OANIDNO", nullable = true, length = 13)
//    private String mt700Oanidno;
//    @Column(name = "MT700OBACNO", nullable = true, length = 26)
//    private String mt700Obacno;
//    @Column(name = "MT700OBFNAME", nullable = true, length = 66)
//    private String mt700Obfname;
//    @Column(name = "MT700OBLNAME", nullable = true, length = 66)
//    private String mt700Oblname;
    @Column(name = "MT700OBNIDNO", nullable = true, length = 13)
    private String mt700Obnidno;
//    @ManyToOne
//    @JoinColumn(name = "MT700OCINSTR", nullable = true)
//    private CreditMt700ocinstr mt700Ocinstr;
//    @Column(name = "MT700ORBANK", nullable = true, length = 11)
//    private String mt700Orbank;
//    @Column(name = "MT700SENDER", nullable = true, length = 11)
//    private String mt700Sender;
//    @Column(name = "MT700RECEIVER", nullable = true, length = 11)
//    private String mt700Receiver;
//    @Column(name = "MT700EXPDATE", nullable = true, length = 8)
//    private String mt700Expdate;
//    @Id
//    @Column(name = "ID", nullable = true, precision = 0)
//    private Long id;


    public String getLccode() {
        return lccode;
    }

    public void setLccode(String lccode) {
        this.lccode = lccode;
    }

    public String getBnkcode() {
        return bnkcode;
    }

    public void setBnkcode(String bnkcode) {
        this.bnkcode = bnkcode;
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

    public Long getMt700Amt() {
        return mt700Amt;
    }

    public void setMt700Amt(Long mt700Amt) {
        this.mt700Amt = mt700Amt;
    }

    public CreditLcType getLctype() {
        return lctype;
    }

    public void setLctype(CreditLcType lctype) {
        this.lctype = lctype;
    }

    public CreditCustType getCustype() {
        return custype;
    }

    public void setCustype(CreditCustType custype) {
        this.custype = custype;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
}
