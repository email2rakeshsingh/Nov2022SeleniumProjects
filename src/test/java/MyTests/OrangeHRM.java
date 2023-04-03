package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends BaseTest {

	@Test(priority = 1)
	public void LinkTest() {

		WebElement Link = driver.findElement(By.linkText("Platform"));
		System.out.println("verify the link is present :" + Link);
		Assert.assertEquals(true, Link.isDisplayed());
	}

	@Test(priority = 2)
	public void LogoTest() {
		WebElement Logo = driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[1]"));
		System.out.println("Current page logo:" + Logo);
		Assert.assertTrue(Logo.isDisplayed());
	}

	@Test(priority = 3)
	public void SearchBoxTest() {
		WebElement serchBox = driver.findElement(By.xpath("//input[@id='Form_getForm_Email']"));
		System.out.println(" Search box is prent :" + serchBox);
		Assert.assertEquals(true, serchBox.isDisplayed());
	}

}
