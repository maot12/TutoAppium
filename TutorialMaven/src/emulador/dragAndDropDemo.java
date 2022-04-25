package emulador;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import static io.appium.java_client.touch.offset.ElementOption.element;

@SuppressWarnings("deprecation")
public class dragAndDropDemo extends conectorAndroidDriver {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			AndroidDriver driver = capabilities();
			
			driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
			driver.findElement(By.xpath("//android.widget.TextView[@text='Drag and Drop']")).click();
			
			@SuppressWarnings({ "rawtypes" })
			TouchAction touch = new TouchAction(driver);
			
			//Longpress/move/release
			WebElement source = driver.findElement(By.xpath("//android.view.View[@index='1']"));
			WebElement destin = driver.findElement(By.xpath("//android.view.View[@index='2']"));
			
			/*
			 * touch.longPress(longPressOptions() .withElement(element(source)))
			 * .moveTo(element(destin)) .release() .perform();
			 */
			
			//Código más simplificado			
			touch.longPress(element(source))
			.moveTo(element(destin))
			.release()
			.perform();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
