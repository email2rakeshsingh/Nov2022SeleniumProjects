package seleniumsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		
		Thread.sleep(10000);
		WebElement ele = driver.findElement(By.linkText("Wood Buffalo, Canada"));
		Thread.sleep(10000);
		String rightoftext = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(rightoftext);

		String LEFToftext = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(LEFToftext);
		
		String ABOVEToftext = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(ABOVEToftext);
		
		String BELOWToftext = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(BELOWToftext);
	}

}
