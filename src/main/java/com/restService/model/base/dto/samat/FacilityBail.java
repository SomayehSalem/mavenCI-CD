package com.restService.model.base.dto.samat;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 2/7/2021.
 */
@Entity
@Table(name = "VTASFILE5", schema = "")
public class FacilityBail implements Serializable {

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name= "ID_TTN")
    private Facility facility; // idTtn;

//    @Column(name = "TP_GAGE", nullable = true, length = 2)
//    private String tpGage;

    @Column(name = "AM_GAGE", nullable = true, precision = 0)
    private Long amGage;

//    @Column(name = "GAGE_NO", nullable = true, length = 1)
//    private String gageNo;

    @Id
    @Column(name = "ID", nullable = true, precision = 0)
    private Long id;

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    public Long getAmGage() {
        return amGage;
    }

    public void setAmGage(Long amGage) {
        this.amGage = amGage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

