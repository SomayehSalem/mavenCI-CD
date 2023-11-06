package com.restService.model.base.dto.macna;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "MACNA_CARD_TYPE", schema = "", catalog = "")
public class MacnaCardType implements Serializable {

    @Id
    @Column(name = "CODE", nullable = true, precision = 0)
    private String code;

    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MacnaCardType that = (MacnaCardType) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description);
    }
}
