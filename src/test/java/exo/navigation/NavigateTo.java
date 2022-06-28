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

        //Android properties
        String deviceNameAndroid = (String) environmentVariables.getProperty("android-capabilites.deviceName");
        String platformVersinAndorid = (String) environmentVariables.getProperty("android-capabilites.platformVersion");
        String UUIDAndorid = (String) environmentVariables.getProperty("android-capabilites.uuid");
        String newCommandTimeout = (String) environmentVariables.getProperty("android-capabilites.newCommandTimeout");
        String appLocation = (String) environmentVariables.getProperty("android-capabilites.app");
        String browserAndroid = (String) environmentVariables.getProperty("webdriver.driver");

        //iOS Properties
        String platformVersinIOS = (String) environmentVariables.getProperty("ios-capabilites.platformVersion");
        String deviceNameIOS = (String) environmentVariables.getProperty("ios-capabilites.deviceName");
        String browserIOS = (String) environmentVariables.getProperty("ios-capabilites.browser");

        //Setting capabilities based on what mobile driver is specified in serenity.conf file
        if (mobileBrowser.equalsIgnoreCase("iOS")) {
            //        45681C4C-410C-45B0-9FAB-4F78645B4564
            caps.setCapability("platformName", mobileBrowser);
            caps.setCapability("deviceName",deviceNameIOS);
            caps.setCapability("platformVersion", platformVersinIOS);
            caps.setCapability(CapabilityType.BROWSER_NAME, browserIOS);
            //            caps.setCapability("app", "/Users/halleyshort/Library/Developer/Xcode/DerivedData/WebDriverAgent-ciegwgvxzxdrqthilmrmczmqvrgu/Build/Products/Debug-iphonesimulator/IntegrationApp.app");
        } else if (mobileBrowser.equalsIgnoreCase("android")) {
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, mobileBrowser);
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersinAndorid);
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceNameAndroid);
            caps.setCapability(MobileCapabilityType.UDID, UUIDAndorid);
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, newCommandTimeout);
            caps.setCapability(MobileCapabilityType.APP, appLocation);
            caps.setCapability(MobileCapabilityType.BROWSER_NAME, browserAndroid);
        }
    }


}
