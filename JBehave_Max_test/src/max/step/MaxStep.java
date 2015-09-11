package max.step;


import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import junit.framework.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


public class MaxStep {
		

	private AppiumDriver<AndroidElement> driver;
	
	@Given("run the program")
	public void running() throws MalformedURLException {
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
	
	
	@When("I input $number")
	public void addNumber(int x){ 
		try {
			AndroidElement add = driver.findElement(By.id("Mher_TEXT"));
			add.sendKeys(String.valueOf(x));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("on the texteditor should writed $result")
	public void testResult(int output) {
		try {
			AndroidElement add = driver.findElement(By.id("Mher_TEXT"));
			String actualText = add.getText();
			String expectedText = String.valueOf(output);
			Assert.assertEquals(expectedText, actualText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@When("I click on the clear button")
	public void click_clear_button(){
		try{
			AndroidElement click = driver.findElement(By.id("clear"));
			click.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("I click on the Mher button")
	public void click_Mher_button(){
		try{
			AndroidElement click = driver.findElement(By.id("Mher"));
			click.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Then("Texteditor should writed $name")
	public void testResult_2(String value){
		try{
			AndroidElement click = driver.findElement(By.id("Mher_TEXT"));
			String realText = click.getText();
			String outcome = value;
			Assert.assertEquals(outcome, realText);
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}

		
	@When("I click on the David button")
	public void click_David_button(){
		try{
			AndroidElement click = driver.findElement(By.name("David"));
			click.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("Texteditor should writed $result2")
	public void testResult3(String output) {
		try {
			AndroidElement add = driver.findElement(By.name("David_T"));
			String actualText = add.getText();
			String expectedText = output;
			Assert.assertEquals(expectedText, actualText);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}