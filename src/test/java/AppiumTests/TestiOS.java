package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class TestiOS {

    @org.testng.annotations.Test
    public void testIOS() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
        capabilities.setCapability("appium:automationName", AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability("appium:deviceName", "iPhone 16 Pro Max");
        capabilities.setCapability("appium:udid", "E5F959CA-E2CB-4AC4-883B-1AF38139F824");
        capabilities.setCapability("appium:simulatorStartupTimeout", 180000);
//        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
//                +"resources"+File.separator+"UIKitCatalog-iphonesimulator.app";
//        capabilities.setCapability("appium:app", appUrl);
        capabilities.setCapability("appium:bundleId", "com.example.apple-samplecode.UICatalog");

        URL url = new URI("http://0.0.0.0:4723/").toURL();
        AppiumDriver driver = new IOSDriver(url, capabilities);
    }
}
