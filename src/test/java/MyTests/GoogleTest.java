package MyTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{



	@Test(priority=1)
	public void TitleTest() {
		String title = driver.getTitle();
		System.out.println("Title of Google :" + title);
		Assert.assertEquals(title, "Google");
	}

	@Test(priority=2)
	public void getUrlTest() {
		String CurrentURL = driver.getCurrentUrl();
		System.out.println("Current url of Google :" + CurrentURL);
		Assert.assertTrue(CurrentURL.contains("https://www.google.com/"));
	}

	@Test(priority=3)
	public void SearchBoxTest() {
		WebElement serchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
		System.out.println(" Search box is prent :" + serchBox);
		Assert.assertEquals(true, serchBox.isDisplayed());
	}

	

}
