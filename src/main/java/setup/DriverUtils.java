package setup;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class DriverUtils {

    public static DesiredCapabilities configurationCapabilities() {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_4_API_34");
        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        dc.setCapability("appActivity", "com.google.android.apps.chrome.Main");
//        dc.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//        dc.setCapability("appPackage", "com.android.chrome");
        dc.setCapability("chromedriverExecutable", "C:\\Users\\Vlad\\Desktop\\chromedriver.exe");
//        dc.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
        dc.setCapability("avd", "Pixel_4_API_34");
//        dc.setCapability("avdReadyTimeout", 120000);
//        dc.setCapability("isHeadless", true);
//        dc.setCapability("enablePerformanceLogging", true);
//        dc.setCapability(MobileCapabilityType.NO_RESET, false);
//        dc.setCapability(MobileCapabilityType.FULL_RESET, false);
        dc.setCapability(ChromeOptions.CAPABILITY, DriverUtils.configurationChromeOptions());
        return dc;
    }


    public static ChromeOptions configurationChromeOptions() {
        ChromeOptions co = new ChromeOptions();
//        co.addArguments("--incognito");
        co.addArguments("--no-first-run");
        co.addArguments("--disable-fre");
        return co;
    }

}
