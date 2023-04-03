package StaleElementRefExceptionConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		  // driver.findElement(By.id("input-email")).sendKeys("email2rakesh@gmail.com");
		
	WebElement emailID=	driver.findElement(By.id("input-email"));
	emailID.sendKeys("email2rakeshsingh@gmail.com");
	Thread.sleep(5000);
	driver.navigate().refresh();
	 emailID=	driver.findElement(By.id("input-email"));
	 emailID.sendKeys("neha@gmail.com");
		  

	}

}
