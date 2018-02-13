package com.servicescheduler.sap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class JavaScheduler extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(JavaScheduler.class);
    }
    
    public static void main(String args[]){
        SpringApplication springApplication = new SpringApplication(JavaScheduler.class);
        springApplication.addInitializers(new EnvironmentContextInitializer());
        springApplication.run(args);
        
    }
}
