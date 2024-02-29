package relativeLocator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {

		// selenium4.x: Relative Locators

		//		          e4(above)
		//		                  |
		//e2(left)-----ele ---> e1(right)
		//		                  |
		//		            e3(below)	
		//      e5(near): 50px

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.linkText("Vernon, Canada"));
//		ele.click();
		
		String rightValue = driver.findElement(RelativeLocator.with(By.tagName("p")).toRightOf(ele)).getText();
        System.out.println(rightValue);
        
        String leftValue = driver.findElement(RelativeLocator.with(By.tagName("p")).toLeftOf(ele)).getText();
        System.out.println(leftValue);
        
        String above = driver.findElement(RelativeLocator.with(By.tagName("p")).above(ele)).getText();
        System.out.println(above);
        
        String below = driver.findElement(RelativeLocator.with(By.tagName("p")).below(ele)).getText();
        System.out.println(below);
        
        //near of ele:
      		String nearEle = driver.findElement(RelativeLocator.with(By.tagName("p")).near(ele)).getText();
      		System.out.println(nearEle);
		
      		List<WebElement> elementList = driver.findElements(RelativeLocator.with(By.xpath("(//div[@id='most_pollutedCitiesRank'])[1]/p")).below(ele));
      		
      		for(WebElement e:elementList) {
      			String city =e.getText();
      			System.out.println(city);
      		}
      		
	}

}
