package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTabConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//	// 	firstName.sendKeys("yogesh");
//		Actions act = new Actions(driver);
//		act.sendKeys(firstName, "Yogesh")
//		       .sendKeys(Keys.TAB)
//		       .pause(500)
//		       .sendKeys("Biradar")
//		       .sendKeys(Keys.TAB)
//		       .pause(500)
//		       .sendKeys("abc@gmail.com")
//		       .sendKeys(Keys.TAB)
//		       .pause(500)
//		       .sendKeys("9427478748")
//		       .sendKeys(Keys.TAB)
//	           .pause(500).build().perform();
//		
		
		driver.get("https://www.amazon.com/ref=nav_logo");
		Actions act = new Actions(driver);
		//WebElement name=driver.findElement(By.cssSelector("nav-logo-sprites"));
		
		act.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("macbook")
				.sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
