package com.restService.model.base.dto.samat.baseinfo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by EDW on 2/13/2021.
 */
@Entity
@Table(name = "SAMAT_PRSN_NUM", schema = "", catalog = "")
public class PersonNumber implements Serializable {

    @Id
    @Column(name = "CODE", nullable = true, precision = 0)
    private Long code;

    @Column(name = "DESCRIPTION", nullable = true, length = 255)
    private String description;


    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
