package seleniumsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {

	public WebDriver driver;

	public WebDriver init_browser(String brwsername) {

		System.out.println("enter correct browser name :" + brwsername);

		if (brwsername.equals(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (brwsername.equals(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (brwsername.equalsIgnoreCase(SAFARI_BROWSER)) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		} else {
			System.out.println("please pass the writr the browser name :" + brwsername);
		}
		return driver;

	}

	@Override
	public void NavigateUrl(String url) {
		if (url == null) {
			return;

		}
		if (url.isEmpty()) {
			return;

		}
		if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("please enter the write browser name");

			return;
		}
		driver.get(url);
	}

	@Override
	public String getTitle() {
		return driver.getTitle();

	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public void CloseBrowser() {
		driver.close();

	}

	@Override
	public void quitBrowser() {
		driver.quit();

	}

}
