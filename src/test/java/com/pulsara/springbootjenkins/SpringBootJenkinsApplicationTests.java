package com.pulsara.springbootjenkins;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.LoggerFactory;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootJenkinsApplicationTests {

    public static Logger log = (Logger) LoggerFactory.getLogger(SpringBootJenkinsApplicationTests.class);

    @Test
    void contextLoads() {

        log.info("Test case executing...");
        assertEquals(true,true);
    }

}
