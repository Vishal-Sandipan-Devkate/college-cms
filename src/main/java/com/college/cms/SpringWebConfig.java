package com.college.cms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;

@Configuration
public class SpringWebConfig {

    @Bean
    @RequestScope
    public CollegeInfoService collegeInfoService() {
        return new CollegeInfoService();
    }
}
