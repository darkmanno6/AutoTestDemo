package TestngDemo;

import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by HWB on 2017/4/12.
 */
public class BaseTest {
    private Collection collection;

    @BeforeSuite
    public void setUpsuite() {
        System.out.println("@BeforeSuite - setUp:");
        System.out.println("吊炸天");
    }

    @AfterSuite
    public void tearDownsuite() {
        System.out.println("@AfterSuite - tearDown");
    }


    @BeforeTest
    public void setUptest() {
        collection = new ArrayList();
        System.out.println("@BeforeTest - setUp");
    }

    @AfterTest
    public void tearDowntest() {
        collection.clear();
        System.out.println("@BeforeTest - tearDown");
    }

    @BeforeMethod
    public void setUp() {
        collection = new ArrayList();
        System.out.println("@BeforeMethod - setUp");
    }

    @AfterMethod
    public void tearDown() {
        collection.clear();
        System.out.println("@AfterMethod - tearDown");
    }

    @BeforeClass
    public void oneTimeSetUp() {
        // one-time initialization code
        System.out.println("@BeforeClass - oneTimeSetUp");
    }

    @AfterClass
    public void oneTimeTearDown() {
        // one-time cleanup code
        System.out.println("@AfterClass - oneTimeTearDown");
    }
}
