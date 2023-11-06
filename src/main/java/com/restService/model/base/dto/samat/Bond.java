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
@Table(name = "VZEMFILE1", schema = "", catalog = "")
public class Bond implements Serializable {

    @Id
    @Column(name = "ID_TTN", nullable = true, length = 16)
    private String idTtn;
//    @Column(name = "TP_CSTMR", nullable = true, precision = 0)
//    private Long tpCstmr;
//    @Column(name = "SHAHABCD", nullable = true, length = 16)
//    private String shahabcd;
    @Column(name = "ID_MAIN", nullable = true, length = 255)
    private String idMain;
//    @Column(name = "CD_BNK", nullable = true, length = 2)
//    private String cdBnk;
//    @Column(name = "CD_SHB", nullable = true, length = 5)
//    private String cdShb;
//    @Column(name = "DT_SDRZEM", nullable = true, length = 8)
//    private String dtSdrzem;
//    @Column(name = "DT_LSTMAT", nullable = true, length = 8)
//    private String dtLstmat;
//    @Column(name = "CD_ARZ", nullable = true, length = 3)
//    private String cdArz;
//    @Column(name = "CONV_RATE", nullable = true, precision = 0)
//    private Long convRate;
//    @Column(name = "AM_ZEM", nullable = true, precision = 0)
//    private Long amZem;
//    @Column(name = "ZEM_WMAT", nullable = true, length = 1)
//    private String zemWmat;
    @Column(name = "TP_ZEM", nullable = true, length = 2)
    private String tpZem;
//    @Column(name = "MALIAT_ESTNO", nullable = true, length = 14)
//    private String maliatEstno;
//    @Column(name = "PRSN_NUM", nullable = true, length = 1)
//    private String prsnNum;
//    @Column(name = "EQNMC_PRT", nullable = true, length = 2)
//    private String eqnmcPrt;
//    @Column(name = "EQNMC_DTL", nullable = true, length = 4)
//    private String eqnmcDtl;
//    @Column(name = "TP_OWNER", nullable = true, length = 1)
//    private String tpOwner;
//    @Column(name = "TASTAM_RESRC", nullable = true, length = 2)
//    private String tastamResrc;
//    @Column(name = "DT_PAY", nullable = true, length = 8)
//    private String dtPay;
//    @Column(name = "TASHILAT_STATE", nullable = true, length = 1)
//    private String tashilatState;
//    @Column(name = "RTOTAL", nullable = true, precision = 0)
//    private Long rtotal;
//    @Column(name = "RMMSHK", nullable = true, precision = 0)
//    private Long rmmshk;
//    @Column(name = "RMSKHT", nullable = true, precision = 0)
//    private Long rmskht;
//    @Column(name = "RMTHD", nullable = true, precision = 0)
//    private Long rmthd;
//    @Column(name = "ELTZM_TKHR", nullable = true, precision = 0)
//    private Long eltzmTkhr;
//    @Column(name = "GRM_DRKRD", nullable = true, precision = 0)
//    private Long grmDrkrd;
//    @Column(name = "ID", nullable = false, precision = 0)
//    private long id;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "bond")
//    private List<BondBail> bondBails;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "bond")
//    private List<BondGroup> bondGroups;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "bond")
//    private List<BondGuarantor> bondGuarantors;
//    @JsonManagedReference
//    @OneToMany(mappedBy = "bond")
//    private List<BondSettlement> bondSettlements;

    public String getIdTtn() {
        return idTtn;
    }

    public void setIdTtn(String idTtn) {
        this.idTtn = idTtn;
    }

    public String getIdMain() {
        return idMain;
    }

    public void setIdMain(String idMain) {
        this.idMain = idMain;
    }

    public String getTpZem() {
        return tpZem;
    }

    public void setTpZem(String tpZem) {
        this.tpZem = tpZem;
    }

//    public List<BondBail> getBondBails() {
//        return bondBails;
//    }
//
//    public void setBondBails(List<BondBail> bondBails) {
//        this.bondBails = bondBails;
//    }
//
//    public void setBondBail(BondBail bondBail) {
//        if(this.bondBails == null) {
//            this.setBondBails(new ArrayList<>());
//        }
//        this.bondBails.add(bondBail);
//    }
//
//    public List<BondGroup> getBondGroups() {
//        return bondGroups;
//    }
//
//    public void setBondGroups(List<BondGroup> bondGroups) {
//        this.bondGroups = bondGroups;
//    }
//
//    public void addBondGroups(BondGroup bondGroup) {
//        if(this.bondGroups == null) {
//            this.setBondGroups(new ArrayList<>());
//        }
//        this.bondGroups.add(bondGroup);
//    }
//
//    public List<BondGuarantor> getBondGuarantors() {
//        return bondGuarantors;
//    }
//
//    public void setBondGuarantors(List<BondGuarantor> bondGuarantors) {
//        this.bondGuarantors = bondGuarantors;
//    }
//
//    public void addBondGuarantors(BondGuarantor bondGuarantor) {
//        if(this.bondGuarantors == null) {
//            this.setBondGuarantors(new ArrayList<>());
//        }
//        this.bondGuarantors.add(bondGuarantor);
//    }
//
//    public List<BondSettlement> getBondSettlements() {
//        return bondSettlements;
//    }
//
//    public void setBondSettlements(List<BondSettlement> bondSettlements) {
//        this.bondSettlements = bondSettlements;
//    }
//
//    public void addBondSettlement(BondSettlement bondSettlement) {
//        if(this.bondSettlements == null) {
//            this.setBondSettlements(new ArrayList<>());
//        }
//        this.bondSettlements.add(bondSettlement);
//    }
}
