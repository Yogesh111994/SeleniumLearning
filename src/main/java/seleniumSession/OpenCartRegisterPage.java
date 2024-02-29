package seleniumSession;

import org.openqa.selenium.WebDriver;

import utility.ElementUtil;

public class OpenCartRegisterPage {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		String fName = "input-firstname";
		String lName = "input-lastname";
		String email = "input-email";
		String telephone = "input-telephone";
		String password = "input-password";
		String CnfPassword = "input-confirm";
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys("id", fName, "Yogesh");
		eleUtil.doSendKeys("id", lName, "Biradar");
		eleUtil.doSendKeys("id", email, "Yogesh@gmail.com");
		eleUtil.doSendKeys("id", telephone, "9463728");
		eleUtil.doSendKeys("id", password, "12345");
		eleUtil.doSendKeys("id", CnfPassword, "12345");

	}

}
