package myTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseTest {

	protected WebDriver driver;
	@Parameters({"url","browser"})
	@BeforeTest
	public void setUp(String url,String browserName) {
		
		System.out.println("Browser Name :"+browserName);
		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			 driver= new ChromeDriver();
			break;
		case "firefox":
			 driver= new FirefoxDriver();
			break;
		case "edge":
			 driver= new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the right browse"+browserName);
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
