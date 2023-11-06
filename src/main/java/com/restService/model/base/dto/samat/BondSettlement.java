package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VZEMFILE5", schema = "", catalog = "")
public class BondSettlement implements Serializable {

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Bond bond; // idTtn;
    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;
    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;
    @Column(name = "DT_PAY", nullable = true, length = 8)
    private String dtPay;
    @Column(name = "CD_ACT", nullable = true, length = 1)
    private String cdAct;
    @Column(name = "RMTOTAL", nullable = true, precision = 0)
    private Long rmtotal;
    @Column(name = "RMMSHK", nullable = true, precision = 0)
    private Long rmmshk;
    @Column(name = "RMSKHT", nullable = true, precision = 0)
    private Long rmskht;
    @Column(name = "RMTHD", nullable = true, precision = 0)
    private Long rmthd;
    @Column(name = "ELTZM_TKHR", nullable = true, precision = 0)
    private Long eltzmTkhr;
    @Column(name = "GRM_DRKRD", nullable = true, precision = 0)
    private Long grmDrkrd;
    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

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

    public String getDtPay() {
        return dtPay;
    }

    public void setDtPay(String dtPay) {
        this.dtPay = dtPay;
    }

    public String getCdAct() {
        return cdAct;
    }

    public void setCdAct(String cdAct) {
        this.cdAct = cdAct;
    }

    public Long getRmtotal() {
        return rmtotal;
    }

    public void setRmtotal(Long rmtotal) {
        this.rmtotal = rmtotal;
    }

    public Long getRmmshk() {
        return rmmshk;
    }

    public void setRmmshk(Long rmmshk) {
        this.rmmshk = rmmshk;
    }

    public Long getRmskht() {
        return rmskht;
    }

    public void setRmskht(Long rmskht) {
        this.rmskht = rmskht;
    }

    public Long getRmthd() {
        return rmthd;
    }

    public void setRmthd(Long rmthd) {
        this.rmthd = rmthd;
    }

    public Long getEltzmTkhr() {
        return eltzmTkhr;
    }

    public void setEltzmTkhr(Long eltzmTkhr) {
        this.eltzmTkhr = eltzmTkhr;
    }

    public Long getGrmDrkrd() {
        return grmDrkrd;
    }

    public void setGrmDrkrd(Long grmDrkrd) {
        this.grmDrkrd = grmDrkrd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

