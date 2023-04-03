package seleniumsession;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		//brUtil.init_browser("chrome");
		brUtil.init_browser("firefox");
		brUtil.NavigateUrl("https://www.amazon.com");

		String title = brUtil.getTitle();
		System.out.println(title);

		if (title.contains("Amazon")) {
			System.out.println("Correct title");

		} else {
			System.out.println("Not a correct URLs ");
		}
		System.out.println(brUtil.getPageSource().contains("interactions"));
	}

}
