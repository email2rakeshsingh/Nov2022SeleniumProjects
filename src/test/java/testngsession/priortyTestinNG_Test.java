package testngsession;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class priortyTestinNG_Test {
	WebDriver driver;

	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}

	@Test(enabled = true, priority = 1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is :" + title);
		Assert.assertEquals(title, "Account Login");

	}

	@Test(priority = 5)
	public void UrlTest() {
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Page current URL :" + CurrentURL);
		Assert.assertTrue(CurrentURL.contains("route=account/login"));

	}

	@Test(priority = 3)
	public void LoginLink() {
		WebElement Link = driver.findElement(By.linkText("Login"));
		System.out.println("Login link text :" + Link);
		Assert.assertEquals(true, Link.isDisplayed());
	}

	@Test(priority = 4)
	public void SearchBox() {
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='search']"));
		System.out.println("Serch box ix persent :" + SearchBox);
		Assert.assertEquals(true, SearchBox.isDisplayed());
	}

	@Test(priority = 6)
	public void ContButton() {
		WebElement contiune = driver.findElement(By.linkText("Continue"));
		System.out.println("Contine button is present :" + contiune);
		Assert.assertEquals(true, contiune.isDisplayed());
	}

	@AfterMethod
	public void TearDown() {
		//driver.close();
	}

}
