package tableHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(4000);
		
	//	driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	//	List<WebElement> list = driver.findElements(By.xpath("//a[text()='Joe.Root']/parent::td/following-sibling::td"));
		//table[@class='table hover']//child::tbody/tr/td
		
		clickUser("Joe.Root");
		clickUser("John.Smith");
		List<String> info = getInfo("John.Smith");
		System.out.println(info);
		List<String> joeinfo = getInfo("Joe.Root");
		System.out.println(joeinfo);
		System.out.println("User Role :  "+info.get(0));
		System.out.println("Employe Name :  "+info.get(1));
		System.out.println("Status : "+info.get(2));

	}

	public static void clickUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	public static List<String> getInfo(String userName) {
		List<WebElement> list = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userInfo = new ArrayList<String>();
		for(WebElement e:list) {
			String text = e.getText();
			userInfo.add(text);
		}
		return userInfo;
	}
}
