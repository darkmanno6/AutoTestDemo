package Appium;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class IosAppium {
    private static IOSDriver<WebElement> driver;

    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("platformVersion", "10.3");
        capabilities.setCapability("deviceName", "iPhone 6s");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("udid", "07fe7964897592db864978df79c0bf003ea94f7f");
//        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);
        capabilities.setCapability("bundleId", "com.aixuedai.axd");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("useNewWDA", "false");
        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("启动成功");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByIosNsPredicate("type='XCUIElementTypeStaticText' AND label='我的'").click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("点击我的，然后结束进程");
    }
}
