package com.restService.model.base.usermanagement;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@IdClass(ClientRoleEntityPK.class)
@NamedQueries({
        @NamedQuery(name = "ClientRole.getByClient", query = "select a.roleEntity from ClientRoleEntity a where a.clientEntity.clientName = :clientName")
})
@Table(name = "UM_CLIENT_ROLE")
public class ClientRoleEntity implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "ID")
    private ClientEntity clientEntity;

    @Id
    @ManyToOne
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "ID")
    private RoleEntity roleEntity;

    public ClientEntity getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(ClientEntity clientEntity) {
        this.clientEntity = clientEntity;
    }

    public RoleEntity getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(RoleEntity roleEntity) {
        this.roleEntity = roleEntity;
    }
}
