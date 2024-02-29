package dropDownHandling;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownOptions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By country = By.id("Form_getForm_Country");

		int count = getDropDownOptionsCount(country);
		System.out.println(count);
		 List<String> dropDownOption = getDropDownOption(country);
		 System.out.println(dropDownOption);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}

	public static List<String> getDropDownOption(By locator) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		List<String> optionText = new ArrayList<String>();
		for(WebElement e: optionsList) {
			String text = e.getText();
			optionText.add(text);
		}
		return optionText;
	}
}
