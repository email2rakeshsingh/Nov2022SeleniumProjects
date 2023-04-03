package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencartAppTest {
	WebDriver driver;

	@BeforeTest

	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
	}

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is :" + title);
		Assert.assertEquals(title, "Account Login");

	}

	@Test
	public void UrlTest() {
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Page current URL :" + CurrentURL);
		Assert.assertTrue(CurrentURL.contains("route=account/login"));

	}

	@Test
	public void LoginLink() {
		WebElement Link = driver.findElement(By.linkText("Login"));
		System.out.println("Login link text :" + Link);
		Assert.assertEquals(true, Link.isDisplayed());
	}

	@Test
	public void SearchBox() {
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='search']"));
		System.out.println("Serch box ix persent :" + SearchBox);
		Assert.assertEquals(true, SearchBox.isDisplayed());
	}

	@Test
	public void ContButton() {
		WebElement contiune = driver.findElement(By.linkText("Continue"));
		System.out.println("Contine button is present :" + contiune);
		Assert.assertEquals(true, contiune.isDisplayed());
	}

	@AfterTest
	public void TearDown() {
		driver.close();
	}

}
