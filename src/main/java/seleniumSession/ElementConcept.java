package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ElementUtil;

public class ElementConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		//webelement:
		//create the webelement + perform an action(click, sendKeys, getText, isDisplayed)

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		

		//DOM:Document Object Model: HTML Code
		//1st: 
//		driver.findElement(By.id("input-email")).sendKeys("yogesh@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("1234");
		
		// 2nd:
//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		email.sendKeys("yogesh@gmail.com");
//		password.sendKeys("1234");
		
		// 3rd: By locator
//		By email = By.id("input-email");
//		By password =By.id("input-password");
//		WebElement emailId = driver.findElement(email);
//		WebElement pass = driver.findElement(password);
//		emailId.sendKeys("yogesh@gmail.com");
//		pass.sendKeys("1234");
		
		// 4th: By locator + generic method for element
//		By email = By.id("input-email");
//		By password =By.id("input-password");
//		getElement(email).sendKeys("yogesh@123");
//		getElement(password).sendKeys("12345");
		
		//5th: By locator + generic method for element and action
//		By email = By.id("input-email");
//		By password =By.id("input-password");
//		doSendKeys(email,"yogesh@gmail.com");
//		doSendKeys(password,"1234");
		
		//6th: By locator + generic method for element and action in other element util class
//		By email = By.id("input-email");
//		By password =By.id("input-password");
//		ElementUtil util = new ElementUtil(driver);
//		util.doSendKeys(email, "yogesh@gmail.com");
//		util.doSendKeys(password, "1234");
		
		//7th: BrowserUtil + ElementUtil 
		// Check OpenCartTesting class
		
		//8th: By locators --> String locators
		 String email ="input-email";
		 String password ="input-password";
        ElementUtil util = new ElementUtil(driver);
        util.doSendKeys("id",email, "yogesh@gmail.com");
        util.doSendKeys("id",password,"12333");
		
        //9th: POM + framework
		
		
	}
	
	public static void doSendKeys(By locator, String value) {
		 getElement(locator).sendKeys(value);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

