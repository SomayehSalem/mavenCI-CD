package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VZEMFILE4", schema = "", catalog = "")
public class BondGroup implements Serializable {

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Bond bond; // idTtn;

    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;

    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;

    @Column(name = "TP_CSTMR", nullable = true, precision = 0)
    private Long tpCstmr;

    @Column(name = "SHAHABCD", nullable = true, length = 16)
    private String shahabcd;

    @Column(name = "ID_MAIN", nullable = true, length = 255)
    private String idMain;

    @Column(name = "GRP_TYP", nullable = true, length = 1)
    private String grpTyp;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private long id;

    public Bond getBond() {
        return bond;
    }

    public void setBond(Bond bond) {
        this.bond = bond;
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

    public String getGrpTyp() {
        return grpTyp;
    }

    public void setGrpTyp(String grpTyp) {
        this.grpTyp = grpTyp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}

