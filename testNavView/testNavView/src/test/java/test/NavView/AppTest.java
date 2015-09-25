package test.NavView;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for simple App.
 */
public class AppTest {
	private AppiumDriver<AndroidElement> driver;

	@Before
	public void connectApp() throws MalformedURLException {
		System.out.println("-----Run the application------");
		// set up appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "TestPhone");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("app", "/home/student/workspace/MyRepository/NavigationView-master/app-release.apk");
		capabilities.setCapability("appPackage", "com.android4dev.navigationview");
		capabilities.setCapability("appActivity", ".MainActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}
	
	@Test
	public void testNavView () throws InterruptedException{
		Thread.sleep(5000);
		driver.findElement(By.id("navigation_view")).click();
		/*Dimension size = driver.manage().window().getSize();
		Thread.sleep(5000);
		int startY = (int) (size.height * 0.5);
		int endX = (int) (size.width * 0.8);

		driver.swipe(20, startY, endX, startY, 20000);*/

	}
	
	
	
}
