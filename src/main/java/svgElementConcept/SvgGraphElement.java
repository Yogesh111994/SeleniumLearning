package svgElementConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;

public class SvgGraphElement {

	
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		String stateXpath = "//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='g' and @class='region']";
		//51

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));

		List<WebElement> stateList = driver.findElements(By.xpath(stateXpath));

		for(WebElement e: stateList) {
			String state_name=e.getAttribute("id");
			System.out.println(state_name);
			Actions act = new Actions(driver);
			act.moveToElement(e).perform();
		    Thread.sleep(500);
			if(state_name.contains("maryland")) {
				e.click();
				break;
			}

			
			Thread.sleep(3000);
			
		  List<WebElement> sub_region =driver.findElements(By.xpath("//*[name()='g' and @id='maryland']//*[name()='g' and @class='rpath']//*"));
			   System.out.println(sub_region.size());
//		for(WebElement ele: sub_region) {
//				String region=ele.getAttribute("name");
//				System.out.println(region);
//				Actions act1 = new Actions(driver);
//				act1.moveToElement(ele).perform();
//				Thread.sleep(500);
//			}

		}
	}

}
