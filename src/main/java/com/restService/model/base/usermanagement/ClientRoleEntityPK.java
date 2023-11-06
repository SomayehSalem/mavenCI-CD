package com.restService.model.base.usermanagement;

import java.io.Serializable;
import java.util.Objects;

public class ClientRoleEntityPK implements Serializable {

    private String clientEntity;
    private String roleEntity;

    public String getClientEntity() {
        return clientEntity;
    }

    public void setClientEntity(String clientEntity) {
        this.clientEntity = clientEntity;
    }

    public String getRoleEntity() {
        return roleEntity;
    }

    public void setRoleEntity(String roleEntity) {
        this.roleEntity = roleEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientRoleEntityPK that = (ClientRoleEntityPK) o;
        return clientEntity.equals(that.clientEntity) &&
                roleEntity.equals(that.roleEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientEntity, roleEntity);
    }
}
