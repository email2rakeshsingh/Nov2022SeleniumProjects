package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClickAndSendKeys {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By fullName = By.id("Form_getForm_Name");
		By pnoenumber = By.id("Form_getForm_Contact");
		Thread.sleep(5000);
		doSendKey(pnoenumber, "9039014433");
		doSendKey(fullName, "Rakesh kumar singh");

//		Actions act = new Actions(driver);
//		Thread.sleep(5000);
//		
//
//		act.sendKeys(driver.findElement(fullName), "Rakesh kumar singh").perform();
//		Actions act1 = new Actions(driver);
//		act1.sendKeys(driver.findElement(pnoenumber), "9039014433").perform();

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doSendKey(By locatoe, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locatoe), value).build().perform();
	}

}
