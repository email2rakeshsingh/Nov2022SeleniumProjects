package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {

		BrowserUtil AmazonLogin = new BrowserUtil();
		WebDriver driver = AmazonLogin.init_browser("chrome");
		AmazonLogin.NavigateUrl(
				"https://www.amazon.in/ap/register?openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");

		String title = AmazonLogin.getTitle();
		System.out.println(title);

		String url = AmazonLogin.getPageUrl();
		System.out.println(url);

		By CutID = By.id("ap_customer_name");
		By PhoneNum = By.id("ap_phone_number");
		By emailId = By.id("ap_email");

		ElementUtil Util = new ElementUtil(driver);
		Util.doSendKeys(CutID, "Rakesh");
		Util.doSendKeys(emailId, "email2rakesh@gmail.com");
		Util.doSendKeys(PhoneNum, "9039014433");

	}

}
