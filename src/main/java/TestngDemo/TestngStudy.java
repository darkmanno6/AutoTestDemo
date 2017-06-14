package TestngDemo;

/**
 * Created by HWB on 2017/4/11.
 *
 */
import java.util.*;

import javastudy.LogStudy;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.*;

public class TestngStudy extends BaseTest {

    private Collection collection;
    final Logger logger = LoggerFactory.getLogger(TestngStudy.class);


    @Step("step赋值a")
    @Attachment
    public int give_a(int a){
        PropertyConfigurator.configure("log4j.properties");
        logger.info("hello wasdasd 12313");
        return a;

    }

    @Step("step赋值b")
    public int give_b(int b){
        return b;
    }

    @Step("step测试")
    public int add_m(int a, int b){
        return give_a(3)+give_b(4);
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

    @Test
    @Features("feature add")
    public void testAddm(){
        Assert.assertEquals(add_m(1,2),7);
    }

    @Test
    @Features("feature1")
    @Stories("stories1")
    public void testEmptyCollection() {
        Assert.assertEquals(collection.isEmpty(),true);
        System.out.println("@Test - testEmptyCollection");
    }

    @Test
    @Features("feature1")
    @Stories("stories2")
    @Title("title测试标题")
    @Description("desc测试")
    @Issue("QATASK-105")
    @TestCaseId("QATASK-105")
    public void testOneItemCollection() {
        collection.add("itemA");
        Assert.assertEquals(collection.size(),1);
        System.out.println("@Test - testOneItemCollection");
    }

    // 2种testng.xml参数传入方法
    @Features("feature2")
    @Stories("stories1")
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
    @Features("feature3")
    @Stories("stories1")
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
}