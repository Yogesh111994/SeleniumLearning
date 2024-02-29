package tableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(5000);


		// Single selection
//		while(true){
//			List<WebElement> country=driver.findElements(By.xpath("//td[text()='Denmark']"));
//			if(country.size()>0) {
//				selectCountry("Denmark");
//				break;
//			}
//			else{
//				WebElement next=driver.findElement(By.linkText("Next"));
//				if(next.getAttribute("class").contains("disabled")) {
//					System.out.println("Pagination is over..country is not found....");
//					break;
//				}
//				next.click();
//			}
//		}

		// MultiSelection
		
		while(true){
			List<WebElement> country=driver.findElements(By.xpath("//td[text()='India']"));
			if(country.size()>0) {
				selectMultipleCountry("India");
				break;
			}
			else{
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..country is not found....");
					break;
				}
				next.click();
			}
		}
	}

	public static void selectCountry(String countryName) {
		driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/input[@type='checkbox']")).click();
	}
	public static void selectMultipleCountry(String countryName) {
		List<WebElement> countryList=driver.findElements(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/input[@type='checkbox']"));
		for(WebElement e: countryList) {
			e.click();
		}
	}
	
	
}