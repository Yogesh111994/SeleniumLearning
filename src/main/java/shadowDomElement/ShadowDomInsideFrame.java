package shadowDomElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomInsideFrame {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");

		//Browser -- Page -- iFrame --- shadow DOM(open) --- e1

		driver.switchTo().frame("pact");

		String tea_path = "return document.querySelector(\"#snacktime\").shadowRoot.querySelector(\"#tea\")";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = (WebElement) js.executeScript(tea_path);
		ele.sendKeys("Masala tea");

		//SVG: local-name() --> name()
		//shadow dowm: css: 
	}

}
