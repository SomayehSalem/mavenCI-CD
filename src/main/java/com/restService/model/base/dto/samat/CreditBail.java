package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VETBRFILE2", schema = "", catalog = "")
public class CreditBail implements Serializable {

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "ID_TTN")
    private Credit credit; // idTtn;

    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;

    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;

    @Column(name = "TP_GAGE", nullable = true, length = 2)
    private String tpGage;

    @Column(name = "AM_GAGE", nullable = true, precision = 0)
    private Long amGage;

    @Column(name = "GAGE_NO", nullable = true, length = 1)
    private String gageNo;

    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
