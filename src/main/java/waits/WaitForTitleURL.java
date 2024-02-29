package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class WaitForTitleURL {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		By aboutUSLink = By.linkText("About Us");

		driver.findElement(aboutUSLink).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if(wait.until(ExpectedConditions.titleContains("about11"))) {
		System.out.println(driver.getTitle());
		}

//		String waitForTitleIs = waitForTitleIs("about11", 10);
//          System.out.println(waitForTitleIs);
	}
	public static String waitForTitleIs(String title, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (TimeoutException e) {
			System.out.println(title + " title value is not present....");
			e.printStackTrace();
		}
		return null;

	}
}
