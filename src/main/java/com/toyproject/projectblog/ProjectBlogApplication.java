package com.toyproject.projectblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class ProjectBlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectBlogApplication.class, args);
    }



}
