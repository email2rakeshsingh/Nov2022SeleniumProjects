package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class opencartTest extends BaseTest {
	

	@Test(priority=1)
	public void LinkTest() {
		WebElement Link = driver.findElement(By.linkText("Demo"));
		System.out.println("verify the link is present :" + Link);
		Assert.assertEquals(true, Link.isDisplayed());
	}

	@Test(priority=2)
	public void LogoTest() {
		WebElement Logo = driver.findElement(By.xpath("//img[@title='OpenCart - Account Login']"));
		System.out.println("Current page logo:" + Logo);
		Assert.assertTrue(Logo.isDisplayed());
	}

	@Test(priority=3)
	public void LoginButtonTest() {
		WebElement Loginbutton = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg hidden-xs']"));
		System.out.println(" Search box is prent :" + Loginbutton);
		Assert.assertEquals(true, Loginbutton.isDisplayed());
	}

	

}
