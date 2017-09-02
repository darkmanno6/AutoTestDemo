package Appium.pageobject;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

class InitPage {
    public AppiumDriver<WebElement> driver;

    InitPage(AppiumDriver<WebElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 1000, TimeUnit.MILLISECONDS), this);
    }

}
