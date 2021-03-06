package draft;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 简单的ios demo，直接运行主函数即可
 */
public class IOSDemo01 {

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
        capabilities.setCapability("xcodeOrgId", "VPE4QH4M75");//
        capabilities.setCapability("xcodeSigningId", "iPhone Developer: test aiyoumi");

        driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("启动成功");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElementByIosNsPredicate("type='XCUIElementTypeStaticText' AND label='购物'").click();
//        driver.findElementByIosNsPredicate("type='XCUIElementTypeStaticText' AND label='我的'").click();
//        driver.findElementByXPath("//*[@name=\"爱又米\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]").click();
        driver.findElementByIosNsPredicate("type='XCUIElementTypeStaticText' AND label='自动化测试'").click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("点击我的，然后结束进程");
    }
}
