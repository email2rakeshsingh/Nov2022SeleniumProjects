package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderHandel {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		selectFuturedate("June 2025", "15");

	}

	public static void selectFuturedate(String expMonthYear, String dateNum) {
		String actMonthdate = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		System.out.println(expMonthYear);

		while (!actMonthdate.equalsIgnoreCase(expMonthYear)) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			actMonthdate = driver.findElement(By.cssSelector("div.ui-datepicker-title")).getText();
		}
		datePicker(dateNum);
	}

	public static void datePicker(String dateNum) {
		driver.findElement(By.xpath("//a[@class='ui-state-default'][text()='" + dateNum + "']")).click();

	}

}
