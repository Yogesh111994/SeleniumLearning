package seleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://classic.crmpro.com/");

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(3000);
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		driver.findElement(By.linkText("CONTACTS")).click();
		
		//a[text()='Anusha N']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		userClick("Abrar Zahin");
		companyName("Abrar Zahin");
		phoneNumber("Abrar Zahin");
		homeNumber("Abrar Zahin");
		mobileNumber("Abrar Zahin");
		email("Abrar Zahin");
							
	}

	public static void userClick(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void companyName(String userName) {
		String text = driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();
		System.out.println(text);
	}
	
	public static void phoneNumber(String userName) {
		String text = driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td)[2]/span[@context='phone']")).getText();
		System.out.println(text);
	}
	
	public static void homeNumber(String userName) {
		String text = driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td)[3]/span[@context='phone']")).getText();
		System.out.println(text);
	}
	
	public static void mobileNumber(String userName) {
		String text = driver.findElement(By.xpath("(//a[text()='"+userName+"']/parent::td/following-sibling::td)[4]/span[@context='phone']")).getText();
		System.out.println(text);
	}
	
	public static void email(String userName) {
		String text = driver.findElement(By.xpath("(//a[text()='Abrar Zahin']/parent::td/following-sibling::td)[5]/a")).getText();
		System.out.println(text);
	}
	
}
