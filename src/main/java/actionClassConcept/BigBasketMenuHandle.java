package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMenuHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		// Actions class:
		// user actions: mouse and keyboard
		driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(4000);
		By  parentMenuLocator = By.xpath("(//span[text()='Category'])[2]");
		WebElement firstChildMenuLocator = driver.findElement(By.xpath("(//a[text()='Snacks & Branded Foods'])[2]"));
		By  secondChildMenuLocator = By.xpath("(//a[text()='Indian Mithai'])");
		By  trhirdChildMenuLocator = By.xpath("(//a[text()='Fresh Sweets'])");
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		driver.findElement(parentMenuLocator).click();
		act.pause(2000)
		     .moveToElement(firstChildMenuLocator)
		           .pause(2000)
		                    .moveToElement(driver.findElement(secondChildMenuLocator))
		                        .pause(2000)
		                                 .moveToElement(driver.findElement(trhirdChildMenuLocator))
		                                        .pause(2000)
		                                                       .build().perform();

	

}
}