package com.college.cms;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support
        .AnnotationConfigWebApplicationContext;

public class SpringContextListener extends ContextLoaderListener {

    public SpringContextListener() {
        super(createContext());
    }

    private static AnnotationConfigWebApplicationContext createContext() {

        AnnotationConfigWebApplicationContext context =
                new AnnotationConfigWebApplicationContext();

        context.register(SpringWebConfig.class);

        return context;
    }
}
