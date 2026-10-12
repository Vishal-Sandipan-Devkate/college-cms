package com.college.cms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public CollegeInfoService collegeInfoService() {
        return new CollegeInfoService();
    }
}
