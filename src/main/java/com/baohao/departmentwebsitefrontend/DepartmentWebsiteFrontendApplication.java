package com.baohao.departmentwebsitefrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DepartmentWebsiteFrontendApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DepartmentWebsiteFrontendApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DepartmentWebsiteFrontendApplication.class, args);
    }
}
