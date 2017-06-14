package webdriver;

/**
 * Created by HWB on 2017/5/8.
 */

import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.testng.Assert.fail;


public class TsQuery {
    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://bk3.aicai.com:20400";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testTsQuery() throws Exception {
        driver.get(baseUrl + "/right/login");
        driver.findElement(By.xpath("//*[@id='accountname']")).clear();
        driver.findElement(By.xpath("//*[@id='accountname']")).sendKeys("18108433263");
        driver.findElement(By.xpath("//input[@type='text' and @id='pwd']")).clear();
        driver.findElement(By.xpath("//input[@type='password' and @id='accountpwd']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='accountpin']")).clear();
        driver.findElement(By.xpath("//*[@id='accountpin']")).sendKeys("123456");
        driver.findElement(By.xpath("//*[@id='loginboss_submit']")).click();


        driver.findElement(By.linkText("渠道管理")).click();
        driver.findElement(By.xpath(".//*[@id='6291']/a")).click();



    }



    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }


}



