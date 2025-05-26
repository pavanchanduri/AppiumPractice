package AppiumTests;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TestAndroidOptions {

    @org.testng.annotations.Test
    public void testAndroid() throws MalformedURLException, URISyntaxException {
        String appUrl = System.getProperty("user.dir")+ File.separator+"src"+File.separator+"main"+File.separator
                +"resources"+File.separator+"ApiDemos-debug.apk";

        //Set capabilities using Options
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options
                .setDeviceName("Pixel 9 Pro XL")
                .setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2)
                .setApp(appUrl)
                .setUdid("emulator-5554")
                .setPlatformName(MobilePlatform.ANDROID).setAvd("Pixel_9_Pro_XL")
                .setAvdLaunchTimeout(Duration.of(180, ChronoUnit.SECONDS));

        URL url = new URI("http://0.0.0.0:4723/").toURL();
        AppiumDriver driver = new AndroidDriver(url, uiAutomator2Options);
        System.out.println("Session Id: "+driver.getSessionId());
    }
}
