package AppiumTests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class TestAndroid {

    @org.testng.annotations.Test
    public void testAndroid() throws MalformedURLException, URISyntaxException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability("appium:automationName", AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities.setCapability("appium:deviceName", "Pixel 9 Pro XL");
        //avd capability launches the android virtual device if its not already open
        capabilities.setCapability("appium:avd", "Pixel_9_Pro_XL");
        capabilities.setCapability("appium:avdLaunchTimeout", 180000);
        capabilities.setCapability("appium:udid", "emulator-5554");
        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"ApiDemos-debug.apk";
        capabilities.setCapability("appium:app", appUrl);
        //capabilities.setCapability("appium:appPackage", "com.google.android.gm");
        //capabilities.setCapability("appium:appActivity", "com.google.android.gm.ComposeActivityGmail");

        URL url = new URI("http://0.0.0.0:4723/").toURL();
        AppiumDriver driver = new AndroidDriver(url, capabilities);
    }
}
