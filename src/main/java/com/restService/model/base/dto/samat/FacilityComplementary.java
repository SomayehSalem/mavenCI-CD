package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VTASFILE2", schema = "", catalog = "")
public class FacilityComplementary implements Serializable {

//    @Column(name = "TP_USE", nullable = true, length = 2)
//    private String tpUse;
//    @Column(name = "PRSN_NUM", nullable = true, length = 1)
//    private String prsnNum;
//    @Column(name = "EQNMC_PRT", nullable = true, length = 2)
//    private String eqnmcPrt;
//    @Column(name = "EQNMC_DTL", nullable = true, length = 4)
//    private String eqnmcDtl;
//    @Column(name = "TP_OWNR", nullable = true, length = 1)
//    private String tpOwnr;
//    @Column(name = "CD_LOCCNSM", nullable = true, length = 3)
//    private String cdLoccnsm;
//    @Column(name = "TAS_PRVTS", nullable = true, length = 1)
//    private String tasPrvts;
    @Column(name = "RCV_MEAN", nullable = true, length = 2)
    private String rcvMean;
//    @Column(name = "QEST_NUM", nullable = true, precision = 0)
//    private Long qestNum;
//    @Column(name = "PRCNT_BNK", nullable = true, precision = 0)
//    private Byte prcntBnk;
//    @Column(name = "PRG_NO", nullable = true, length = 3)
//    private String prgNo;
//    @Column(name = "PRG_MADDE", nullable = true, length = 3)
//    private String prgMadde;
//    @Column(name = "BDJ_YR", nullable = true, length = 4)
//    private String bdjYr;
//    @Column(name = "BDJ_TBSR", nullable = true, length = 3)
//    private String bdjTbsr;
//    @Column(name = "BDJ_BAND", nullable = true, length = 3)
//    private String bdjBand;
//    @Column(name = "TP_TRHTAS", nullable = true, length = 2)
//    private String tpTrhtas;
//    @Column(name = "TASTAM_RESRC", nullable = true, length = 2)
//    private String tastamResrc;
//    @Column(name = "CD_SHB", nullable = true, length = 5)
//    private String cdShb;
//    @Column(name = "CD_BNK", nullable = true, length = 2)
//    private String cdBnk;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Facility facility; // idTtn;
    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

    public String getRcvMean() {
        return rcvMean;
    }

    public void setRcvMean(String rcvMean) {
        this.rcvMean = rcvMean;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
