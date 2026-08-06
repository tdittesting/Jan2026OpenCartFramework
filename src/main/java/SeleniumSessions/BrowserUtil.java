package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
	
	private WebDriver driver;//Non primitive , so default value is null
	
	/**
	 * this is used to initilize the driver based on browser name passed: chrome, firefox, edge 
	 * @param browserName
	 * @return it returns driver of WebDriver type
	 */
	
	public WebDriver initDriver(String browserName) {
		System.out.println("Browser name: "+browserName);
		
		switch (browserName.trim().toLowerCase()) {//Chrome   --> chrome
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the correct browser..");
			throw new BrowserException("=== INAVLID BROWSER ===");
		}
		return driver;
	}

	//https://www.google.com - Yes
	//http://www.google.com - Yes
	//www.google.com - No
	public void launchURL(String url) {
		nullCheck(url);
		lengthCheck(url);
		httpCheck(url);
		driver.get(url);
	}
	
	public void launchURL(URL url) {
		String appUrl = String.valueOf(url);
		nullCheck(appUrl);
		lengthCheck(appUrl);
		httpCheck(appUrl);
		driver.navigate().to(url);
	}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("Page title is: "+title);
		return title;
	}
	
	public String getPageURL() {
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is: "+pageURL);
		return pageURL;
	}
	
	public void closeBrowser() {
		if(driver!= null) {
		driver.close();
		System.out.println("browser is closed");
		}
	}
	
	public void quitBrowser() {
		if(driver!= null) {
		driver.quit();
		System.out.println("browser is closed");
		}
	}
	
	private void lengthCheck(String value) {
		if(value.length()==0) {
			System.out.println("url passed should not be blank"+value);
			throw new BrowserException("=== Empty URL ===");
		}
	}
	
	private void httpCheck(String urlValue) {
		if(urlValue.indexOf("http")!=0) {
			System.out.println("http/https is missing in URL");
			throw new BrowserException("=== http/https missing ===");
		}
	}
	
	private void nullCheck(String value) {
		if(value == null) {
			System.out.println("url passed cannot be null");
			throw new BrowserException("=== value is null ===");
		}
	}
	
}
