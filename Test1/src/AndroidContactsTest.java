
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

	public class AndroidContactsTest {

	private AppiumDriver<AndroidElement> driver;

	@Before
	public void setUp() throws Exception {
	// set up appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	//capabilities.setCapability("automationName", "Selendroid");
	//capabilities.setCapability("device", "Selendroid");
	capabilities.setCapability("deviceName","TestPhone");
	capabilities.setCapability("platformVersion", "4.4.2");
	capabilities.setCapability("app", "/home/student/workspace/MyRepository/Max/bin/Max.apk");
	capabilities.setCapability("appPackage", "max.org");
	capabilities.setCapability("appActivity", ".MaxActivity");
	driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}
	@After
	public void tearDown() throws Exception {
	driver.quit();
	}
	
	@Test
	public void addText() throws Exception{
	//WebElement el = driver.findElement(By.id("Mher"));
	//el.click();
	driver.findElement(By.id("Mher_TEXT")).sendKeys("Hellowwww");
	//tearDown();
	}
	}