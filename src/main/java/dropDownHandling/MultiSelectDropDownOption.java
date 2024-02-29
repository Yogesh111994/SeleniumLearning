package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDownOption {

	static WebDriver driver;
	private static List<WebElement> options;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		Select select = new Select(driver.findElement(By.xpath("//select")));
		List<WebElement> options2 = select.getOptions();

		for(WebElement e: options2) {
			System.out.println(e.getText());
		}
		if(select.isMultiple()) {
			System.out.println("yes, its multiple drop down");
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Chilean flamingo");
			select.selectByVisibleText("James's flamingo");
		}
}
}