package Appium.business;

import Appium.init.IOSAppiumInit;
import Appium.pageobject.IOSPage;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class IOSDemo {
    @Test
    public void testIOS() throws MalformedURLException {
        IOSAppiumInit init = new IOSAppiumInit();
        IOSDriver<WebElement> driver = init.getDriver();
        IOSPage demo = new IOSPage(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        demo.clickHome();
        System.out.println("点击我的，然后结束进程");
    }
}
