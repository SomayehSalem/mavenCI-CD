package com.restService.model.base.dto.cheque;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.restService.model.base.dto.samat.FacilityBail;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "CHQ_CHEQUEFILE1", schema = "", catalog = "")
public class ChequeInfo implements Serializable {


    @Column(name = "CD_BNK", nullable = true, length = 20)
    private String cdBnk;
//    @Column(name = "CD_SHB", nullable = true, length = 5)
//    private String cdShb;
//    @Column(name = "TP_CSTMR", nullable = true, length = 1)
//    private String tpCstmr;
//    @Column(name = "LNAME", nullable = true, length = 120)
//    private String lname;
//    @Column(name = "NAME", nullable = true, length = 20)
//    private String name;
    @Column(name = "ID_NO", nullable = true, length = 10)
    private String idNo;
//    @Column(name = "LGLID", nullable = true, length = 11)
//    private String lglid;
//    @Column(name = "NO_SHN", nullable = true, length = 10)
//    private String noShn;
//    @Column(name = "DT_BRTH", nullable = true, length = 8)
//    private String dtBrth;
//    @Column(name = "CD_SDR", nullable = true, length = 3)
//    private String cdSdr;
//    @Column(name = "ACCNT_NO", nullable = true, length = 18)
//    private String accntNo;
//    @Column(name = "NO_CHQ", nullable = true, length = 10)
//    private String noChq;
//    @Column(name = "AM_CHQ", nullable = true, precision = 0)
//    private Long amChq;
    @Column(name = "DT_CHQ", nullable = true, length = 8)
    private String dtChq;
//    @Column(name = "BCKDT_CHQ", nullable = true, length = 8)
//    private String bckdtChq;
//    @Column(name = "CD_ARZ", nullable = true, length = 3)
//    private String cdArz;
//    @Column(name = "CONV_RATE", nullable = true, precision = 0)
//    private Long convRate;
    @JsonIgnore
    @Column(name = "TPRTRN1", nullable = true, precision = 0)
    private String tprtrn1;
    @JsonIgnore
    @Column(name = "TPRTRN2", nullable = true, precision = 0)
    private String tprtrn2;
    @JsonIgnore
    @Column(name = "TPRTRN3", nullable = true, precision = 0)
    private String tprtrn3;
    @JsonIgnore
    @Column(name = "TPRTRN4", nullable = true, precision = 0)
    private String tprtrn4;
    @JsonIgnore
    @Column(name = "TPRTRN5", nullable = true, precision = 0)
    private String tprtrn5;
//    @Column(name = "ID_CHQ", nullable = true, precision = 0)
//    private Long idChq;
    @JsonManagedReference
    @OneToMany(mappedBy = "cheque")
    private List<ChequeComplementary> chequeComplementaries;
    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private long id;

    @Transient
    private String tprtrn;

    public List<ChequeComplementary> getChequeComplementaries() {
        return chequeComplementaries;
    }

    public void setChequeComplementaries(List<ChequeComplementary> chequeComplementaries) {
        this.chequeComplementaries = chequeComplementaries;
    }

    public String getCdBnk() {
        return cdBnk;
    }

    public void setCdBnk(String cdBnk) {
        this.cdBnk = cdBnk;
    }

    public String getDtChq() {
        return dtChq;
    }

    public void setDtChq(String dtChq) {
        this.dtChq = dtChq;
    }

    public String getTprtrn1() {
        return tprtrn1;
    }

    public void setTprtrn1(String tprtrn1) {
        this.tprtrn1 = tprtrn1;
    }

    public String getTprtrn2() {
        return tprtrn2;
    }

    public void setTprtrn2(String tprtrn2) {
        this.tprtrn2 = tprtrn2;
    }

    public String getTprtrn3() {
        return tprtrn3;
    }

    public void setTprtrn3(String tprtrn3) {
        this.tprtrn3 = tprtrn3;
    }

    public String getTprtrn4() {
        return tprtrn4;
    }

    public void setTprtrn4(String tprtrn4) {
        this.tprtrn4 = tprtrn4;
    }

    public String getTprtrn5() {
        return tprtrn5;
    }

    public void setTprtrn5(String tprtrn5) {
        this.tprtrn5 = tprtrn5;
    }

    public String getTprtrn() {
        return tprtrn1 + "," + tprtrn2 + "," + tprtrn3 + "," + tprtrn4 + "," + tprtrn5;
    }

    public void setTprtrn(String tprtrn) {
        this.tprtrn = tprtrn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
