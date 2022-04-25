import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;

@SuppressWarnings("deprecation")
public class scrolling extends conectorAndroidDriver {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		String scrollable = "new UiScrollable(new UiSelector()).scrollIntoView(text(\\\"WebView3\\\"));";
		
		try {
			
			AndroidDriver driver = capabilities();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			
			driver.findElement(MobileBy.AndroidUIAutomator(scrollable)).click();
						
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
