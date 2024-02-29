package shadowDomElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElementHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("chrome://settings/");

		Thread.sleep(4000);

		// driver.findElement(By.id("searchInput")).sendKeys("notification"); // Search
		// field is in shadow dom

		String search_promt = "return document.querySelector(\\\"body > settings-ui\\\").shadowRoot.querySelector(\\\"#toolbar\\\").shadowRoot.querySelector(\\\"#search\\\").shadowRoot.querySelector(\\\"#searchInput\\\")";
	
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
//		//html element ---> Selenium WebElement
		// search prompt is a HTML element need to convert into Selenium Webelement
		
		WebElement search = (WebElement)js.executeScript(search_promt);
		search.sendKeys("Notification");
		
	}

}
