package MyTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaitConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");

		By name = By.id("Form_getForm_FullName");
		By email = By.id("Form_getForm_Email");
		By phone = By.id("Form_getForm_Contact");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement name_ele = wait.until(ExpectedConditions.presenceOfElementLocated(name));
		name_ele.sendKeys("Rakesh");

		driver.findElement(email).sendKeys("emai2rakesh@gmail.com");
		driver.findElement(phone).sendKeys("939399393");

	}

}
