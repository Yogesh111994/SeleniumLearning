package testngSession;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test
	public void loginTest() {
		System.out.println("login to app");

	}

	@Test(dependsOnMethods = "loginTest")
	public void searchHomePageTest() {
		System.out.println("search Test");
	}

	@Test(dependsOnMethods = "searchHomePageTest")
	public void addToCartTest() {
		System.out.println("Add to cart ");
	}

	// AAA pattern: Arrange, Act, and Assert
	// no dependency
	// no priority
	// test cases/methods should be independent
}
