package testngSession;

import org.testng.annotations.Test;

public class InnvocationCountConcept {

	@Test(invocationCount=3)
	public void searchProductTest() {
		System.out.println("searchProductTest");
	}
}
