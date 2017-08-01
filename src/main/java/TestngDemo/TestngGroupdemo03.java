package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/6/15.
 * group测试2
 */
public class TestngGroupdemo03 extends BaseTest{
    final Logger logger = LoggerFactory.getLogger(TestngGroupdemo03.class);

    @Test(groups = {"testgroup3"})
    public void test007(){
        logger.info("test007");
    }
    @Test(groups = {"testgroup3"})
    public void test008(){
        logger.info("test008");
    }
    @Test(groups = {"testgroup3"})
    public void test009(){
        logger.info("test009");
    }
}
