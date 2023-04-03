package seleniumsession;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownOption {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		By Country = By.id("Form_getForm_Country");
		By NoOfEmployees = By.id("Form_getForm_NoOfEmployees");

		//printSelectDropDownValu(Country);
		selectValuefromselectDropdown(Country, "India");
		Thread.sleep(5000);
		selectValuefromselectDropdown(NoOfEmployees, "76 - 100");
		

//		Select select1 = new Select(driver.findElement(NoOfEmployees));
//		List<WebElement> NoOfEmployees1 = select1.getOptions();
//		System.out.println(NoOfEmployees1.size());
//		for (WebElement e1 : NoOfEmployees1) {
//			String Test1 = e1.getText();
//			System.out.println(Test1);
//
//		}
//
//		Select select = new Select(driver.findElement(Country));
//		List<WebElement> countryOption = select.getOptions();
//		System.out.println(countryOption.size());
//
//		for (WebElement e : countryOption) {
//			String text = e.getText();
//			System.out.println(text);
//
//		}
//
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getSelectDropDownValuescount(By locator) {
		return getElements(locator).size();
	}

	public static void selectValuefromselectDropdown(By locator,String value) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOption = select.getOptions();
		
		
		for (WebElement e : countryOption) {
			String text = e.getText();
			if (text.contains(value)) {
				e.click();
				break;
				
			}
		}

		}

	public static void printSelectDropDownValu(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> countryOption = select.getOptions();
		System.out.println(countryOption.size());
		for (WebElement e : countryOption) {

			String text = e.getText();
			System.out.println(text);

		}

	}

}
