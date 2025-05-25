package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestiOSOptions {

    @org.testng.annotations.Test
    public void testIOSOptions() throws MalformedURLException, URISyntaxException {

        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
        //Set capabilities using Options
        XCUITestOptions xcuiTestOptions = new XCUITestOptions();
        xcuiTestOptions
                .setDeviceName("iPhone 16 Pro Max")
                .setAutomationName(AutomationName.IOS_XCUI_TEST)
                .setApp(appUrl)
                .setSimulatorStartupTimeout(Duration.of(180, ChronoUnit.SECONDS))
                .setUdid("E5F959CA-E2CB-4AC4-883B-1AF38139F824")
                .setPlatformName(MobilePlatform.IOS);


        URL url = new URI("http://0.0.0.0:4723/").toURL();
        AppiumDriver driver = new IOSDriver(url, xcuiTestOptions);
    }
}
