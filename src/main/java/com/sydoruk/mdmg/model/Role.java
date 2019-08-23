package com.sydoruk.mdmg.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER; //TODO: add more roles

    @Override
    public String getAuthority() {
        return name();
    }
}
