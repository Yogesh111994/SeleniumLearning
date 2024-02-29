package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryDropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectmenu/");
		driver.switchTo().frame(0);
		//		driver.findElement(By.xpath("//span[text()='Medium']")).click();
		//		List<WebElement> list = driver.findElements(By.xpath("#speed-menu li"));
		//
		//		for(WebElement e : list) {
		//			String text = e.getText();
		//			if(text.equals("Fast")) {
		//				e.click();
		//				break;
		//			}
		//		}
		
//				driver.findElement(By.xpath("//span[text()='Some unknown file']")).click();
//		List<WebElement> list = driver.findElements(By.xpath("#files-menu li"));
//		System.out.println(list);
//		for(WebElement e : list) {
//			String text = e.getText();
//			if(text.equals("Other files")) {
//				e.click();
//				break;
//			}
//		}

		By locator = By.xpath("//span[text()='jQuery.js']");
		By locator2 = By.xpath("#files-menu li div");
		selectDropDown(locator,locator2,"Some unknown file");
	}

	public static void selectDropDown(By locator, By locator2,String value) {
		driver.findElement(locator).click();
		List<WebElement> list = driver.findElements(locator2);
		System.out.println(list);
		for(WebElement e : list) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}
}
