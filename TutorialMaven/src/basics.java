import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

public class basics extends base{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id class name
		
	}
}
