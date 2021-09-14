package com.ringo.springboot_log;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootLogApplicationTests {
    public static  final Logger logger= LoggerFactory.getLogger(SpringbootLogApplicationTests.class);

    @Test
    void contextLoads() {
        for(int i=0;i<1;i++) {
//            logger.fatal(i);
//            logger.error(i);
//            logger.warn(i);
//            logger.info(i);
//            logger.debug(i);
//            logger.trace(i);
            logger.error(String.valueOf(i));
            logger.info(String.valueOf(i));
            logger.warn(String.valueOf(i));
            logger.debug(String.valueOf(i));
            logger.trace(String.valueOf(i));
        }
    }

}
