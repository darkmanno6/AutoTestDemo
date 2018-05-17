package TestngDemo;

/**
 * Created by HWB on 2017/4/11.
 *
 */
import java.util.*;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestngTagdemo01 extends BaseTest {
    private Collection collection;

    final Logger logger = LoggerFactory.getLogger(TestngTagdemo01.class);


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

    public int give_a(int a){
        PropertyConfigurator.configure("log4j.properties");
        logger.info("hello wasdasd 12313");
        return a;

    }

    public int give_b(int b){
        return b;
    }

    public int add_m(int a, int b){
        return give_a(3)+give_b(4);
    }



    @Test
    public void testAddm(){
        Assert.assertEquals(add_m(1,2),7);
    }

    @Test
    public void testEmptyCollection() {
        Assert.assertEquals(collection.isEmpty(),true);
        System.out.println("@Test - testEmptyCollection");
    }

    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        Assert.assertEquals(collection.size(),1);
        System.out.println("@Test - testOneItemCollection");
    }

    // 2种testng.xml参数传入方法
    @Test(parameters = "variable")
    public void testParameter(String var){
        System.out.println("@Test - 传入参数为：" + var);
    }

    @Test
    @Parameters({"variable"})
    public void testParameters(String var){
        System.out.println("@Test - 传入参数为：" + var);
    }

    // DataProvide参数化，数据驱动
    @Test(dataProvider = "variable")
    public void testDataProvider(String user, String pass){
        System.out.println("@Test - DataProvider传入参数为：" + user +" "+ pass);
    }

    @DataProvider(name = "variable")
    public Object[][] Variable(){
        return new Object[][]{
                {"root","passowrd"},
                {"admin","admin123"}};
    }


    @Test(dataProvider = "user")
    public void testDataProvier1(String user){
        System.out.println("@Test - DataProvider传入参数为：" + user);
    }

    @DataProvider(name = "user")
    public Object[] getuser(){
        return new Object[]{"nick", "hello"};
    }

}