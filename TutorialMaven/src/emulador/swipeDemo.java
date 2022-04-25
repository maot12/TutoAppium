import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

@SuppressWarnings({ "unused", "deprecation" })
public class swipeDemo extends conectorAndroidDriver{

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		try {
			AndroidDriver driver = capabilities();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']"))
			.click();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Date Widgets']"))
			.click();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='2. Inline']"))
			.click();
			
			driver.findElement(By.xpath("//*[@content-desc='9']"))
			.click();
			
			
			TouchAction touch = new TouchAction(driver);
			//Long press on element 2 seconds and then go to element you realeased
			WebElement fifteen = driver.findElement(By.xpath("//*[@content-desc='15']"));
			WebElement fortyFive = driver.findElement(By.xpath("//*[@content-desc='45']"));
			touch.longPress(longPressOptions()
					.withElement(element(fifteen))
					.withDuration(ofSeconds(2)))
			.moveTo(element(fortyFive))
			.release()
			.perform();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		

	}

}
