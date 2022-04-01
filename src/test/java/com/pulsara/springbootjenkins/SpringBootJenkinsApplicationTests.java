package com.pulsara.springbootjenkins;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

class SpringBootJenkinsApplicationTests {

    public static Logger log = LoggerFactory.getLogger(SpringBootJenkinsApplication.class.getName());

    @Test
    void contextLoads() {

        log.info("Test case executing...");
        log.info("second log statement...#");
        assertEquals(true,true);
    }

}
