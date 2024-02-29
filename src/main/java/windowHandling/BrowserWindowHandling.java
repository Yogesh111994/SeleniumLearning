package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// parent

		Thread.sleep(3000);

		String parentID = driver.getWindowHandle();

		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();

		Set<String> windowsID = driver.getWindowHandles();
		Iterator<String> it = windowsID.iterator();

		String parentWindowId = it.next();
		System.out.println(parentWindowId);

		String childWindowId = it.next();

		driver.switchTo().window(childWindowId);

		String title =driver.getTitle();
		System.out.println(title);

		driver.close();
		driver.switchTo().window(parentWindowId);
		String parentURL=driver.getCurrentUrl();
		System.out.println("Parent URL"+ parentURL);


		//browser tab
		//browser window
		//don't use switch.alert

		//switch.window
		//switch.frame
		//switch.alert

	}

}
