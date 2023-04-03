package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void connectionwithDB() {
		System.out.println("BS--CONNECT WITH db");

	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT--- create user");
	}

	@BeforeClass
	public void launchbrowser() {
		System.out.println("BT--- create user");
	}

	@BeforeMethod
	public void logintoApp() {
		System.out.println("BM--LOGIN TO APP");
	}

	@Test
	public void homepageTitletest() {
		System.out.println("hp---titleTest");

	}

	@Test
	public void HomepagetestURL() {
		System.out.println("hP-----Home page testURL");
	}

	@Test
	public void isUserlogedIntest() {
		System.out.println("Test--user login test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM----logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC ---close browser");
	}

	@AfterTest
	public void delleteUser() {
		System.out.println("delete user");

	}

	@AfterSuite
	public void discunectDBmethod() {
		System.out.println("AS ---disconnect the DB");

	}

}
