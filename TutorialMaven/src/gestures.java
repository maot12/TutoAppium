import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
 
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.android.AndroidDriver;



@SuppressWarnings("deprecation")
public class gestures extends conectorAndroidDriver{

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			AndroidDriver driver = capabilities();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			
			//Como hacer el gesto Tap
			
//			  TouchAction touch = new TouchAction(driver); 
//			  
//			  WebElement expandList = driver
//					  .findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']")); 
//			  touch.tap(tapOptions()
//					  .withElement(element(expandList)))
//			  .perform();
			 			
			//Como hacer LongPress
						
			  TouchAction touch = new TouchAction(driver);
			  
			  WebElement expandList = driver
					  .findElement(By.xpath("//android.widget.TextView[@text='Expandable Lists']"));
			  touch.tap(tapOptions()
					  .withElement(element(expandList)))
			  .perform();
			  
			  driver
			  .findElement(By.xpath("//android.widget.TextView[@text='1. Custom Adapter']"))
			  .click();
			  
			  WebElement longPre = driver
					  .findElement(By.xpath("//android.widget.TextView[@text='People Names']")); 
			  touch.longPress(longPressOptions()
					  .withElement(element(longPre))
					  .withDuration(ofSeconds(2))) .release() .perform();
			  
			  //Thread.sleep(2000);
					 

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
