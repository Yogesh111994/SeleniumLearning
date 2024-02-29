package seleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ElementUtil;

public class FooterLink {
static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		By footer = By.xpath("//footer//a");
		By rightSide = By.xpath("//a[@class=\"list-group-item\"]");
//		List<WebElement> footerList = driver.findElements(footer);
//		List<String> footerLinks = new ArrayList<String>();
//		
//		for(WebElement e: footerList) {
//			String hrefValue = e.getAttribute("href");
//			System.out.println(hrefValue);
//		}
		ElementUtil eleUtil = new ElementUtil(driver);
//		int elementsCount = eleUtil.getElementsCount(footer);
//		List<String> elementTextList = eleUtil.getElementTextList(footer);
//		System.out.println(elementTextList);
//		List<String> expectedList = Arrays.asList("About Us", "Delivery Information", "Privacy Policy", "Terms & Conditions", "Contact Us");
//		if(elementTextList.containsAll(elementTextList)) {
//			System.out.println("important footer link.....Pass");
//		}
//		List<String> elementsAttributeList = eleUtil.getElementsAttributeList(footer, "href");
//		for(String str : elementsAttributeList) {
//			System.out.println("Footer Link == "+str);
//		}
		
		List<String> elementTextList = eleUtil.getElementTextList(rightSide);
		for(String str : elementTextList) {
			System.out.println(str);
		}
			
		
		 
		   

	}

}
