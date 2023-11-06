package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VTASFILE4", schema = "", catalog = "")
public class FacilityGuarantor implements Serializable {

//    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Facility facility; // idTtn;

    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;

    @Column(name = "CD_SHB", nullable = true, length = 5)
    private String cdShb;

    @Column(name = "TP_CSTMR", nullable = true, precision = 0)
    private Long tpCstmr;

    @Column(name = "SHAHABCD", nullable = true, length = 16)
    private String shahabcd;

    @Column(name = "ID_MAIN", nullable = true, precision = 0)
    private Long idMain;

    @Column(name = "PRCNT_ZEM", nullable = true, precision = 0)
    private Byte prcntZem;

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

    public Long getIdMain() {
        return idMain;
    }

    public void setIdMain(Long idMain) {
        this.idMain = idMain;
    }

    public Byte getPrcntZem() {
        return prcntZem;
    }

    public void setPrcntZem(Byte prcntZem) {
        this.prcntZem = prcntZem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

