package com.restService.model.base.usermanagement;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UM_CLIENT")
@NamedQueries({
        @NamedQuery(name = "Client.getByName", query = "select a from ClientEntity a where a.clientName = :clientName")
})
public class ClientEntity implements Serializable {

    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "CLIENT_NAME")
    private String clientName;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "DESCRIPTION")
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
