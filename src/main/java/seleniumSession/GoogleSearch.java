package seleniumSession;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		By searchField = By.name("q");
		By suggestions = By.xpath("//div[@class='wM6W7d']/span");
		search(searchField, "Global Warming", suggestions, "meaning");
	//	googleSearch(searchField,suggestions,"Global Warming", "meaning");
//		driver.findElement(searchField).sendKeys("Automation Testing");
//		Thread.sleep(3000);
//		List<WebElement> searchList = driver.findElements(suggestions);
//		List<String> AddsearchList = new ArrayList<String>();
//		
//		for(WebElement e : searchList ) {
//			String text = e.getText();
//			AddsearchList.add(text);
////			if(text.contains("course")) {
////				e.click();
////				break;
////			}
//		}
//		System.out.println(AddsearchList);	
		
	}	
	
	public static void search(By searchField,String searchKey, By suggestions, String suggName ) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);
		Thread.sleep(3000);
		List<WebElement> searchList = driver.findElements(suggestions);
		//List<String> AddsearchList = new ArrayList<String>();
		for(WebElement e : searchList ) {
			String text = e.getText();
			//AddsearchList.add(text);
			System.out.println(text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
	
	public static void googleSearch(By searchField, By suggestions, String searchKey, String suggName) throws InterruptedException {
		driver.findElement(searchField).sendKeys(searchKey);

		Thread.sleep(3000);

		List<WebElement> suggList = driver.findElements(suggestions);

		System.out.println(suggList.size());

		for (WebElement e : suggList) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(suggName)) {
				e.click();
				break;
			}
		}
	}
}
