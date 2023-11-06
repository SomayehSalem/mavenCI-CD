package com.restService.model.base.dto.samat;

import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
public class Samat implements Serializable {

    private String nationalCode;

    private List<Facility> facilities;

    private List<Bond> bonds;

//    private List<Credit> credits;

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

    public List<Bond> getBonds() {
        return bonds;
    }

    public void setBonds(List<Bond> bonds) {
        this.bonds = bonds;
    }

//    public List<Credit> getCredits() {
//        return credits;
//    }
//
//    public void setCredits(List<Credit> credits) {
//        this.credits = credits;
//    }
}
