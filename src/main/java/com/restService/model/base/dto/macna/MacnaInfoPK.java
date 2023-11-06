package com.restService.model.base.dto.macna;

import java.io.Serializable;

/**
 * Created by s_homayouni on 4/19/2021.
 */
public class MacnaInfoPK implements Serializable {

    private String nationalid;

    private String updatedate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MacnaInfoPK that = (MacnaInfoPK) o;

        if (!nationalid.equals(that.nationalid)) return false;
        return updatedate.equals(that.updatedate);

    }

    @Override
    public int hashCode() {
        int result = nationalid.hashCode();
        result = 31 * result + updatedate.hashCode();
        return result;
    }

    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}
