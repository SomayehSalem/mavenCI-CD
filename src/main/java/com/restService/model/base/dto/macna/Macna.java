package com.restService.model.base.dto.macna;

import java.io.Serializable;
import java.util.List;

/**
 * Created by EDW on 4/5/2021.
 */
public class Macna  implements Serializable {

    private String nationalCode;
    private MacnaInfo macnaInfo;

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public MacnaInfo getMacnaInfo() {
        return macnaInfo;
    }

    public void setMacnaInfo(MacnaInfo macnaInfo) {
        this.macnaInfo = macnaInfo;
    }
}
