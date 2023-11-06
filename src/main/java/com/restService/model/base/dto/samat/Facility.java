package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VTASFILE1", schema = "", catalog = "")
public class Facility implements Serializable {

    @Column(name = "CD_BNK", nullable = true, length = 2)
    private String cdBnk;
//    @Column(name = "CD_SHB", nullable = true, length = 5)
//    private String cdShb;
    @Column(name = "TP_CSTMR", nullable = true, precision = 0)
    private Long tpCstmr;
//    @Column(name = "SHAHABCD", nullable = true, length = 16)
//    private String shahabcd;
    @Column(name = "ID_MAIN", nullable = true, precision = 0)
    private String idMain;
    @Id
    @Column(name= "ID_TTN")
    private String idTtn; // idTtn;
    @Column(name = "DT_GHR", nullable = true, length = 8)
    private String dtGhr;
//    @Column(name = "DT_LSTMAT", nullable = true, length = 8)
//    private String dtLstmat;
//    @Column(name = "DT_FRSTMAT", nullable = true, length = 8)
//    private String dtFrstmat;
//    @Column(name = "CD_ARZ", nullable = true, length = 3)
//    private String cdArz;
//    @Column(name = "CONV_RATE", nullable = true, precision = 0)
//    private Long convRate;
//    @Column(name = "AM_ORG", nullable = true, precision = 0)
//    private Long amOrg;
//    @Column(name = "AM_BNFT", nullable = true, precision = 0)
//    private Long amBnft;
    @Column(name = "BNFT_RATE", nullable = true, precision = 3)
    private Long bnftRate;
//    @Column(name = "AM_GVRMNT", nullable = true, precision = 0)
//    private Long amGvrmnt;
//    @Column(name = "AM_GHR", nullable = true, precision = 0)
//    private Long amGhr;
    @Column(name = "TP_GHR", nullable = true, length = 2)
    private String tpGhr;
//    @Column(name = "TP_ARZTAS", nullable = true, length = 1)
//    private String tpArztas;
//    @Column(name = "STMHL", nullable = true, length = 1)
//    private String stmhl;
//    @Column(name = "DT_STMHL", nullable = true, length = 8)
//    private String dtStmhl;
//    @Column(name = "MALIAT_ESTNO", nullable = true, length = 14)
//    private String maliatEstno;
//    @Column(name = "DT_PAY", nullable = true, length = 8)
//    private String dtPay;
//    @Column(name = "CD_ACT", nullable = true, length = 1)
//    private String cdAct;
//    @Column(name = "RMORG", nullable = true, precision = 0)
//    private Long rmorg;
//    @Column(name = "RMBNFT", nullable = true, precision = 0)
//    private Long rmbnft;
//    @Column(name = "MATORG", nullable = true, precision = 0)
//    private Long matorg;
//    @Column(name = "MATBNFT", nullable = true, precision = 0)
//    private Long matbnft;
//    @Column(name = "MVQORG", nullable = true, precision = 0)
//    private Long mvqorg;
//    @Column(name = "MVQBNFT", nullable = true, precision = 0)
//    private Long mvqbnft;
//    @Column(name = "MSHKORG", nullable = true, precision = 0)
//    private Long mshkorg;
//    @Column(name = "MSHKBNFT", nullable = true, precision = 0)
//    private Long mshkbnft;
//    @Column(name = "SKHTORG", nullable = true, precision = 0)
//    private Long skhtorg;
//    @Column(name = "ELTZM_TKHR", nullable = true, precision = 0)
//    private Long eltzmTkhr;
//    @Column(name = "GRM_DRKRD", nullable = true, precision = 0)
//    private Long grmDrkrd;
//    @Id
//    @Column(name = "ID", nullable = true, precision = 0)
//    private Long id;
    @JsonManagedReference
    @OneToMany(mappedBy = "facility")
    private List<FacilityComplementary> facilityComplementaries;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "facility", fetch = FetchType.EAGER)
//    private List<FacilityGuarantor> facilityGuarantors;
    @JsonManagedReference
    @OneToMany(mappedBy = "facility")
    private List<FacilityBail> facilityBails;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "facility")
//    private List<FacilityGroup> facilityGroups;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "facility")
//    private List<FacilitySettlement> facilitySettlements;

    public String getCdBnk() {
        return cdBnk;
    }

    public void setCdBnk(String cdBnk) {
        this.cdBnk = cdBnk;
    }

    public Long getTpCstmr() {
        return tpCstmr;
    }

    public void setTpCstmr(Long tpCstmr) {
        this.tpCstmr = tpCstmr;
    }

    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public String getIdTtn() {
        return idTtn;
    }

    public void setIdTtn(String idTtn) {
        this.idTtn = idTtn;
    }

    public String getDtGhr() {
        return dtGhr;
    }

    public void setDtGhr(String dtGhr) {
        this.dtGhr = dtGhr;
    }

    public Long getBnftRate() {
        return bnftRate;
    }

    public void setBnftRate(Long bnftRate) {
        this.bnftRate = bnftRate;
    }

    public String getTpGhr() {
        return tpGhr;
    }

    public void setTpGhr(String tpGhr) {
        this.tpGhr = tpGhr;
    }

    public List<FacilityComplementary> getFacilityComplementaries() {
        return facilityComplementaries;
    }

    public void setFacilityComplementaries(List<FacilityComplementary> facilityComplementaries) {
        this.facilityComplementaries = facilityComplementaries;
    }

//    public List<FacilityGuarantor> getFacilityGuarantors() {
//        return facilityGuarantors;
//    }
//
//    public void setFacilityGuarantors(List<FacilityGuarantor> facilityGuarantors) {
//        this.facilityGuarantors = facilityGuarantors;
//    }

    public List<FacilityBail> getFacilityBails() {
        return facilityBails;
    }

    public void setFacilityBails(List<FacilityBail> facilityBails) {
        this.facilityBails = facilityBails;
    }

//    public List<FacilityGroup> getFacilityGroups() {
//        return facilityGroups;
//    }
//
//    public void setFacilityGroups(List<FacilityGroup> facilityGroups) {
//        this.facilityGroups = facilityGroups;
//    }
//
//    public List<FacilitySettlement> getFacilitySettlements() {
//        return facilitySettlements;
//    }
//
//    public void setFacilitySettlements(List<FacilitySettlement> facilitySettlements) {
//        this.facilitySettlements = facilitySettlements;
//    }
}
