package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown_SelectClass {

	static WebDriver driver;

	public static void main(String[] args) {

		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/contact-sales/");

		By Country = By.id("Form_getForm_Country");
		By Emp_Count= By.id("Form_getForm_NoOfEmployees");
		//doSelectdorpdownByIndex(Country, 10);
		
		doSelectdorpdownByvisibleText(Emp_Count, "Goa");
		
		
		
//		WebElement ele_select = driver.findElement(Country);
//		WebElement Emp1= driver.findElement(Emp_Count);
//
//		Select select = new Select(ele_select);
//		select.selectByVisibleText("Belgium");
//		
//		
//		Select select1= new Select(Emp1);
//		select1.selectByIndex(6);
//		//select.selectByIndex(5);

	}
	public static WebElement getElement(By locator) {
	 return	driver.findElement(locator);
	}
	
	public static void doSelectdorpdownByIndex(By locator, int index) {
		Select selet = new Select (getElement(locator));
		selet.selectByIndex(index);
	}
	public static void doSelectdorpdownByvisibleText(By locator, String  i) {
		Select selet = new Select (getElement(locator));
		selet.selectByVisibleText(i);
	}
	
	public static void doSelectdorpdownValue(By locator, String Value) {
		Select selet = new Select (getElement(locator));
		selet.selectByValue(Value);
	}
}
