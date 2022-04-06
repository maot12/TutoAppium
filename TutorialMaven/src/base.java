import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
				
		File appDir = new File("src");
		
		File app = new File(appDir, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		//Línea par declarar el nombre del emulador, cambiar si se requiere
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PruebaAppium");
		
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
	
	}

}
