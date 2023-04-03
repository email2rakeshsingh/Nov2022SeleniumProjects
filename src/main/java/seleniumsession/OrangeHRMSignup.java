package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSignup {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver =brUtil.init_browser("chrome");
		brUtil.NavigateUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		String title = brUtil.getTitle();
		System.out.println(title);

		String pageURL = brUtil.getPageUrl();
		System.out.println(pageURL);

		// By Locators - OR
		
		By FavoredName = By.id("Form_getForm_subdomain");
		By FullName= By.id("Form_getForm_Name");
		By phone=By.id("Form_getForm_Contact");
		
		ElementUtil Util= new ElementUtil(driver);
		Util.doSendKeys(FavoredName, "Rakesh");
		Util.doSendKeys(FullName, "Rakesh kumar singh");
		Util.doSendKeys(phone, "9039014433");
		
		

	}

}
