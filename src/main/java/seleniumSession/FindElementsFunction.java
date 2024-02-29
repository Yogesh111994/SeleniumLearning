package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsFunction {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		By links = By.tagName("a");
		By images = By.tagName("img");

		int linkCount = getElementsCount(links);
		

		List<WebElement> linkList = getElements(links);
		List<String> LinkText = new ArrayList<String>();

		for (WebElement e : linkList) {
			String text = e.getText();

			if (text.length() != 0) {
				LinkText.add(text);
			}
		}
		System.out.println(LinkText);
		
//		int imageCount = getElementsCount(images);
//		List<WebElement> listImages=getElements(images);
//		List<String> LinkImages = new ArrayList<String>();
//		
//		for (WebElement e : listImages) {
//			String text = e.getAttribute("src");
//
//			if (text.length() != 0) {
//				LinkImages.add(text);
//						}
//			
//		}
//		System.out.println(LinkImages);
		
		if(LinkText.contains("My Account")) {
		System.out.println("My Account -- PASS");
		}
	}
	
	// WAF : capture the text of all the page links and return List<String>.
	
	public static List<String> getElementTextList(By locator) {
		
List<WebElement> eleList = getElements(locator); //30 elements
		
		List<String> eleTextList = new ArrayList<String>(); // pc=0 {}
		
		for (WebElement e : eleList) {
			String text = e.getText();

			if (text.length() != 0) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	// WAF: capture specific attribute from the list:
		public static List<String> getElementsAttributeList(By locator, String attrName) {
			List<WebElement> eleList = getElements(locator);
			List<String> eleAttrList = new ArrayList<String>(); // pc=0 {}

			for (WebElement e : eleList) {
				String attrValue = e.getAttribute(attrName);
				eleAttrList.add(attrValue);
			}

			return eleAttrList;

		}
		
	 

	public static int getElementsCount(By locator) {
		return getElements(locator).size();
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}
