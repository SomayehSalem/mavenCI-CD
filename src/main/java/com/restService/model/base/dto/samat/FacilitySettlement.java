package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VTASFILE3", schema = "", catalog = "")
public class FacilitySettlement implements Serializable {

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Facility facility; // idTtn;
    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;
    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;
    @Column(name = "DT_PAY", nullable = true, length = 8)
    private String dtPay;
    @Column(name = "CD_ACT", nullable = true, length = 1)
    private String cdAct;
    @Column(name = "RMORG", nullable = true, precision = 0)
    private Long rmorg;
    @Column(name = "RMBNFT", nullable = true, precision = 0)
    private Long rmbnft;
    @Column(name = "MATORG", nullable = true, precision = 0)
    private Long matorg;
    @Column(name = "MATBNFT", nullable = true, precision = 0)
    private Long matbnft;
    @Column(name = "MVQORG", nullable = true, precision = 0)
    private Long mvqorg;
    @Column(name = "MVQBNFT", nullable = true, precision = 0)
    private Long mvqbnft;
    @Column(name = "MSHKORG", nullable = true, precision = 0)
    private Long mshkorg;
    @Column(name = "MSHKBNFT", nullable = true, precision = 0)
    private Long mshkbnft;
    @Column(name = "SKHTORG", nullable = true, precision = 0)
    private Long skhtorg;
    @Column(name = "ELTZM_TKHR", nullable = true, precision = 0)
    private Long eltzmTkhr;
    @Column(name = "GRM_DRKRD", nullable = true, precision = 0)
    private Long grmDrkrd;
    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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

    public Long getRmorg() {
        return rmorg;
    }

    public void setRmorg(Long rmorg) {
        this.rmorg = rmorg;
    }

    public Long getRmbnft() {
        return rmbnft;
    }

    public void setRmbnft(Long rmbnft) {
        this.rmbnft = rmbnft;
    }

    public Long getMatorg() {
        return matorg;
    }

    public void setMatorg(Long matorg) {
        this.matorg = matorg;
    }

    public Long getMatbnft() {
        return matbnft;
    }

    public void setMatbnft(Long matbnft) {
        this.matbnft = matbnft;
    }

    public Long getMvqorg() {
        return mvqorg;
    }

    public void setMvqorg(Long mvqorg) {
        this.mvqorg = mvqorg;
    }

    public Long getMvqbnft() {
        return mvqbnft;
    }

    public void setMvqbnft(Long mvqbnft) {
        this.mvqbnft = mvqbnft;
    }

    public Long getMshkorg() {
        return mshkorg;
    }

    public void setMshkorg(Long mshkorg) {
        this.mshkorg = mshkorg;
    }

    public Long getMshkbnft() {
        return mshkbnft;
    }

    public void setMshkbnft(Long mshkbnft) {
        this.mshkbnft = mshkbnft;
    }

    public Long getSkhtorg() {
        return skhtorg;
    }

    public void setSkhtorg(Long skhtorg) {
        this.skhtorg = skhtorg;
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

