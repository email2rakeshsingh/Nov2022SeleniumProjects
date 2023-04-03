package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

//		String place = driver.findElement(By.id("Form_getForm_Name")).getAttribute("placeholder");
//
//		System.out.println(place);
//		
//		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Rakesh");
//		String value= driver.findElement(By.id("Form_getForm_Email")).getAttribute("value");
//		System.out.println(value);
//		

		By name = By.id("Form_getForm_Name");
		By email = By.id("Form_getForm_Email");

		System.out.println(doGetAttributevalus(email, "placeholder"));

		doSendKey(name, "rakeshsingh");
		System.out.println(doGetAttributevalus(name, "value"));

		if (doIsdisplayed(email)) {
			System.out.println(true);

		}

	}

	public static boolean doIsdisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static void doSendKey(By locator, String values) {
		getElement(locator).sendKeys(values);

	}

	public static String doGetAttributevalus(By locator, String value) {
		return getElement(locator).getAttribute(value);

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
