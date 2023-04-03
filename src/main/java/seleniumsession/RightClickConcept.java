package seleniumsession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement link = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act = new Actions(driver);
		act.contextClick(link).perform();
		List<WebElement> rightList = driver.findElements(By.xpath(
				"//ul[@class='context-menu-list context-menu-root']/li [contains(@class, 'context-menu-icon')]"));

		for (WebElement e : rightList) {
			String list1 = e.getText();
			// System.out.println(list1);
			if (list1.equals("Paste")) {
				e.click();
				break;

			}
		}

	}

}
