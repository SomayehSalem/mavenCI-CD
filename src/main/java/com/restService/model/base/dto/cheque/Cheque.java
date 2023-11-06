package com.restService.model.base.dto.cheque;

import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
public class Cheque implements Serializable {

    private String nationalCode;

    private List<ChequeInfo> chequeInfos;
//    private List<ChequeComplementary> chequeComplementaries;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public List<ChequeInfo> getChequeInfos() {
        return chequeInfos;
    }

    public void setChequeInfos(List<ChequeInfo> chequeInfos) {
        this.chequeInfos = chequeInfos;
    }

//    public List<ChequeComplementary> getChequeComplementaries() {
//        return chequeComplementaries;
//    }
//
//    public void setChequeComplementaries(List<ChequeComplementary> chequeComplementaries) {
//        this.chequeComplementaries = chequeComplementaries;
//    }
}
