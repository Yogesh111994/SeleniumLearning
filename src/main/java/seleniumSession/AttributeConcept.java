package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ElementUtil;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();//123
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//webelement + perform action(getAttribute)

		By email = By.id("input-email");
		By  registerLink = By.linkText("Register");
		
		String placeholderValue = driver.findElement(registerLink).getAttribute("class");
		System.out.println(placeholderValue);
		
		String hrefValue = driver.findElement(registerLink).getAttribute("href");
		System.out.println(hrefValue);
		
		ElementUtil eleutil = new ElementUtil(driver);
		String PValue=eleutil.doGetAttribute(email, "placeholder");
		System.out.println(PValue);
		
		String email_id ="input-email";
		String registerLink_Id = "Register";
		String PValue1= eleutil.doGetAttribute("id", email_id, "placeholder");
		System.out.println(PValue1);
		
	}

}
