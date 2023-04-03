package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeToggleButton {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://whenwise.com/users/2835/edit");
		Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		driver.findElement(By.id("login-btn")).click();
		driver.navigate().to("https://whenwise.com/users/2835/edit");

		WebElement ele = driver.findElement(By.xpath("//span[text()='Email on booking confirmation?']"));
		Thread.sleep(5000);
		driver.findElement(with(By.className("lever")).toRightOf(ele)).click();

		WebElement ele1 = driver.findElement(By.xpath("//span[text()='Accept SMS appointment reminder?']"));
		Thread.sleep(5000);
		driver.findElement(with(By.className("lever")).near(ele1)).click();

		WebElement cancel = driver.findElement(By.xpath("//a[@class='btn btn-default btn-flat']"));
		Thread.sleep(5000);
		driver.findElement(with(By.id("save-btn")).near(cancel)).click();

	}

}
