package com.restService.model.base.dto;

import com.restService.model.base.dto.macna.MacnaInfo;
import com.restService.model.base.dto.samat.Bond;
import com.restService.model.base.dto.samat.Credit;
import com.restService.model.base.dto.samat.Facility;
import com.restService.model.base.dto.sepam.DocumentaryCredit;
import com.restService.model.base.dto.sepam.DocumentaryCreditDiscount;
import com.restService.model.base.dto.sepam.Guaranty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by EDW on 2/7/2021.
 */
public class InquiryResult implements Serializable {

    private String nationalCode;

    private List<Facility> facilities;

    private List<Bond> bonds;

    private List<Credit> credits;

    private List<DocumentaryCredit> documentaryCredits;

    private List<DocumentaryCreditDiscount> documentaryCreditDiscounts;

    private List<Guaranty> guaranties;

    private List<MacnaInfo> macnaInfos;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public List<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facility> facilities) {
        this.facilities = facilities;
    }

    public void addFacility(Facility facility) {
        if (this.facilities == null) {
            this.setFacilities(new ArrayList<>());
        }
        this.facilities.add(facility);
    }

    public List<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bond> bonds) {
        this.bonds = bonds;
    }

    public void addBond(Bond bond) {
        if (this.bonds == null) {
            this.setBonds(new ArrayList<>());
        }
        this.bonds.add(bond);
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public void addCredit(Credit credit) {
        if (this.credits == null) {
            this.setCredits(new ArrayList<>());
        }
        this.credits.add(credit);
    }

    public List<DocumentaryCredit> getDocumentaryCredits() {
        return documentaryCredits;
    }

    public void setDocumentaryCredits(List<DocumentaryCredit> documentaryCredits) {
        this.documentaryCredits = documentaryCredits;
    }

    public List<DocumentaryCreditDiscount> getDocumentaryCreditDiscounts() {
        return documentaryCreditDiscounts;
    }

    public void setDocumentaryCreditDiscounts(List<DocumentaryCreditDiscount> documentaryCreditDiscounts) {
        this.documentaryCreditDiscounts = documentaryCreditDiscounts;
    }

    public List<Guaranty> getGuaranties() {
        return guaranties;
    }

    public void setGuaranties(List<Guaranty> guaranties) {
        this.guaranties = guaranties;
    }

    public List<MacnaInfo> getMacnaInfos() {
        return macnaInfos;
    }

    public void setMacnaInfos(List<MacnaInfo> macnaInfos) {
        this.macnaInfos = macnaInfos;
    }
}


