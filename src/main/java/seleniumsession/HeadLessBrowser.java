package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	ChromeOptions op = new ChromeOptions();
	//op.setHeadless(true);
		//op.addArguments("--Headless");
		op.addArguments("--incognito" );
		
		
//		FirefoxOptions op = new FirefoxOptions();
//		op.setHeadless(true);
//		op.addArguments("-- incognito" );

		//WebDriver driver = new FirefoxDriver(op);
		WebDriver driver=new ChromeDriver(op);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
