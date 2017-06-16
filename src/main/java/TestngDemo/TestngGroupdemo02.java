package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/6/15.
 * group测试2
 */

public class TestngGroupdemo02 extends BaseTest{
    final Logger logger = LoggerFactory.getLogger(TestngGroupdemo02.class);
    @Test(groups = {"test"})
    public void test004(){
        logger.info("test004");
    }
    @Test(groups = {"test"})
    public void test005(){
        logger.info("test005");
    }
    @Test(groups = {"test"})
    public void test006(){
        logger.info("test006");
    }
}
