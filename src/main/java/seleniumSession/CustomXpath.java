package seleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// xpath: address of the element in HTML DOM
		// 1. absolute xPath: /html/body/div[2]/div/div/div[2]/div[2]/div/div[2]/h4/a
		// 2. relative xPath: using element attributes with xpath functions

		// 1st way: Normal way of writing the xpath ---------------------------------
		// htmltag[@attrname='value']
		// input[@name='search']
		// input[@placeholder='Search']
		// [@name='email']

		// 2nd way: using 'and' and 'or' --------------------------------
		// htmltag[@attr1='value' and @attr2='value']
		// input[@name='email' and @id='input-email']

		// input[@name='email' and @id='input-email' and @type='text']
		// input[@name='search' or @name='email' or @name='password']

		// input[@id] -- 6 --> FEs
		// a -- 81 --> FEs
		int linksCount = driver.findElements(By.xpath("//a")).size();
		System.out.println(linksCount);
		List<WebElement> list = driver.findElements(By.xpath("//a[@class='list-group-item']"));
		for (WebElement e : list) {
			String text = e.getText();
			System.out.println(text);
		}

		// *[@attrName='value']
		// htmltag[@attrName='value']

		// * -- total elements on the page -- 322
		// *[@class='form-control'] 6 out of 322
		// input[@class='form-control'] 6 out 14

		// 3rd way:------------------------------
		// text() in xpath: headers, links, spans, P
		// htmltag[text()='value']
		// h2[text()='Returning Customer']
		// h2[text()='New Customer']
		// a[text()='Recurring payments']

		// text() with attribute:
		// htmltag[text()='value' and @attr='value']
		// a[text()='My Account' and @class='list-group-item']
		// a[@class='list-group-item' and text()='My Account']
		// a[text()='Register' and @class='list-group-item']

		// 4th way:----------------------------
		// contains() in xpath:
		// contains() with attribute:
		// htmltag[contains(@attr, 'value')]
		// input[contains(@placeholder, 'E-Mail')]
		// input[contains(@placeholder, 'Address')]
		// input[contains(@id, 'email')]
		// input[contains(@id, 'email') and @type='text' and contains(@placeholder,
		// 'E-Mail')]

		// 5th way---------------------------------
		// when to use contains()?
		// 1. long text:
		// contains() with text():
		// htmltag[contains(text(),'value')]
		// h2[contains(text(),'Returning')]
		// p[contains(text(),'By creating an account')]

		// contains() with text() and attribute:
		// htmltag[contains(text(),'value') and contains(@attr,'value')]
		// a[contains(text(),'Password') and contains(@class,'list-group-item')]

		// 2. dynamic attributes:
		// dynamic id:
		// <input id = firstname_123>
		// <input id = firstname_125>
		// <input id = firstname_126>
		// <input id = firstname_120>
		// driver.findElement(By.id("firstname_123")).sendKeys("test");//---invalid

		// input[contains(@id,'firstname_')]

		// 6th way-------------------------
		// starts-with() in xpath:
		// htmltag[starts-with(text(),'value')]
		// p[starts-with(text(),'By creating an account')]

		// htmltag[starts-with(@attr,'value')]
		// input[starts-with(@id,'firstname')]

		// ends-with() in xpath: deprecated -- not valid now

		// id - unique -- By.id(naveen);
		// xpath with id --> //input[@id='naveen']

		// space with text:
		// label[normalize-space()='Yes'

		// 7th way-------------------------
		//odd/even in xpath:
		// num % 2 == 0
		//table//tobdy//tr[postion() mod 2 =1]  -- for odd
		//table//tobdy//tr[postion() mod 2 =!1]  -- for even

		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 0] -- even
		// (//select[@id='Form_getForm_Country']/option)[position() mod 2 = 1] -- odd]

		//amazon:
		//a[text()='Careers']/ancestor::ul/preceding-sibling::div

		//label[text()='Password']/following-sibling::input[@id='input-password']


		//parent, child, sibling, preceding, following, descendant ---> xpath axes

	}

}
