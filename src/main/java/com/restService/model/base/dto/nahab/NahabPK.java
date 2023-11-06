package com.restService.model.base.dto.nahab;

import java.io.Serializable;

/**
 * Created by EDW on 4/6/2021.
 */
public class NahabPK implements Serializable {

    private String shahabId;
    private String nationalId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NahabPK nahabPK = (NahabPK) o;

        if (!shahabId.equals(nahabPK.shahabId)) return false;
        return nationalId.equals(nahabPK.nationalId);

    }

    @Override
    public int hashCode() {
        int result = shahabId.hashCode();
        result = 31 * result + nationalId.hashCode();
        return result;
    }
}

