package com.restService.model.tahlil;

import java.io.Serializable;

/**
 * Created by s_homayouni on 4/19/2021.
 */
public class FactCmsReservePK implements Serializable {

    private String chkbPartyNationalId;

    private String series;

    private String serial;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FactCmsReservePK that = (FactCmsReservePK) o;

        if (!chkbPartyNationalId.equals(that.chkbPartyNationalId)) return false;
        if (!series.equals(that.series)) return false;
        return serial.equals(that.serial);

    }

    @Override
    public int hashCode() {
        int result = chkbPartyNationalId.hashCode();
        result = 31 * result + series.hashCode();
        result = 31 * result + serial.hashCode();
        return result;
    }

    public String getChkbPartyNationalId() {
        return chkbPartyNationalId;
    }

    public void setChkbPartyNationalId(String chkbPartyNationalId) {
        this.chkbPartyNationalId = chkbPartyNationalId;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}
