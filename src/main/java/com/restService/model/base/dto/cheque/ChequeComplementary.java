package com.restService.model.base.dto.cheque;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CHQ_VCHEQUEFILE2", schema = "", catalog = "")
public class ChequeComplementary implements Serializable {

//    @Column(name = "CD_BNK", nullable = true, length = 2)
//    private String cdBnk;
//    @Column(name = "CD_SHB", nullable = true, length = 5)
//    private String cdShb;
//    @Id
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_CHQ")
    private ChequeInfo cheque;
//    @Column(name = "ID_CHQ", nullable = true, precision = 0)
//    private Long idChq;
    @Column(name = "DT_TMN", nullable = true, length = 8)
    private String dtTmn;
//    @Column(name = "TP_TMN", nullable = true, length = 1)
//    private String tpTmn;
//    @Column(name = "ACCNT_NO", nullable = true, length = 18)
//    private String accntNo;
//    @Column(name = "NO_CHQ", nullable = true, length = 10)
//    private String noChq;
//    @Column(name = "AM_CHQ", nullable = true, precision = 0)
//    private Long amChq;
//    @Column(name = "DT_CHQ", nullable = true, length = 8)
//    private String dtChq;
//    @Column(name = "BCKDT_CHQ", nullable = true, length = 8)
//    private String bckdtChq;
//    @Column(name = "CD_ARZ", nullable = true, length = 3)
//    private String cdArz;
//    @Column(name = "CONV_RATE", nullable = true, precision = 0)
//    private Long convRate;
//    @Column(name = "TPRTRN1", nullable = true, precision = 0)
//    private Long tprtrn1;
//    @Column(name = "TPRTRN2", nullable = true, precision = 0)
//    private Long tprtrn2;
//    @Column(name = "TPRTRN3", nullable = true, precision = 0)
//    private Long tprtrn3;
//    @Column(name = "TPRTRN4", nullable = true, precision = 0)
//    private Long tprtrn4;
//    @Column(name = "TPRTRN5", nullable = true, precision = 0)
//    private Long tprtrn5;
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
    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

    public ChequeInfo getCheque() {
        return cheque;
    }

    public void setCheque(ChequeInfo cheque) {
        this.cheque = cheque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDtTmn() {
        return dtTmn;
    }

    public void setDtTmn(String dtTmn) {
        this.dtTmn = dtTmn;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }
}
