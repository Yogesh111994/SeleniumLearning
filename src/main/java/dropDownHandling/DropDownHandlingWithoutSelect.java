package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingWithoutSelect {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By xpath= By.cssSelector("#Form_getForm_Country>option");
//		List<WebElement> countryList = driver.findElements(By.cssSelector("#Form_getForm_Country>option"));
//		for(WebElement e: countryList) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//		}
		selectDropDrownValue(xpath,"Afghanistan");
		
	}
	public static void selectDropDrownValue(By locator, String value) {
		List<WebElement> countryList = driver.findElements(locator);
		for(WebElement e: countryList) {
			String text = e.getText();
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
	}

}
