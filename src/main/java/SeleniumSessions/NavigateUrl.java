package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateUrl {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com");
//		driver.navigate().to("https://www.flipkart.com/");
//		driver.navigate().to(new URL("https://www.flipkart.com/"));
		
		URL baseUrl = new URL("https://www.google.com");
		driver.navigate().to(baseUrl);

	}

}
