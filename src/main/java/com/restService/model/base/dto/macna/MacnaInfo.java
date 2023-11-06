package com.restService.model.base.dto.macna;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

//@NamedNativeQueries({
//        @NamedNativeQuery(name = "MacnaInfo.findByNationalId",
//                query = "select /*+  PARALLEL(32) NOLOGGING */MACNA_UNIQUE_ID,NAME,LAST_NAME,NATIONAL_CODE,FATHER_NAME,SEX,BIRTH_DATE,PAN,BIRTH_CERTIFICATE_SERIAL,BIRTH_CERTIFICATE_SERIE,CITY,CARD_ISSUE_DATE,MACNA_UPDATE_DATE,CARD_EXPIRY_DATE,CARD_STATUS,CARD_TYPE,SHAHAB_CODE from MACNA_INFO where NATIONAL_CODE = :nationalId", resultSetMapping = "macnaAllColumnResultSetMapping")
//})
//@SqlResultSetMappings({
//        @SqlResultSetMapping(name = "macnaAllColumnResultSetMapping",
//                             entities = {
//                                     @EntityResult(entityClass = MacnaInfo.class,
//                                     fields = {
//                                             @FieldResult(name = "id", column = "MACNA_UNIQUE_ID"),
//                                             @FieldResult(name = "name", column = "NAME"),
//                                             @FieldResult(name = "lastName", column = "LAST_NAME"),
//                                             @FieldResult(name = "nationalCode", column = "NATIONAL_CODE"),
//                                             @FieldResult(name = "fatherName", column = "FATHER_NAME"),
//                                             @FieldResult(name = "sex", column = "SEX"),
//                                             @FieldResult(name = "birthDate", column = "BIRTH_DATE"),
//                                             @FieldResult(name = "pan", column = "PAN"),
//                                             @FieldResult(name = "birthCertificateSerial", column = "BIRTH_CERTIFICATE_SERIAL"),
//                                             @FieldResult(name = "birthCertificateSerie", column = "BIRTH_CERTIFICATE_SERIE"),
//                                             @FieldResult(name = "city", column = "CITY"),
//                                             @FieldResult(name = "cardIssueDate", column = "CARD_ISSUE_DATE"),
//                                             @FieldResult(name = "macnaUpdateDate", column = "MACNA_UPDATE_DATE"),
//                                             @FieldResult(name = "cardExpiryDate", column = "CARD_EXPIRY_DATE"),
//                                             @FieldResult(name = "cardStatus", column = "CARD_STATUS"),
//                                             @FieldResult(name = "cardType", column = "CARD_TYPE"),
//                                             @FieldResult(name = "shahbCode", column = "SHAHAB_CODE")
//                                     })
//                             })
//})
@Entity
@Table(name = "MACNA_INFO", schema = "", catalog = "")
public class MacnaInfo implements Serializable {

    @Id
    @Column(name = "MACNA_UNIQUE_ID", nullable = true, length = 300)
    private String id;

    @Column(name = "NAME", nullable = true, length = 300)
    private String name;

    @Column(name = "LAST_NAME", nullable = true, length = 300)
    private String lastName;

    @Column(name = "NATIONAL_CODE", nullable = true, length = 300)
    private String nationalCode;

    @Column(name = "FATHER_NAME", nullable = true, length = 300)
    private String fatherName;

    @Column(name = "SEX", nullable = true, length = 300)
    private String sex;

    @Column(name = "BIRTH_DATE", nullable = true, length = 300)
    private String birthDate;

    @Column(name = "PAN", nullable = true, length = 300)
    private String pan;

    @Column(name = "BIRTH_CERTIFICATE_SERIAL", nullable = true, length = 300)
    private String birthCertificateSerial;

    @Column(name = "BIRTH_CERTIFICATE_SERIE", nullable = true, length = 300)
    private String birthCertificateSerie;

    @Column(name = "CITY", nullable = true, length = 300)
    private String city;

    @Column(name = "CARD_ISSUE_DATE", nullable = true, length = 300)
    private String cardIssueDate;

    @Column(name = "MACNA_UPDATE_DATE", nullable = true, length = 300)
    private String macnaUpdateDate;

    @Column(name = "CARD_EXPIRY_DATE", nullable = true, length = 300)
    private String cardExpiryDate;

    @Column(name = "CARD_STATUS", nullable = true, length = 300)
    private String cardStatus;

    @Column(name = "CARD_TYPE", nullable = true, length = 300)
    private String cardType;

    @Column(name = "SHAHAB_CODE", nullable = true, length = 300)
    private String shahbCode;

//    @JsonManagedReference
//    @OneToMany(mappedBy = "macnaInfo")
//    @Transient
//    private List<BillInfo> billInfos;


    @JsonManagedReference
    @OneToMany(mappedBy = "macnaInfo")
    private List<BillInfo> billInfos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getBirthCertificateSerial() {
        return birthCertificateSerial;
    }

    public void setBirthCertificateSerial(String birthCertificateSerial) {
        this.birthCertificateSerial = birthCertificateSerial;
    }

    public String getBirthCertificateSerie() {
        return birthCertificateSerie;
    }

    public void setBirthCertificateSerie(String birthCertificateSerie) {
        this.birthCertificateSerie = birthCertificateSerie;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCardIssueDate() {
        return cardIssueDate;
    }

    public void setCardIssueDate(String cardIssueDate) {
        this.cardIssueDate = cardIssueDate;
    }

    public String getMacnaUpdateDate() {
        return macnaUpdateDate;
    }

    public void setMacnaUpdateDate(String macnaUpdateDate) {
        this.macnaUpdateDate = macnaUpdateDate;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getShahbCode() {
        return shahbCode;
    }

    public void setShahbCode(String shahbCode) {
        this.shahbCode = shahbCode;
    }

    public List<BillInfo> getBillInfos() {
        return billInfos;
    }

    public void setBillInfos(List<BillInfo> billInfos) {
        this.billInfos = billInfos;
    }
}
