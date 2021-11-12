package com.white.ss;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.white.ss.mapper")
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityMainApplication.class, args);
    }
}
