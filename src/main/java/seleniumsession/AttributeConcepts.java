package seleniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AttributeConcepts {

	static ChromeDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		String place= driver.findElement(By.id("Form_getForm_Name")).getAttribute("placeholder");
		System.out.println(place);
		
		driver.findElement(By.id("Form_getForm_Name")).sendKeys("Rakesh");
		String value= driver.findElement(By.id("Form_getForm_Name")).getAttribute("value");
		System.out.println(value);
		

	}

}
