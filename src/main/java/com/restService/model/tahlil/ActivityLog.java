package com.restService.model.tahlil;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by EDW on 3/16/2021.
 */
@Entity
@Table(name = "TB_ACTIVITY_LOG")
public class ActivityLog implements Serializable {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "SEQ_LOG_ID")
    private Long id;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "PARAMETERS")
    private String parameter;

    @Column(name = "REQUEST_TIME")
    private String requestTime;

    @Column(name = "RESPONSE_TIME")
    private String responseTime;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "MESSAGE")
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(String responseTime) {
        this.responseTime = responseTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
