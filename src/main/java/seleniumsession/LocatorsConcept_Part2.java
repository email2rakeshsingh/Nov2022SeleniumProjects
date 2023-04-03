package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept_Part2 {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/login");

		// 1. Id : is a att.

//		driver.findElement(By.id("input-email")).sendKeys("email2@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("rakesh");

		By Email = By.xpath("//*[@id=\"input-email\"]");
		By Password = By.xpath("//*[@id=\"input-password\"]");
		By button = By.xpath("//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[1]");
		
			doSendKey(Email, "email2rakesh@gmail.com");
			doSendKey(Password, "Rak@123");
			doClick(button);
			

	}

	public static String doGetText(By locator) {

		return getElement(locator).getText();
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKey(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
