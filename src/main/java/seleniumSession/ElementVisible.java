package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisible {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		
//		WebElement logo = driver.findElement(By.cssSelector(".img-responsive"));
//		boolean displayed = logo.isDisplayed();
//		System.out.println(displayed);
//		System.out.println(logo.isEnabled());
//		
	WebElement submit = driver.findElement(By.id("submitButton"));
//		System.out.println(submit.isDisplayed()); //true
//		System.out.println(submit.isEnabled()); // false
		
		WebElement checkbox =driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.isDisplayed()); //true
		System.out.println(checkbox.isEnabled()); // true
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		System.out.println(checkbox.isDisplayed()); // true
		System.out.println(checkbox.isEnabled()); //true
		
		System.out.println(submit.isDisplayed()); //true
		System.out.println(submit.isEnabled()); // true
	}

}
