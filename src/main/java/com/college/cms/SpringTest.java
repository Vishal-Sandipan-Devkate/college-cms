package com.college.cms;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                 new AnnotationConfigApplicationContext(SpringConfig.class)) {

            CollegeInfoService service =
                context.getBean(CollegeInfoService.class);

            System.out.println("Spring Framework is working!");
            System.out.println("College: " + service.getCollegeName());
            System.out.println("Department: " + service.getDepartment());
            System.out.println("Application: " + service.getApplicationName());
        }
    }
}
