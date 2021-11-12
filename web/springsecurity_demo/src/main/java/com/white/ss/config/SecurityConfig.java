package com.white.ss.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


public class SecurityConfig extends WebSecurityConfigurerAdapter {
/*
    @Bean
    PasswordEncoder password(){
        return new BCryptPasswordEncoder();
    }*/
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //密码加密
//        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//        String password = passwordEncoder.encode("456");
//
//        auth.inMemoryAuthentication().withUser("admin").password(password).roles("");
//    }
}
