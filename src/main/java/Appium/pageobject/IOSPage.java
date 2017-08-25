package Appium.pageobject;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class IOSPage extends InitPage {
    public IOSPage(IOSDriver<WebElement> driver){
        super(driver);
    }

//    @iOSFindBy(xpath = "//*[@name=\"爱又米\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    @iOSXCUITFindBy(xpath = "//*[@name=\"爱又米\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]")
    @WithTimeout(time = 5000, unit = TimeUnit.MILLISECONDS)
    private MobileElement homeTab;

    public void clickHome(){
        homeTab.click();
    }



}
