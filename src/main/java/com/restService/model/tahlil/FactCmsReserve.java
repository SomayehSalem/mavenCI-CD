package com.restService.model.tahlil;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 3/14/2021.
 */
@Entity
@Table(name = "fact_samt_web_service", schema = "", catalog = "")
@IdClass(FactCmsReservePK.class)
public class FactCmsReserve implements Serializable {

    @Column(name = "CORPORATION_NAME")//نام شرکت
    private String corporationName;

    @Column(name = "CHEQ_TRN_DATE")//تاریخ تراکنش
    private String chequeTransactionDate;

    @Column(name = "CHEQ_DATE")//تاریخ چک
    private String chequeDate;

    @Column(name = "CREDITOR_IBAN")//شبای بستانکار
    private String creditorIban;

    @Column(name = "CREDITOR_NAME")//نام بستانکار
    private String creditorName;

    @Column(name = "DEBTOR_IBAN")//شبای بدهکار
    private String debtorIban;

    @Column(name = "AMOUNT")//مبلغ
    private String amount;

    @Id
    @Column(name = "SERIES")//سری چک
    private String series;

    @Id
    @Column(name = "SERIAL")//سریال چک
    private String serial;

    @Column(name = "STATUS")//وضعیت تراکنش
    private String status;

    @Column(name = "RESERVE")//شناسه 16 رقمی چک
    private String reserve;

    @Column(name = "SEQ_NO") //شناسه تراکنش چکاوک
    private String seqNo;

    @Id
    @Column(name = "CHKB_PARTY_NATIONAL_ID")//شناسه ملی
    private String chkbPartyNationalId;

    public String getCorporationName() {
        return corporationName;
    }

    public void setCorporationName(String corporationName) {
        this.corporationName = corporationName;
    }

    public String getChequeTransactionDate() {
        return chequeTransactionDate;
    }

    public void setChequeTransactionDate(String chequeTransactionDate) {
        this.chequeTransactionDate = chequeTransactionDate;
    }

    public String getChequeDate() {
        return chequeDate;
    }

    public void setChequeDate(String chequeDate) {
        this.chequeDate = chequeDate;
    }

    public String getCreditorIban() {
        return creditorIban;
    }

    public void setCreditorIban(String creditorIban) {
        this.creditorIban = creditorIban;
    }

    public String getCreditorName() {
        return creditorName;
    }

    public void setCreditorName(String creditorName) {
        this.creditorName = creditorName;
    }

    public String getDebtorIban() {
        return debtorIban;
    }

    public void setDebtorIban(String debtorIban) {
        this.debtorIban = debtorIban;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReserve() {
        return reserve;
    }

    public void setReserve(String reserve) {
        this.reserve = reserve;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getChkbPartyNationalId() {
        return chkbPartyNationalId;
    }

    public void setChkbPartyNationalId(String chkbPartyNationalId) {
        this.chkbPartyNationalId = chkbPartyNationalId;
    }
}
