package setup;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {

    public static AppiumDriver appiumDriver = null;

    public DriverManager() {
    }

    public static AppiumDriver getWebDriver() {
        if (appiumDriver == null) {
            try {
                URL url = new URL("http://127.0.0.1:4723/");
                appiumDriver = new AndroidDriver(url, DriverUtils.configurationCapabilities());
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return appiumDriver;
    }

    public static void closeWebDriver() throws IOException {
        appiumDriver.close();
        if (appiumDriver !=null) {
            appiumDriver.quit();
            appiumDriver = null;
        }
        Runtime rt = Runtime.getRuntime();
        rt.exec("taskkil /im chromedriver.exe /f /t");
    }
}
