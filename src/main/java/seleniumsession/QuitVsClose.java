package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		String title = driver.getTitle();
		System.out.println(title);
		// driver.quit();
		driver.close();

		System.out.println(driver.getTitle());

	}

}
