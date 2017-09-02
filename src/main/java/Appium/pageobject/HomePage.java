package Appium.pageobject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePage extends InitPage{
    public HomePage(AppiumDriver<WebElement> driver){
        super(driver);
    }

    @AndroidFindBy(id="com.aicai.axd:id/tab_mine")
    @iOSXCUITFindBy(xpath = "//*[@name=\"爱又米\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[5]")
    @WithTimeout(time = 5000, unit = TimeUnit.MILLISECONDS)
    public MobileElement mineTab;

    public void clickMine(){
        mineTab.click();
    }



}
