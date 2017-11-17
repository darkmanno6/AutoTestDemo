package TestngDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.TestException;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by HWB on 2017/4/12.
 */


public class BaseTest {
    final Logger logger = LoggerFactory.getLogger(BaseTest.class);
    private Collection collection;

    @BeforeSuite
    public void setUpsuite() {
        logger.info("@BeforeSuite - setUp:");
    }

    @AfterSuite
    public void tearDownsuite() {
        logger.info("@AfterSuite - tearDown");
    }


    @BeforeGroups(groups = "testgroup1")
    public void testgroup1(){
        logger.info("before testbgroup1");
        throw new TestException("测试");
    }

    @AfterGroups(groups = "testgroup1")
    public void aftergroup1(){
        logger.info("after testgroup1");
    }

    @BeforeGroups(groups = "testgroup2")
    public void testgroup2(){
        logger.info("before testbgroup2");
    }

    @AfterGroups(groups = "testgroup2")
    public void aftergroup2(){
        logger.info("after testgroup2");
    }

    @BeforeGroups(groups = "testgroup3")
    public void testgroup3(){
        logger.info("before testgtoup1111");
    }

    @AfterGroups(groups = "testgroup3")
    public void aftergroup3(){
        logger.info("after testgtoup1111");
    }


    @BeforeTest
    public void setUptest() {
        collection = new ArrayList();
        System.out.println("@beforeTest - setUp");
    }

    @AfterTest
    public void tearDowntest() {
        collection.clear();
        System.out.println("@AfterTest - tearDown");
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
