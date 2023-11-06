package com.restService.model.base.dto.macna;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by s_homayouni on 6/1/2021.
 */
//@NamedNativeQueries({
//        @NamedNativeQuery(name = "BilInfo.findByMacnaId",
//                query = "select /*+  PARALLEL(32) NOLOGGING */BILL_UNIQUE_ID/*,BILL_DATE,LINE_OF_CREDIT,USED_CREDIT,LINE_OF_CREDIT_USED_CREDIT,DEBIT_PURCHASE,DEBIT_INTEREST,DEBIT_PENALTY,DEBIT_CHARGE,DEBIT_FEE,PAID_PURCHASE,PAID_INTEREST,PAID_PENALTY,PAID_CHARGE,PAID_FEE,DEBIT_SUSPENDED,DEBIT_POSTPONED,DEBIT_DOUBTFUL,TRANSACTIONS_COUNT,TOTAL_PURCHASE,INFO_DATE*/ from MACNA_BILLINFO where BILL_UNIQUE_ID = :billUniqueId", resultSetMapping = "macnaBillInfoAllColumnResultSetMapping")
//})
//@SqlResultSetMappings({
//        @SqlResultSetMapping(name = "macnaBillInfoAllColumnResultSetMapping",
//                entities = {
//                        @EntityResult(entityClass = BillInfo.class,
//                                fields = {
//                                        @FieldResult(column = "BILL_UNIQUE_ID", name = "billUniqueId")/*,
//                                        @FieldResult(column = "BILL_DATE", name = "billDate"),
//                                        @FieldResult(column = "LINE_OF_CREDIT", name = "lineOfCredit"),
//                                        @FieldResult(column = "USED_CREDIT", name = "usedCredit"),
//                                        @FieldResult(column = "LINE_OF_CREDIT_USED_CREDIT", name = "lineOfCreditUsedCredit"),
//                                        @FieldResult(column = "DEBIT_PURCHASE", name = "debitPurchase"),
//                                        @FieldResult(column = "DEBIT_INTEREST", name = "debitInterest"),
//                                        @FieldResult(column = "DEBIT_PENALTY", name = "debitPenalty"),
//                                        @FieldResult(column = "DEBIT_CHARGE", name = "debitCharge"),
//                                        @FieldResult(column = "DEBIT_FEE", name = "debitFee"),
//                                        @FieldResult(column = "PAID_PURCHASE", name = "paidPurchase"),
//                                        @FieldResult(column = "PAID_INTEREST", name = "paidInterest"),
//                                        @FieldResult(column = "PAID_PENALTY", name = "paidPenalty"),
//                                        @FieldResult(column = "PAID_CHARGE", name = "paidCharge"),
//                                        @FieldResult(column = "PAID_FEE", name = "paidFee"),
//                                        @FieldResult(column = "DEBIT_SUSPENDED", name = "debitSuspended"),
//                                        @FieldResult(column = "DEBIT_POSTPONED", name = "debitPostponed"),
//                                        @FieldResult(column = "DEBIT_DOUBTFUL", name = "debitDoubtful"),
//                                        @FieldResult(column = "TRANSACTIONS_COUNT", name = "transactionsCount"),
//                                        @FieldResult(column = "TOTAL_PURCHASE", name = "totalPurchase"),
//                                        @FieldResult(column = "INFO_DATE", name = "infoDate")*/
//                                })
//                })
//})
@Entity
@Table(name = "MACNA_BILLINFO", schema = "", catalog = "")
@IdClass(BillInfoPK.class)
public class BillInfo implements Serializable {

//    @Id
//    @Column(name = "ID", nullable = true, length = 300)
//    private String id;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "BILL_UNIQUE_ID", nullable = true)
    private MacnaInfo macnaInfo;

    @Id
    @Column(name = "BILL_UNIQUE_ID", nullable = true, insertable = false, updatable = false)
    private String billUniqueId;

    @Id
    @Column(name = "BILL_DATE", nullable = true, length = 300)
    private String billDate;

    @Column(name = "LINE_OF_CREDIT", nullable = true, length = 300)
    private String lineOfCredit;

    @Column(name = "USED_CREDIT", nullable = true, length = 300)
    private String usedCredit;

    @Column(name = "LINE_OF_CREDIT_USED_CREDIT", nullable = true, length = 300)
    private String lineOfCreditUsedCredit;

    @Column(name = "DEBIT_PURCHASE", nullable = true, length = 300)
    private String debitPurchase;

    @Column(name = "DEBIT_INTEREST", nullable = true, length = 300)
    private String debitInterest;

    @Column(name = "DEBIT_PENALTY", nullable = true, length = 300)
    private String debitPenalty;

    @Column(name = "DEBIT_CHARGE", nullable = true, length = 300)
    private String debitCharge;

    @Column(name = "DEBIT_FEE", nullable = true, length = 300)
    private String debitFee;

    @Column(name = "PAID_PURCHASE", nullable = true, length = 300)
    private String paidPurchase;

    @Column(name = "PAID_INTEREST", nullable = true, length = 300)
    private String paidInterest;

    @Column(name = "PAID_PENALTY", nullable = true, length = 300)
    private String paidPenalty;

    @Column(name = "PAID_CHARGE", nullable = true, length = 300)
    private String paidCharge;

    @Column(name = "PAID_FEE", nullable = true, length = 300)
    private String paidFee;

    @Column(name = "DEBIT_SUSPENDED", nullable = true, length = 300)
    private String debitSuspended;

    @Column(name = "DEBIT_POSTPONED", nullable = true, length = 300)
    private String debitPostponed;

    @Column(name = "DEBIT_DOUBTFUL", nullable = true, length = 300)
    private String debitDoubtful;

    @Column(name = "TRANSACTIONS_COUNT", nullable = true, length = 300)
    private String transactionsCount;

    @Column(name = "TOTAL_PURCHASE", nullable = true, length = 300)
    private String totalPurchase;

    @Column(name = "INFO_DATE", nullable = true, length = 300)
    private String infoDate;

    public String getBillUniqueId() {
        return billUniqueId;
    }

    public void setBillUniqueId(String billUniqueId) {
        this.billUniqueId = billUniqueId;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }

    public MacnaInfo getMacnaInfo() {
        return macnaInfo;
    }

    public void setMacnaInfo(MacnaInfo macnaInfo) {
        this.macnaInfo = macnaInfo;
    }

    public String getLineOfCredit() {
        return lineOfCredit;
    }

    public void setLineOfCredit(String lineOfCredit) {
        this.lineOfCredit = lineOfCredit;
    }

    public String getUsedCredit() {
        return usedCredit;
    }

    public void setUsedCredit(String usedCredit) {
        this.usedCredit = usedCredit;
    }

    public String getLineOfCreditUsedCredit() {
        return lineOfCreditUsedCredit;
    }

    public void setLineOfCreditUsedCredit(String lineOfCreditUsedCredit) {
        this.lineOfCreditUsedCredit = lineOfCreditUsedCredit;
    }

    public String getDebitPurchase() {
        return debitPurchase;
    }

    public void setDebitPurchase(String debitPurchase) {
        this.debitPurchase = debitPurchase;
    }

    public String getDebitInterest() {
        return debitInterest;
    }

    public void setDebitInterest(String debitInterest) {
        this.debitInterest = debitInterest;
    }

    public String getDebitPenalty() {
        return debitPenalty;
    }

    public void setDebitPenalty(String debitPenalty) {
        this.debitPenalty = debitPenalty;
    }

    public String getDebitCharge() {
        return debitCharge;
    }

    public void setDebitCharge(String debitCharge) {
        this.debitCharge = debitCharge;
    }

    public String getDebitFee() {
        return debitFee;
    }

    public void setDebitFee(String debitFee) {
        this.debitFee = debitFee;
    }

    public String getPaidPurchase() {
        return paidPurchase;
    }

    public void setPaidPurchase(String paidPurchase) {
        this.paidPurchase = paidPurchase;
    }

    public String getPaidInterest() {
        return paidInterest;
    }

    public void setPaidInterest(String paidInterest) {
        this.paidInterest = paidInterest;
    }

    public String getPaidPenalty() {
        return paidPenalty;
    }

    public void setPaidPenalty(String paidPenalty) {
        this.paidPenalty = paidPenalty;
    }

    public String getPaidCharge() {
        return paidCharge;
    }

    public void setPaidCharge(String paidCharge) {
        this.paidCharge = paidCharge;
    }

    public String getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(String paidFee) {
        this.paidFee = paidFee;
    }

    public String getDebitSuspended() {
        return debitSuspended;
    }

    public void setDebitSuspended(String debitSuspended) {
        this.debitSuspended = debitSuspended;
    }

    public String getDebitPostponed() {
        return debitPostponed;
    }

    public void setDebitPostponed(String debitPostponed) {
        this.debitPostponed = debitPostponed;
    }

    public String getDebitDoubtful() {
        return debitDoubtful;
    }

    public void setDebitDoubtful(String debitDoubtful) {
        this.debitDoubtful = debitDoubtful;
    }

    public String getTransactionsCount() {
        return transactionsCount;
    }

    public void setTransactionsCount(String transactionsCount) {
        this.transactionsCount = transactionsCount;
    }

    public String getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(String totalPurchase) {
        this.totalPurchase = totalPurchase;
    }

    public String getInfoDate() {
        return infoDate;
    }

    public void setInfoDate(String infoDate) {
        this.infoDate = infoDate;
    }
}
