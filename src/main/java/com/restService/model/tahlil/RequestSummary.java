package com.restService.model.tahlil;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by s_homayouni on 6/9/2021.
 */
@Entity
@Table(name = "TB_CLIENT_REQUEST_SUMMARY")
public class RequestSummary implements Serializable {


    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_req_summary_Sequence")
    @SequenceGenerator(name = "id_req_summary_Sequence", sequenceName = "SEQ_REQUEST_SUMMARY_ID")
    private Long id;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name = "REQUEST_COUNT")
    private Integer requestCount;

    @Column(name = "REQUEST_DATE")
    private String requestDate;

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

    public Integer getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Integer requestCount) {
        this.requestCount = requestCount;
    }

    public String getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }
}
