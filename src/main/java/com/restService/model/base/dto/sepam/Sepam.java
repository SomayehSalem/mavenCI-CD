package com.restService.model.base.dto.sepam;

import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
public class Sepam implements Serializable {

    private String nationalCode;

    private List<DocumentaryCredit> documentaryCredits;

    private List<DocumentaryCreditDiscount> documentaryCreditDiscounts;

    private List<Guaranty> guaranties;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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
}
