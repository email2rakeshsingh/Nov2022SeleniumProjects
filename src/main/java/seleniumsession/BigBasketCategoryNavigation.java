package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketCategoryNavigation {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		doProductCatlevel4("Beauty & Hygiene", "Skin Care", "Eye Care", "Face Wash");

	}

	public static void doProductCatlevel4(String l1, String l2, String l3, String l4) throws InterruptedException {

		WebElement mainele = driver.findElement(By.cssSelector("a.meganav-shop"));

		Actions act = new Actions(driver);
		Thread.sleep(5000);
		act.moveToElement(mainele).perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText(l1))).perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText(l2))).perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText(l3))).perform();
		Thread.sleep(5000);
		act.moveToElement(driver.findElement(By.linkText(l4))).click().build().perform();
	}

}
