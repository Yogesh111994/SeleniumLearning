package dropDownHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	static WebDriver driver;
	public static void main(String[] args) {

		//drop down -- htmltag: <select> --> <option> 
		//Use Select class
		//single selection
		//multi selection

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By country = By.cssSelector("#Form_getForm_Country");

		//doSelectDropDownByIndex(country,2);
		//doSelectDropDownByVisibleText(country, "India");
		doSelectDropDownByValue(country,"Afghanistan");

	}

	public static Select doSelect(By locator) {
		Select select= new Select(getElement(locator));
		return select;
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSelectDropDownByIndex(By locator, int index) {
		doSelect(locator).selectByIndex(index);
	}
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		doSelect(locator).selectByVisibleText(text);
	}

	public static void doSelectDropDownByValue(By locator, String value) {
		doSelect(locator).selectByValue(value);
	}



}
