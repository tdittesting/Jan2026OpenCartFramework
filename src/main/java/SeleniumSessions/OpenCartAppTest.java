package SeleniumSessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest {

	public static void main(String[] args) throws MalformedURLException  {
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchURL("http://www.google.com");
		
//		URL url = new URL("https://www.google.com");
//		brUtil.launchURL(url);
		
		String actTitle = brUtil.getPageTitle();
		if(actTitle.equals("Google")) {
			System.out.println("Title is correct -- Pass");
		}
		else {
			System.out.println("Title is incorrect -- Fail");
		}

		brUtil.quitBrowser();

	}

}
