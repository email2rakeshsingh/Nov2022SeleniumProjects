package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		List<WebElement> countryOption = driver.findElements(By.xpath("//select[@id='Form_getForm_Country']/option"));
		System.out.println(countryOption.size());

		for (WebElement e : countryOption) {

			String text = e.getText();
			System.out.println(text);

		}

	}

}
