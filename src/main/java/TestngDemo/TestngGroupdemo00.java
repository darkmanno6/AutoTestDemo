package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by HWB on 2017/6/15.
 * group测试2
 */
public class TestngGroupdemo00 extends BaseTest{
    final Logger logger = LoggerFactory.getLogger(TestngGroupdemo00.class);

    @Test(groups = {"test000"})
    public void test000(){
        logger.info("test000");
    }

}
