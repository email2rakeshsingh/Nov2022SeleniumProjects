package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();

		Set<String> handels = driver.getWindowHandles();
		Iterator<String> it = handels.iterator();

		String ParentWindow = it.next();
		System.out.println("parent window id :" + ParentWindow);

		String ChieldWindow = it.next();
		System.out.println("Chiled window id :" + ChieldWindow);

		driver.switchTo().window(ChieldWindow);
		System.out.println("child window title is :" + driver.getTitle());
		driver.close();

		driver.switchTo().window(ParentWindow);
		System.out.println("Parent window title is :" + driver.getTitle());

	}

}
