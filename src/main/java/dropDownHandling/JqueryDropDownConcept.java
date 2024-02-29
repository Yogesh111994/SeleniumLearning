package dropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JqueryDropDownConcept {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.findElement(By.xpath("//input[@id='justAnInputBox']")).click();
		List<WebElement> optionList = driver.findElements(By.xpath("(//h3[text()='Multi Selection']/parent::div/child::div/div)[2]/ul/li"));
		for(WebElement e: optionList) {
			String text = e.getText();
			System.out.println(text);
			if(text.equals("choice 5")) {
				e.click();
			}
		}
	}

}
