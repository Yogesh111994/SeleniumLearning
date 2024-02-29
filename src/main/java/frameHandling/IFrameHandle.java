package frameHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();   //browser - chrome
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");//page
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("#imageTemplateContainer img")).click();
		Thread.sleep(3000);
		driver.switchTo().frame(0); // Index
		// driver.switchTo().frame("frame-one748593425"); // By Id or Name
		// driver.switchTo().frame(driver.findElement(By.id("frame-one748593425"))); // By WebElement
		driver.findElement(By.cssSelector("#RESULT_TextField-8")).sendKeys("Yogesh");
		driver.findElement(By.cssSelector("#RESULT_TextField-9")).sendKeys("Biradar");

		//random pop up: 5 secs, 10 secs, 0 secs, no
		//prod
		//QA/STAGE/DEV: disabled popups
	}

}
