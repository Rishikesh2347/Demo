package demosss;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestData  {
	
	@Test
	public void xx() throws InterruptedException{
	 WebDriver driver;
		FirefoxProfile FF = new FirefoxProfile(new File("C:\\Users\\IBM_ADMIN\\AppData\\Roaming\\Mozilla\\Firefox\\Profiles\\3fyggsfu.default"));   
		driver = new FirefoxDriver(FF);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.id("eLoginNew")).sendKeys("rk21950@gmail.com");
		driver.findElement(By.id("pLogin")).sendKeys("Rishi@2743");
		driver.findElement(By.id("pLogin")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("a[href*='https://my.naukri.com/Ho']"))).build().perform();
		WebDriverWait d=new WebDriverWait(driver,10);
		d.until(ExpectedConditions.elementToBeClickable(By.linkText("Edit Profile")));
		driver.findElement(By.linkText("Edit Profile")).click();  
		js.executeScript("window.scrollTo(0,1700)");
	   driver.findElement(By.id("attachCV")).sendKeys("C:\\Users\\IBM_ADMIN\\Documents\\Rishikesh\\Skillset Development Guide\\3+yr_Selenium_Rishikesh Kumar.doc");
	   driver.quit();
	
	   
	    
			   
	   
	
		
	} 



}



