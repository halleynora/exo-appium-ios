package exo.navigation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class NavigateTo {

    DesiredCapabilities caps = new DesiredCapabilities();
    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();
    IOSDriver iosDriver;
    AndroidDriver androidDriver;
    private String mobileBrowser = (String) environmentVariables.getProperty("mobile-browser");


    public void theWeatherChannelHomePage() throws MalformedURLException {


        if (mobileBrowser == "iOS") {
           iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        } else if (mobileBrowser == "android") {
            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }

    }


    @BeforeEach
    void setUp() throws MalformedURLException {

        String deviceNameAndroid = (String) environmentVariables.getProperty("android-capabilites.deviceName");


        if (mobileBrowser.equalsIgnoreCase("iOS")) {
            //        45681C4C-410C-45B0-9FAB-4F78645B4564
            caps.setCapability("platformName", mobileBrowser);
            caps.setCapability("deviceName","iPhone 8 Plus");
            caps.setCapability("platformVersion", "15.5");
            caps.setCapability(CapabilityType.BROWSER_NAME, "Safari");
            //            caps.setCapability("app", "/Users/halleyshort/Library/Developer/Xcode/DerivedData/WebDriverAgent-ciegwgvxzxdrqthilmrmczmqvrgu/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
        } else if (mobileBrowser.equalsIgnoreCase("android")) {

            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, mobileBrowser);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceNameAndroid);
            caps.setCapability(MobileCapabilityType.UDID, "R3CT406J9EE");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            caps.setCapability(MobileCapabilityType.APP, "src/test/resources/app-debug.apk");
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        }
    }


}
