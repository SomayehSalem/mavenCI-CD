package com.restService.model.base.dto.nahab.legal;

import com.restService.model.base.dto.nahab.NahabBaseModel;

import javax.persistence.Column;
import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Created by EDW on 4/12/2021.
 */
public class NahabInfo implements NahabBaseModel {

    private String shahabId;
    private String nationalId;
    private String firstName;
    //    private String isMale;
    private String establishmentDate;
    private String establishmentLocation;
    private String idNumber;
    private String legalType;
    private String postalCode;
    private String postalAddress;
    private boolean isBreakUp;
    private boolean isSettle;
    private String breakUpDate;
    private String registerDate;
    private String registerLocation;
    private String status;

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

//    public String getIsMale() {
//        return isMale;
//    }

//    public void setIsMale(String isMale) {
//        this.isMale = isMale;
//    }

    public String getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getEstablishmentLocation() {
        return establishmentLocation;
    }

    public void setEstablishmentLocation(String establishmentLocation) {
        this.establishmentLocation = establishmentLocation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getLegalType() {
        return legalType;
    }

    public void setLegalType(String legalType) {
        this.legalType = legalType;
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

    public boolean getIsBreakUp() {
        return isBreakUp;
    }

    public void setIsBreakUp(boolean isBreakUp) {
        this.isBreakUp = isBreakUp;
    }

    public boolean getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(boolean isSettle) {
        this.isSettle = isSettle;
    }

    public String getBreakUpDate() {
        return breakUpDate;
    }

    public void setBreakUpDate(String breakUpDate) {
        this.breakUpDate = breakUpDate;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterLocation() {
        return registerLocation;
    }

    public void setRegisterLocation(String registerLocation) {
        this.registerLocation = registerLocation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
