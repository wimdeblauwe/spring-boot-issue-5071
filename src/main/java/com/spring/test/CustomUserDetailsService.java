package com.spring.test;

import org.springframework.context.annotation.Primary;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CustomUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Normally load from db here, but now just for testing like this
        CustomUser customUser = new CustomUser();
        customUser.setUsername(username);

        return new SpringSecurityCustomUser(customUser);
    }
}
