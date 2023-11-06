package com.restService.model.base.dto.macna;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "MACNA_RESULT", schema = "", catalog = "")
public class MacnaResult {

    @Id
    @Column(name = "RESULT_CODE", nullable = true, length = 3)
    private String resultCode;

    @Column(name = "RESULTY_DESCRIPTION", nullable = true, length = 255)
    private String resultyDescription;


    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }


    public String getResultyDescription() {
        return resultyDescription;
    }

    public void setResultyDescription(String resultyDescription) {
        this.resultyDescription = resultyDescription;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MacnaResult that = (MacnaResult) o;
        return Objects.equals(resultCode, that.resultCode) &&
                Objects.equals(resultyDescription, that.resultyDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resultCode, resultyDescription);
    }
}
