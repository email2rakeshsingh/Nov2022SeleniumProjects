package testngsession;

import org.testng.annotations.Test;

public class ExpectedExcepetionConcept {
	
	String name ="Rakesh";


	@Test(expectedExceptions = {NullPointerException.class , ArithmeticException.class} )
	public void SearchProductTest() {
		System.out.println("MacBook");
		int  i = 9 / 0;//AE
		
		ExpectedExcepetionConcept obj= new ExpectedExcepetionConcept();
		obj=null;
		System.out.println(obj.name);//NPA
	}
	
	@Test(expectedExceptions=Exception.class)
	public void TestingTest() {
		
	}

}
