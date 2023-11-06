package com.restService.model.base.dto.nahab;

import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
public class Nahab  implements Serializable {

    private String nationalCode;
    private List<NahabBaseModel> nahabInfos;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public List<NahabBaseModel> getNahabInfos() {
        return nahabInfos;
    }

    public void setNahabInfos(List<NahabBaseModel> nahabInfos) {
        this.nahabInfos = nahabInfos;
    }
}
