package seleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\all driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		//4.6.0+ --> 4.13.0
		//browser 118 --> download 118.exe from CFT dashboard in your .cache folder and will start the server automatically
		//119 --> 119.exe from CFT in .cache

	}

}
