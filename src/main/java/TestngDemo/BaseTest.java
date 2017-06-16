package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by HWB on 2017/4/12.
 */


public class BaseTest {
    final Logger logger = LoggerFactory.getLogger(BaseTest.class);

    @BeforeSuite
    public void setUpsuite() {
        System.out.println("@BeforeSuite - setUp:");
    }

    @AfterSuite
    public void tearDownsuite() {
        System.out.println("@AfterSuite - tearDown");
    }

    @Test(groups = {"start"})
    public void test000(){
        logger.info("test000");
    }

}
