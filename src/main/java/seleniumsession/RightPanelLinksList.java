package seleniumsession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelLinksList {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");

		By RightPanelLinks = By.xpath("//div[@class='list-group mb-3']/a");
		List <String> eleText=getElementTestList(RightPanelLinks);
		System.out.println(eleText);
		
		if (eleText.contains("Login")) {
			System.out.println("pass");
			
		}
		//printAllElementsTest(RightPanelLinks);
		//getElementListCount(RightPanelLinks);

//		ElementUtil ele= new ElementUtil(driver);
//		ele.clickOnElementFromSection(RightPanelLinks, "Forgotten Password");
//		
//		
	}

	public static int getElementListCount(By locator) {
		return driver.findElements(locator).size();
	}
	public static List<String> getElementTestList(By locator) {
		List<String> eleTestList= new ArrayList<String>();
		 List<WebElement>eleList= driver.findElements(locator);
		 for (WebElement e : eleList) {
			String text= e.getText();
			eleTestList.add(text);
			
		}
		 return eleTestList;
	}

	public static void printAllElementsTest(By locator) {
		List<WebElement> eleList = driver.findElements(locator);

		for (WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);

		}
	}

}
