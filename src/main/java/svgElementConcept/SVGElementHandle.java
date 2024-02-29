package svgElementConcept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {

	public static void main(String[] args) throws InterruptedException {

		//SVG: 
		//can not use css for svg
		//only xpath is applicable: special xpath syntax

		//button//*[local-name()='svg' and @fill='none']

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Mackbook");
		driver.findElement(By.xpath("//button//*[local-name()='svg' and @fill='none']")).click();
	}

}
