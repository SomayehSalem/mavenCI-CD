package com.restService.service.usermanagement;

import com.restService.model.base.usermanagement.ClientEntity;
import com.restService.model.base.usermanagement.RoleEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class ClientService {

    @PersistenceContext
    private EntityManager entityManager;

    public ClientEntity getClient(String clientName) {
        return entityManager.createNamedQuery("Client.getByName", ClientEntity.class)
                .setParameter("clientName", clientName)
                .getSingleResult();
    }

    public Collection<? extends GrantedAuthority> getUserRoles(String name) {
        List<RoleEntity> roles = entityManager.createNamedQuery("ClientRole.getByClient", RoleEntity.class)
                .setParameter("clientName", name)
                .getResultList();
        if(roles == null || roles.isEmpty()) {
            roles = new ArrayList<>();
        }
        RoleEntity role = new RoleEntity();
        role.setRoleName("default_role");
        roles.add(role);
        return roles;
    }
}
