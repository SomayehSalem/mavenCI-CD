package com.restService.model.base.dto.sepam.baseinfo;

/**
 * Created by EDW on 2/13/2021.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SEPAM_CREDIT_MT700TYPE", schema = "", catalog = "")
public class CreditMt700type implements Serializable {

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

}
