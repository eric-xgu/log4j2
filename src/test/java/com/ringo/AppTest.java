package com.ringo;

import static org.junit.Assert.assertTrue;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    //public static Logger logger= LogManager.getLogger(AppTest.class);
    public static Logger logger= LoggerFactory.getLogger(AppTest.class);
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test(){
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
