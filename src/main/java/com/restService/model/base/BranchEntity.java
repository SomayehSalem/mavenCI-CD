package com.restService.model.base;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by S_Salem on 10/21/2020.
 */
@Entity
@Table(name = "BRANCH", schema = "U_SALEM", catalog = "")
public class BranchEntity implements Serializable {
    private Integer Id;
    private Integer activitytype;
    private String addr;
    private String bicode;
    private Integer citycode;
    private String code;
    private String fax;
    private String mergedbiccode;
    private String mergedbranchcode;
    private String name;
    private Integer ownershipstate;
    private Integer provincecode;
    private String region;
    private Integer status;
    private String tel;
    private String updatedate;
    private String zipcode;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_BRANCH_ID")
    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    @Basic
    @Column(name = "ACTIVITYTYPE")
    public Integer getActivitytype() {
        return activitytype;
    }

    public void setActivitytype(Integer activitytype) {
        this.activitytype = activitytype;
    }

    @Basic
    @Column(name = "ADDR")
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }


    @Basic
    @Column(name = "BICODE")
    public String getBicode() {
        return bicode;
    }

    public void setBicode(String bicode) {
        this.bicode = bicode;
    }

    @Basic
    @Column(name = "CITYCODE")
    public Integer getCitycode() {
        return citycode;
    }

    public void setCitycode(Integer citycode) {
        this.citycode = citycode;
    }

    @Basic
    @Column(name = "CODE")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "FAX")
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Basic
    @Column(name = "MERGEDBICCODE")
    public String getMergedbiccode() {
        return mergedbiccode;
    }

    public void setMergedbiccode(String mergedbiccode) {
        this.mergedbiccode = mergedbiccode;
    }

    @Basic
    @Column(name = "MERGEDBRANCHCODE")
    public String getMergedbranchcode() {
        return mergedbranchcode;
    }

    public void setMergedbranchcode(String mergedbranchcode) {
        this.mergedbranchcode = mergedbranchcode;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "OWNERSHIPSTATE")
    public Integer getOwnershipstate() {
        return ownershipstate;
    }

    public void setOwnershipstate(Integer ownershipstate) {
        this.ownershipstate = ownershipstate;
    }

    @Basic
    @Column(name = "PROVINCECODE")
    public Integer getProvincecode() {
        return provincecode;
    }

    public void setProvincecode(Integer provincecode) {
        this.provincecode = provincecode;
    }

    @Basic
    @Column(name = "REGION")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "TEL")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "UPDATEDATE")
    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }

    @Basic
    @Column(name = "ZIPCODE")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }


}
