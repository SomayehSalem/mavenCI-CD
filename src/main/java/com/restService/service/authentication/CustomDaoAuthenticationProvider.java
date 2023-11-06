package com.restService.service.authentication;


import com.restService.model.base.usermanagement.ClientEntity;
import com.restService.service.usermanagement.ClientService;
import com.restService.utils.PasswordUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

import javax.persistence.NoResultException;
import java.security.NoSuchAlgorithmException;

@Component
public class CustomDaoAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private ClientService clientService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        try {
            String name = authentication.getName();
            String password = PasswordUtils.getHashString(authentication.getCredentials().toString());
            if (userAuthenticated(name, password)) {

                // use the credentials
                // and authenticate against the third-party system
                return new UsernamePasswordAuthenticationToken(
                        name, password, clientService.getUserRoles(name));
//            return null;
            } else {
                return null;
            }
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private boolean userAuthenticated(String name, String password) {
//        return true;
        try {
            ClientEntity client = clientService.getClient(name);
            return client.getPassword().equals(password);
        } catch (NoResultException ex) {
            return false;
        }
    }

//    private List<RoleEntity> getRoles(String userName) {
//
//    }

    @Override
    public boolean supports(Class<?> aClass) {
        return aClass.equals(UsernamePasswordAuthenticationToken.class);
    }
}
