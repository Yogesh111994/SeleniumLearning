package seleniumSession;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * @author MANGESH PC BrowserUtil is having multiple generic methods to handle
 *         the various browser actions
 */

public class BrowserUtil {

	private WebDriver driver;

	/**
	 * This method is launch the browser on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this return the driver instance
	 */

	public WebDriver launchBrowser(String browserName) {

		System.out.println("browser name: " + browserName);

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "browser":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please pass the right browser");
			throw new AutomationException("INVALID BROSER :" + browserName);
		}
		return driver;

	}

	/**
	 * This method is used to launch the browser
	 * 
	 * @param url
	 */

	public void launchURL(String url) {

		if (url == null) {
			System.out.println("URL is null");
			throw new AutomationException("Null URL");
		}

		// https://www.google.com
		// if(url.indexOf("http://")==0 || url.indexOf("https://")==0) {
		// driver.get(url);
		// }
		// else {
		// throw new AutomationException("HTTP is missing");
		// }

		if (url.indexOf("http") == 0) {
			try {
				driver.get(url);
			} catch (Exception e) {

				throw new AutomationException("http is missing");

			}
		} else {
			throw new AutomationException("Http is missing");
		}

	}

	/**
	 * URL is class in Java
	 * 
	 * @param url This method is used to launch the URL
	 */
	public void launchURL(URL url) {
		if (url == null) {
			System.out.println("URL IS NULL");
			throw new AutomationException("NULL URL");
		}

		driver.navigate().to(url);
	}

	/**
	 * @return it will return the string The method is used to get the title of the
	 *         page
	 */
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: " + title);
		return title;
	}

	/**
	 * The method is used to get the Current page URL
	 * 
	 * @return it will return the String
	 */

	public String getCurrentPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page " + url);
		return url;
	}

	public boolean getPageSource(String value) {
		String pageSource = driver.getPageSource();
		if (pageSource.contains(value)) {
			return true;
		}
		return false;
	}

	/**
	 * The method is used to close the browser
	 */
	public void closeBrowser() {
		driver.close();
		System.out.println("Browser is closed");
	}
	
	/**
	 * The method is used to close the browser
	 */
	
	public void quitBrowser() {
		driver.quit();
		System.out.println("Browser is closed");
	}

}
