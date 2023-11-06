package com.restService.model.base.dto.sepam.baseinfo;

/**
 * Created by EDW on 2/13/2021.
 */

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SEPAM_GUARANTY_MT760F40B", schema = "")
public class GuarantyMt760f40b implements Serializable {

    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "DESCRIPTION")
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
