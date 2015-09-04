import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MyClass {
	public static void main(String[] args) throws InterruptedException {

	       //Create a new instance of Firefox Browser
	       WebDriver driver = new FirefoxDriver();
	       
	       //Open the URL in firefox browser
	       driver.get("https://www.facebook.com/");
	       //Maximize the Browser window
	       driver.manage().window().maximize();
	      
	       driver.findElement(By.id("email")).sendKeys("xxxxxxx");
	       driver.findElement(By.id("pass")).sendKeys("xxxxxxx");
	       driver.findElement(By.id("u_0_x")).click();
	     
	  /* // Send Message
	       driver.findElement(By.name("mercurymessages")).click();
	       //wait for 20 seconds 
	       WebDriverWait wait = new WebDriverWait(driver, 20); 
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("u_0_7")));
	       driver.findElement(By.id("u_0_7")).click();//To click on Send a New Message Link

	       //To enter a name into the to field 
	       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='inputtext textInput']")));
	       WebElement friendName = driver.findElement(By.xpath("//input[@class='inputtext textInput']"));

	       friendName.sendKeys("David");//Change it with your friend name

	       //wait for the user list to appear
	       wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[@class='user selected']")));
	       friendName.sendKeys(Keys.ENTER);

	       WebElement messageBox = driver.findElement(By.xpath("//textarea[@class='uiTextareaAutogrow _552m']"));
	       //wait.until(ExpectedConditions.visibilityOf(messageBox));
	       messageBox.sendKeys("Hellow asdf");
	       messageBox.sendKeys(Keys.ENTER);*/
	       
	       
	   /*//Wall Post
	       Thread.sleep(2000);
	      driver.findElement(By.id("u_0_11")).sendKeys("Поздравляю с 1 сентября - с Днём знаний");
	       Thread.sleep(2000);
	       driver.findElement(By.className("_42ft _4jy0 _11b _4jy3 _4jy1 selected _51sy")).click();*/
	       
	   
	   // Photo Upload
	      /* Thread.sleep(2000);
	       driver.findElement(By.className("_2dpb")).click();
	       //driver.get("https://www.facebook.com/mhergrigoryan92/photos");
	       Thread.sleep(2000);
	       driver.findElement(By.className("_156p")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.name("photo")).click();
	       WebElement upphoto = driver.findElement(By.name("/home/student/Documents/pic1.jpg"));
	       upphoto.click();
	       Thread.sleep(2000);
	       upphoto.sendKeys(Keys.ENTER);*/
	      
	       
	}
}
