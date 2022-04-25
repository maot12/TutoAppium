package emulador;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class conectorAndroidDriver {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		String rootDir = "src";
		String nameApk = "ApiDemos-debug.apk";
		String nameDevice = "PruebaAppium";
		String automationName = "uiautomator2";
		String url = "http://127.0.0.1:4723/wd/hub";
		
		/*-------------------------------------------------------------------------------*/
					
		File app = new File(new File(rootDir), nameApk);
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			cap.setCapability(MobileCapabilityType.DEVICE_NAME,nameDevice);		
			cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
			cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());		
			cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, automationName);
		
		AndroidDriver driver = new AndroidDriver(new URL(url),cap);
		
		return driver;
	
	}

}
