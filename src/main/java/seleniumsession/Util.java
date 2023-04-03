package seleniumsession;

public interface Util {

	String CHROME_BROWSER = "chrome";
	String FIREFOX_BROWSER = "firefox";
	String SAFARI_BROWSER = "safari";

	

	public String getTitle();

	public String getPageUrl();

	public String getPageSource();

	public void CloseBrowser();

	public void quitBrowser();

	void NavigateUrl(String url);

}
