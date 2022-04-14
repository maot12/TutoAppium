import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumBy.ByAndroidViewTag;
import io.appium.java_client.android.AndroidDriver;

public class basics extends conector{
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver driver = capabilities();
		
		/*
		 * Xpath Syntax
		 * tagName[@attribute='value'];
		 * driver.findElement(By.xpath("//android.widget.TextView[@text='Content']")).click();
		 * 
		 */
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		
		driver.findElement(By.id("android:id/checkbox")).click();
		
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("Hello");
		
		driver.findElements(By.className("android.widget.Button")).get(1).click();
			
		

	}
}
