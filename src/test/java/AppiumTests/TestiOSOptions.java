package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TestiOSOptions {

    @org.testng.annotations.Test
    public void testIOSOptions() throws MalformedURLException {

        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
        //Set capabilities using Options
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions
                .setDeviceName("iPhone 16 Pro Max")
                .setAutomationName(AutomationName.IOS_XCUI_TEST)
                .setApp(appUrl)
                .setUdid("E5F959CA-E2CB-4AC4-883B-1AF38139F824")
                .setPlatformName(MobilePlatform.IOS);


        URL url = new URL("http://0.0.0.0:4723/");
        AppiumDriver driver = new IOSDriver(url, xcuiTestOptions);
    }
}
