package com.restService.model.base.dto.nahab.natural;

import com.restService.model.base.dto.nahab.NahabBaseModel;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by EDW on 4/12/2021.
 */
public class NahabInfo implements NahabBaseModel {

    private String shahabId;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String fatherName;
    private boolean isMale;
    private String birthDate;
    private String birthLocation;
    private String postalCode;
    private String postalAddress;

    public String getShahabId() {
        return shahabId;
    }

    public void setShahabId(String shahabId) {
        this.shahabId = shahabId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public boolean getIsMale() {
        return isMale;
    }

    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthLocation() {
        return birthLocation;
    }

    public void setBirthLocation(String birthLocation) {
        this.birthLocation = birthLocation;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }
}

