package seleniumsession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketCategoryIteration {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement mainEle = driver.findElement(By.cssSelector("a.meganav-shop"));
		Actions act = new Actions(driver);
		act.moveToElement(mainEle).perform();
		Thread.sleep(5000);
		List<WebElement> level1List = driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));

		for (WebElement e1 : level1List) {
			act.moveToElement(e1).perform();
			System.out.println(e1.getText());

			List<WebElement> level2List = driver
					.findElements(By.xpath("(//ul[@class='nav nav-pills nav-stacked'])[last()]//a"));
			for (WebElement e2 : level2List) {

				act.moveToElement(e2).perform();
				System.out.println(e2.getText());

				List<WebElement> level3List = driver.findElements(
						By.xpath("(//div[@class='col-md-4 col-sm-6 col-xs-12 pad-0 change-wid'])[last()]//a"));
				for (WebElement e3 : level3List) {
					act.moveToElement(e3).perform();
					System.out.println(e3.getText());

				}
			}
		}

	}

}
