package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);

		eleUtil.doSendKeys(emailId, "email2rakeshsingh@gmail.com");
		eleUtil.doSendKeys(password, "Rak@1234");

	}

	public static void doSendKeys(By locater, String value) {
		getElement(locater).sendKeys(value);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
