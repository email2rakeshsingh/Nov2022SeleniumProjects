package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest extends BaseTest {
	
	@DataProvider
	public Object[][] getLoginTest() {
		return new Object[][] {
			
			  { "email2rakeshsingh@hmail.com", "test@1234"},
				{ "@#$%%keshsingh@hmail.com", "test@1234" }, 
				{ "email2rakeshsingh@@#$%.com", "test@1234"},
				{ "RSETBDD@hmail.com", "test@1234" }, 
				{ "email2rakeshsingh@hmail.com", "test@1234"}, 
				{ "", ""},
			
		};
		
	}


	@Test(dataProvider ="getLoginTest" )
	public void LoginWithWorngDtaTest(String username, String password) throws InterruptedException {

		driver.get("https://www.opencart.com/index.php?route=account/login");
		Thread.sleep(3000);
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']")).click();
		Thread.sleep(3000);
		String ErrorMsg =
				driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();

		System.out.println(ErrorMsg);
		Thread.sleep(3000);
		Assert.assertTrue(ErrorMsg.contains("No match for E-Mail and/or Password."));

	}

}
