package Appium.initappium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.net.URL;


public class MobileAppiumInit {
    private static IOSDriver<WebElement> iosDriver;
    private static AndroidDriver<WebElement> androidDriver;
    private final static Logger logger = LoggerFactory.getLogger(MobileAppiumInit.class);

    // 切换platform，参数为android或者iOS
    private static String platform = "android";

    // 初始化appium设置
    public MobileAppiumInit() throws MalformedURLException {
        logger.info("初始化appium...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (platform.equalsIgnoreCase("iOS")) {
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("platformVersion", "10.3");
            capabilities.setCapability("deviceName", "iPhone 6s");
            capabilities.setCapability("platformName", "iOS");
            capabilities.setCapability("udid", "07fe7964897592db864978df79c0bf003ea94f7f");
            capabilities.setCapability("bundleId", "com.aixuedai.axd");
            capabilities.setCapability("noReset", "true");
            capabilities.setCapability("useNewWDA", "false");
            capabilities.setCapability("xcodeOrgId", "VPE4QH4M75");//
            capabilities.setCapability("xcodeSigningId", "iPhone Developer: test aiyoumi");
            iosDriver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } else if (platform.equalsIgnoreCase("android")) {
            capabilities.setCapability("appPackage", "com.aicai.axd");
            capabilities.setCapability("appActivity", "com.aixuedai.axd.common.activity.SplashActivity");
            capabilities.setCapability("platformName", "android");
            capabilities.setCapability("deviceName", "WCH7N15A22015317");
            capabilities.setCapability("udid", "WCH7N15A22015317");
            capabilities.setCapability("platformVersion", "4.4");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 300);
            capabilities.setCapability("unicodeKeyboard", true);
            capabilities.setCapability("resetKeyboard", true);
            capabilities.setCapability("recreateChromeDriverSessions", true);
            capabilities.setCapability("noReset", true);
            androidDriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } else {
            logger.error("Wrong platform args!!!");
        }

        logger.info("appium初始化成功");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取driver实例
     * @return 返回driver实例
     */
    public AppiumDriver<WebElement> getDriver() {
        logger.info("获取driver实例.");
        if (platform.equalsIgnoreCase("iOS")) {
            return iosDriver;
        } else if (platform.equalsIgnoreCase("android")) {
            return androidDriver;
        } else {
            logger.error("Wrong platform args!!!");
            return null;
        }
    }
}
