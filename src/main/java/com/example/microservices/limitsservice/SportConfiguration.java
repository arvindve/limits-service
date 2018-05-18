package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfiguration {

    @Value("foo.email")
    private String email;

    @Value("foo.team")
    private String team;


    public String getEmail() {
        return email;
    }


    public String getTeam() {
        return team;
    }


}
