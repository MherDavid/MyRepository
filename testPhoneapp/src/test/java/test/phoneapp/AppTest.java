package test.phoneapp;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.junit.Before;
import org.junit.Test;

public	class AppTest{
	
	private AppiumDriver<AndroidElement> driver;
	
	@Before
	public void connectApp()throws MalformedURLException {
		System.out.println("-----Run the application------");
		// set up appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName","TestPhone");
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("app", "/home/student/workspace/MyRepository/PhoneApp/bin/PhoneApp.apk");
		capabilities.setCapability("appPackage", "com.example.phoneapp");
		capabilities.setCapability("appActivity", ".MainActivity");
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
	}
	/*
	public void text(@Named("ourText") String ourText, @Named("id") String id){
		AndroidElement click = driver.findElement(By.id(id));
		click.sendKeys(ourText);
	}
	public void checkTextEditor(@Named("expectedText") String expectedText, @Named("id") String id){
	try{
		AndroidElement click = driver.findElement(By.id(id));
		String realText = click.getText();
		Assert.assertEquals(expectedText, realText);
	} catch(Exception e) {
		e.printStackTrace();	
	}
}*/
		@Test
		public void scroll() throws InterruptedException{
		/*driver.scrollTo("Click").click();
		driver.findElement(By.id("imageSwitcher1")).click();*/
		AndroidElement listView = driver.findElement(By.id("myListView"));
		Point location = listView.getCenter();
	    Dimension size = listView.getSize();

		Thread.sleep(5000);
		int startY = (int) (location.y + size.height * 0.4);
	    int endY = (int) (location.y - size.height * 0.4); 
	       
	      driver.swipe(location.x, startY, location.x, endY, 5000);
		
		
		
	}
}