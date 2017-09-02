package Appium.business;

import Appium.initappium.MobileAppiumInit;
import Appium.pageobject.HomePage;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

/**
 * Created by seahe on 2017/9/2.
 * Android demo, PO设计
 */
public class AndroidDemo{
    private static final Logger logger = LoggerFactory.getLogger(AndroidDemo.class);

    @Test
    public void testAndroid() throws MalformedURLException {
        MobileAppiumInit init = new MobileAppiumInit();
        AndroidDriver<WebElement> driver = (AndroidDriver<WebElement>) init.getDriver();
        HomePage demo = new HomePage(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("点击我的");
        demo.clickMine();
        logger.info("等待5s, 结束进程");
        driver.quit();
    }
}
