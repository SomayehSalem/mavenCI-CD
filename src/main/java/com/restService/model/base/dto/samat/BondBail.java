package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VZEMFILE2", schema = "")
public class BondBail implements Serializable {

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Bond bond; // idTtn;

    @Column(name = "TP_GAGE", nullable = true, length = 2)
    private String tpGage;

    @Column(name = "AM_GAGE", nullable = true, precision = 0)
    private Long amGage;

    @Column(name = "GAGE_NO", nullable = true, length = 1)
    private String gageNo;

    @Id
    @Column(name = "ID", nullable = false, precision = 0)
    private long id;

    public Bond getBond() {
        return bond;
    }

    public void setBond(Bond bond) {
        this.bond = bond;
    }

    public String getTpGage() {
        return tpGage;
    }

    public void setTpGage(String tpGage) {
        this.tpGage = tpGage;
    }

    public Long getAmGage() {
        return amGage;
    }

    public void setAmGage(Long amGage) {
        this.amGage = amGage;
    }

    public String getGageNo() {
        return gageNo;
    }

    public void setGageNo(String gageNo) {
        this.gageNo = gageNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

