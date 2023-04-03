package seleniumsession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		List<WebElement> footerLink = driver.findElements(By.xpath("//footer//ul[@class='footer-nav']//a"));
		System.out.println(footerLink.size());

		for (WebElement e : footerLink) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals("Leadership")) {
				e.click();
				break;

			}

		}

	}

}
