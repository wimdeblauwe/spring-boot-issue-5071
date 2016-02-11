# spring-boot-issue-5071

This repo is to help the Spring Boot devs debug issue [5071](https://github.com/spring-projects/spring-boot/issues/5071).

**To reproduce the issue:**

First request an OAuth2 access token (`POST` on http://localhost:8080/oauth/token), using:

* username: `user`
* password: `user`
* grant_type: `password`
* client_id: `clientapp`
* client_secret: `123456`

Then, using the `access_token` as `Authorization` header, do a `GET` to http://localhost:8080/api/user/

You will get an exeption like this:

    com.spring.test.SpringSecurityCustomUser@40b750d9 is not assignable to class com.spring.test.CustomUser