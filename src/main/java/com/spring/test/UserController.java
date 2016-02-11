package com.spring.test;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@RestController
public class UserController {

    @RequestMapping("/")
    @Secured("ROLE_USER")
    public CustomUser getUsername(@AuthenticationPrincipal(errorOnInvalidType = true) CustomUser user )
    {
        return user;
    }
}
