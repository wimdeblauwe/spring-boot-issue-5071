package com.spring.test;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SpringSecurityCustomUser extends CustomUser implements UserDetails {

    public SpringSecurityCustomUser(CustomUser customUser) {
        setUsername(customUser.getUsername());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<GrantedAuthority> result = new HashSet<>();
        result.add(new SimpleGrantedAuthority("ROLE_USER"));
        return result;
    }

    @Override
    public String getPassword() {
        return "user";
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
