package com.restService.model.base.dto.macna;

import java.io.Serializable;

/**
 * Created by s_homayouni on 6/10/2021.
 */
public class BillInfoPK implements Serializable{

    private String billUniqueId;

    private String billDate;

    public String getBillUniqueId() {
        return billUniqueId;
    }

    public void setBillUniqueId(String billUniqueId) {
        this.billUniqueId = billUniqueId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillInfoPK that = (BillInfoPK) o;

        if (!billUniqueId.equals(that.billUniqueId)) return false;
        return billDate.equals(that.billDate);

    }

    @Override
    public int hashCode() {
        int result = billUniqueId.hashCode();
        result = 31 * result + billDate.hashCode();
        return result;
    }
}
