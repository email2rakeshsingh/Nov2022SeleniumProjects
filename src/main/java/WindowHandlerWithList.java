import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WindowHandlerWithList {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		Set<String> handels = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(handels);
		String parentID = winList.get(0);
		String ChieldID = winList.get(1);
		driver.switchTo().window(ChieldID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		driver.close();

	}

}
