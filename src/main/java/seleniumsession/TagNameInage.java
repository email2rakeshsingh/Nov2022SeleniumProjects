package seleniumsession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameInage {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		By image = By.tagName("img");
		By link = By.tagName("a");

		int link1 = getelementcount(link);
		int img = getelementcount(image);
		System.out.println(link1 + ":" + img);

//		List<WebElement> list = driver.findElements(By.tagName("img"));
//		System.out.println("Total image :" + list.size());
//
//		for (WebElement e : list) {
//			String link1 = e.getAttribute("src");
//			String link2 = e.getAttribute("alt");
//			String link3 = e.getAttribute("hight");
//			System.out.println(link1);
//			System.out.println(link2);
//			System.out.println(link3);
//
//		}
	}

	public static int getelementcount(By link) {
		return getElements(link).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);

	}

}
