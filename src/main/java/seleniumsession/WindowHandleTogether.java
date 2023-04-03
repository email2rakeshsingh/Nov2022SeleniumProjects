package seleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogether {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		Thread.sleep(5000);

		String ParentWindowID = driver.getWindowHandle();

		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[2]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[3]")).click();
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a[4]")).click();

		Set<String> handels = driver.getWindowHandles();

		Iterator<String> it = handels.iterator();

		while (it.hasNext()) {
			String windowID = it.next();
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());

			if (!windowID.equals(ParentWindowID)) {
				driver.close();

			}

		}
		driver.switchTo().window(ParentWindowID);
		System.out.println(driver.getTitle());

	}

}
