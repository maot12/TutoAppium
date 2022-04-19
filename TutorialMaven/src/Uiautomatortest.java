import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Uiautomatortest extends conectorAndroidDriver{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		/*int s = driver.findElements(By.className("android.widget.TextView")).size();
		
		System.out.println(s);
		
		List<WebElement> a = driver.findElements(By.className("android.widget.TextView"));
		
		System.out.println(a.get(5).getAttribute("resource-id"));
		
		
		//a.get(5).click();
		 */
		
		
		AndroidDriver driver = capabilities();
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Views']")).click();
		
		List<WebElement> a = driver.findElements(By.className("android.widget.TextView"));
		
		System.out.println(a.get(0).getAttribute("clickable"));	

	}

}
