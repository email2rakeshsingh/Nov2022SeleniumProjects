package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fromdoctopdf {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://hp.myway.com/fromdoctopdf/TTAB02/index.html");

		driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("ipad");

		List<WebElement> list1 = driver.findElements(By.xpath("//span[normalize-space()='pro 2021']"));

		System.out.println(list1.size());
	}

}
