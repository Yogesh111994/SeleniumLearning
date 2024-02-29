package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.ElementUtil;

public class OpenCartLoginTest {

	public static void main(String[] args) {
		

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver=brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		By email = By.id("input-email");
		By password =By.id("input-password");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(email, "yogesh@123");
		eleUtil.doSendKeys(password, "1234");
	}

}
