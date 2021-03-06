package Appium.business;

import Appium.initappium.MobileAppiumInit;
import Appium.pageobject.HomePage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


/**
 * Created by seahe on 2017/8/2.
 * iOS demo, PO设计
 */
public class IOSDemo{
    private static final Logger logger = LoggerFactory.getLogger(IOSDemo.class);


    @Test
    public void testIOS() throws MalformedURLException {
        MobileAppiumInit init = new MobileAppiumInit();
        IOSDriver<WebElement> driver = (IOSDriver<WebElement>) init.getDriver();
        HomePage demo = new HomePage(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("点击我的");
        demo.clickMine();
        logger.info("等待5s, 结束进程");

    }
}
