package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		int size = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
	
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[3]/td[1]
		//*[@id="customers"]/tbody/tr[4]/td[1]
		//*[@id="customers"]/tbody/tr[5]/td[1]
		//*[@id="customers"]/tbody/tr[6]/td[1]
		//*[@id="customers"]/tbody/tr[7]/td[1]
		
		String beforeXpath ="//*[@id=\"customers\"]/tbody/tr[";
		String afterXpath = "]/td[1]";
		String afterXpath2 = "]/td[2]";
		String afterXpath3 = "]/td[3]";
		
		
		for(int i=2 ; i<=size ;i++) {
			String actualXpath =beforeXpath+i+afterXpath;
			//System.out.println(actualXpath);
			String companyName = driver.findElement(By.xpath(actualXpath)).getText();
			System.out.print(companyName+"                                                             ");
			
			String actualXpath2 =beforeXpath+i+afterXpath2;
			String contact = driver.findElement(By.xpath(actualXpath2)).getText();
			System.out.print(contact+"                                                             ");
			
			String actualXpath3 =beforeXpath+i+afterXpath3;
			String country = driver.findElement(By.xpath(actualXpath3)).getText();
			System.out.print(country+"                                                             ");
			System.out.println();
			
			
			
			
		}
	}

}
