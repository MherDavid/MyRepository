package max.step;



import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
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
	
	@Given("gvidon")
	public void afterEachScenare(){	
		System.out.println("********");
	}
	
	@Given("run the application")
	public void running() throws MalformedURLException {
		System.out.println("-----Run the application--------");
		// set up appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
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
	
	@When("I click on the button with <id>")
	public void clickButtonWithId(@Named("id") String buttonId){
		try{
			AndroidElement click = driver.findElement(By.id(buttonId));
			click.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("I click on the button with name $buttonName")
	public void clickButtonWithName(@Named("buttonName") String buttonName){
		try{
			AndroidElement click = driver.findElement(By.name(buttonName));
			click.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Then("text editor whith id $textEditorId should be <Text>")
	@Alias("text editor with this id $textEditorId should be $Text")
	public void checkTextEditorById(@Named("textEditorId") String textId, @Named("Text") String expectedText){
		try{
			AndroidElement click = driver.findElement(By.id(textId));
			String realText = click.getText();
			Assert.assertEquals(expectedText, realText);
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
	
	@Then("text editor with name $textEditorName should be $expectedtext")
	public void checkTextEditorByName(@Named("textEditorName") String editorName, @Named("expectedtext") String expectedText){
		try{
			AndroidElement click = driver.findElement(By.name(editorName));
			String realText = click.getText();
			Assert.assertEquals(expectedText, realText);
		} catch(Exception e) {
			e.printStackTrace();	
		}
	}
	
	
}