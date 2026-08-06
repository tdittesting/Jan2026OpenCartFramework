package SeleniumSessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//You can launch any browser: Edge, chrome, firefox
		//Launch the browser: Edge
		EdgeDriver driver = new EdgeDriver();//object created
	
		
		//enter the url
		driver.get("https://google.com");//https or http
		
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
