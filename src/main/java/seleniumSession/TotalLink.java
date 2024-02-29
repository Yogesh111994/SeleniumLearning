package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLink {
	static WebDriver driver;

	public static void main(String[] args) {

		// get the total links on the page
		// get the text of each link but ignore the blank text links
		// get the href value for each link

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By tag = By.tagName("a");
		List<WebElement> link = driver.findElements(tag);
		System.out.println(link.size());
		
				for(int i=0; i<link.size(); i++) {
			String text = link.get(i).getText();
				if(text.length()!=0) {
					System.out.println(i+ ":"+ text);
				}
		}

//		for (WebElement l : link) {
//			String linkText = l.getText();
//
//			if (linkText.length() != 0) {
//				System.out.println(linkText + ": " + l.getAttribute("href"));
//			}
//		}

	}

}
