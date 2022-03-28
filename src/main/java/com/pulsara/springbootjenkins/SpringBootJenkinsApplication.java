package com.pulsara.springbootjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootJenkinsApplication {

    public static Logger log = Logger.getLogger(SpringBootJenkinsApplication.class.getName());

    @PostConstruct
    public void init() {
        log.info("Application started");

    }



    public static void main(String[] args) {
        log.info("application executed");
        SpringApplication.run(SpringBootJenkinsApplication.class, args);
    }

}
