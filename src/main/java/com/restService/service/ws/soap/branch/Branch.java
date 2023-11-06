
package com.restService.service.ws.soap.branch;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for branch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="branch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activityType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="addr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BICcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mergedBICcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mergedBranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownershipState" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="provinceCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "branch", propOrder = {
    "activityType",
    "addr",
    "biCcode",
    "cityCode",
    "code",
    "fax",
    "mergedBICcode",
    "mergedBranchCode",
    "name",
    "ownershipState",
    "provinceCode",
    "region",
    "status",
    "tel",
    "updateDate",
    "zipCode"
})
//@XmlRootElement(name = "Branch")
public class Branch {

    protected int activityType;
    protected String addr;
    @XmlElement(name = "BICcode")
    protected String biCcode;
    protected int cityCode;
    protected String code;
    protected String fax;
    protected String mergedBICcode;
    protected String mergedBranchCode;
    protected String name;
    protected int ownershipState;
    protected int provinceCode;
    protected String region;
    protected int status;
    protected String tel;
    protected String updateDate;
    protected String zipCode;

    /**
     * Gets the value of the activityType property.
     * 
     */
    public int getActivityType() {
        return activityType;
    }

    /**
     * Sets the value of the activityType property.
     * 
     */
    public void setActivityType(int value) {
        this.activityType = value;
    }

    /**
     * Gets the value of the addr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr() {
        return addr;
    }

    /**
     * Sets the value of the addr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr(String value) {
        this.addr = value;
    }

    /**
     * Gets the value of the biCcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICcode() {
        return biCcode;
    }

    /**
     * Sets the value of the biCcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICcode(String value) {
        this.biCcode = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     */
    public int getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     */
    public void setCityCode(int value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the mergedBICcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergedBICcode() {
        return mergedBICcode;
    }

    /**
     * Sets the value of the mergedBICcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergedBICcode(String value) {
        this.mergedBICcode = value;
    }

    /**
     * Gets the value of the mergedBranchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMergedBranchCode() {
        return mergedBranchCode;
    }

    /**
     * Sets the value of the mergedBranchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMergedBranchCode(String value) {
        this.mergedBranchCode = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the ownershipState property.
     * 
     */
    public int getOwnershipState() {
        return ownershipState;
    }

    /**
     * Sets the value of the ownershipState property.
     * 
     */
    public void setOwnershipState(int value) {
        this.ownershipState = value;
    }

    /**
     * Gets the value of the provinceCode property.
     * 
     */
    public int getProvinceCode() {
        return provinceCode;
    }

    /**
     * Sets the value of the provinceCode property.
     * 
     */
    public void setProvinceCode(int value) {
        this.provinceCode = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTel(String value) {
        this.tel = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the zipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Sets the value of the zipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

}
