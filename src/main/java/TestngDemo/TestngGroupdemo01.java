package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/6/15.
 * group测试1
 */


public class TestngGroupdemo01 extends BaseTest{
    final Logger logger = LoggerFactory.getLogger(TestngGroupdemo01.class);

//    @Test(groups = {"start"})
//    public void test000(){
//        logger.info("test000");
//    }



    @Test(groups = {"testgroup1","testgtoup1111"})
    public void test001(){
        logger.info("test001");
    }

    @Test(groups = {"testgroup1"})
    public void test002(){
        logger.info("test002");
    }

    @Test(groups = {"testgroup1"})
    public void test003(){
        logger.info("test003");
    }
}
