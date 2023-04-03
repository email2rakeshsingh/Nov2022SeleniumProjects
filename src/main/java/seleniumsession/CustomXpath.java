package seleniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
//		driver.get("https://www.amazon.in/");
//        driver.findElement(By.xpath("((//div[@class='navFooterLinkCol navAccessibility']//ul)[last()]/li)[last()]/a")).click();
//     
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//driver.findElement(By.xpath("(//input[@id='ohrmList_chkSelectRecord_21'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Joe.Root']//parent::td/preceding-sibling::td/input")).click();
        
	}

}
