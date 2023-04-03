package seleniumsession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> linkText = driver.findElements(By.tagName("a"));
		System.out.println("Total link of Size:" + linkText.size());

//		for (int i = 0; i < linkText.size(); i++) {
//			String text = linkText.get(i).getText();
//			String hrefval= linkText.get(i).getAttribute("herf");
//			if (!text.isEmpty()) {
//
//				System.out.println(text +""+hrefval);
//			}
//
//		}

		for (WebElement e : linkText) {
			String text = e.getText();
			String hrefval = e.getAttribute("href");
			if (!text.isEmpty()) {
				System.out.println(text);

			}

		}

	}

}
