package TestngDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by HWB on 2017/4/12.
 */
public class BaseTest {
    @BeforeSuite
    public void setUpsuite() {
        System.out.println("@BeforeSuite - setUp:");
        System.out.println("吊炸天");
    }

    @AfterSuite
    public void tearDownsuite() {
        System.out.println("@AfterSuite - tearDown");
    }

}
