package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PaginationWebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		while (true) {

			if (driver.findElements(By.xpath("//td[text()='Ukraine']")).size() > 0) {
				// selectCity("Rakesh");
				relativeLoct("Ukraine");
				break;

			} else {
				Thread.sleep(1000);
				WebElement next = driver.findElement(By.linkText("Next"));
				if (next.getAttribute("class").contains("disabled")) {
					System.out.println("next is dissable not found ");
					break;

				}
				next.click();
				Thread.sleep(2000);
			}

		}

	}

//	public static void selectCity(String cityName) {
//		String check_xpath = "//td[text()='" + cityName + "']//preceding-sibling::td/child::input[@type='checkbox']";
//		driver.findElement(By.xpath(check_xpath)).click();
//	}

	public static void relativeLoct(String CountryName) {
		WebElement ele = driver.findElement(By.xpath("(//td[text()='" + CountryName + "'])[1]"));
		driver.findElement(with(By.xpath("//input[@type='checkbox']")).toLeftOf(ele)).click();

	}

}
