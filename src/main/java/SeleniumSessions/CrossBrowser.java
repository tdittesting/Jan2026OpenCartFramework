package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowser {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		String browser ="edge";

		switch (browser.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Pls pass the correct browser.."+browser);
			throw new RuntimeException("Invalid Browser");
		}
		
//		driver = new EdgeDriver();
//		driver = new FirefoxDriver();
//		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//get the title and print it
				String actTitle = driver.getTitle();
				System.out.println("Page title is: "+actTitle);
				
				//checkpoint/validation point /assertion
				if(actTitle.equals("Google")) {
					System.out.println("Pass");
				}
				else {
					System.out.println("Fail");
				}
				
				//Automation Steps + Checkpoint = Automation testing
				
				//closing the browser
				driver.quit();

	}

}
