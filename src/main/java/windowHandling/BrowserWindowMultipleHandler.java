package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowMultipleHandler {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String parentID = driver.getWindowHandle();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'facebook')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'twitter')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@href,'youtube')]")).click();
		
		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String>  it = windowsID.iterator();
		while(it.hasNext()) {
			String window = it.next();
			driver.switchTo().window(window);
			System.out.println(driver.getTitle());
			Thread.sleep(1500);
			
			if(!(window.equals(parentID))) {
				driver.close();
			}
		}
		driver.switchTo().window(parentID);
		System.out.println(driver.getCurrentUrl());	
	}

}
