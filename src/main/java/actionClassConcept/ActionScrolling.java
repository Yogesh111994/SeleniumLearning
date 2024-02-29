package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionScrolling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.PAGE_UP).perform();

		//CMD/CNTRL + ARROW KEY DOWN
		//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		//		Thread.sleep(1000);
		//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
		//		Thread.sleep(1000);
		//		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();

		WebElement blog = driver.findElement(By.xpath("//a[text()=\"Careers\"]"));
		act.moveToElement(blog).click(blog).perform();

	}

}
