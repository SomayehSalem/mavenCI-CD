package com.restService.model.base.logmanagement;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REQUEST_LOG", schema = "", catalog = "")
public class LogEntity implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_LOG_ID")
    private Integer id;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "REQUEST_DATE")
    private String requestDate;

    @Column(name = "REQUESTER_IP")
    private String requestIP;

    @Column(name = "CLIENT_ID")
    private String clientId;

    @Column(name = "REQUEST_RESULT")
    private byte[] result;

    @Column(name = "RESULT_STATUS")
    private String resultStatus;

    @Column(name = "RESPONSE_TIME")
    private String responseTime;

    public LogEntity() {
    }

    public LogEntity(String serviceName, String requestDate, String requestIP, String clientId) {
        this.serviceName = serviceName;
        this.requestDate = requestDate;
        this.requestIP = requestIP;
        this.clientId = clientId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestIP() {
        return requestIP;
    }

    public void setRequestIP(String requestIP) {
        this.requestIP = requestIP;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public byte[] getResult() {
        return result;
    }

    public void setResult(byte[] result) {
        this.result = result;
    }

    public String getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(String resultStatus) {
        this.resultStatus = resultStatus;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }
}
