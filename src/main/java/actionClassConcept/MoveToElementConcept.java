package actionClassConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MoveToElementConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		// Actions class:
		// user actions: mouse and keyboard
		driver = new ChromeDriver();

		driver.get("http://mrbool.com/search/?txtsearch=how-to-create-menu-with-submenu-using-css-html");

	//	Actions act = new Actions(driver); 
		By menu = By.cssSelector("a.menulink");
		By subMenue=By.xpath("(//a[text()='Courses'])[2]");
//		act.moveToElement(driver.findElement(menu)).build().perform();
//		act.pause(1000);
//		act.moveToElement(driver.findElement(subMenue)).click().build().perform();

		//act.a1.a2.a3.a4.build().perform();

		//act.a1.perform -- valid
		//act.a1.build.perfom -- valid
		//act.a1.build -- invalid
		//act.a1 -- invalid
		
		parentChildMenu(menu,subMenue);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void parentChildMenu(By menu, By subMenue) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(getElement(menu)).build().perform();
		Thread.sleep(1000);
		driver.findElement(subMenue).click();
	}
}
