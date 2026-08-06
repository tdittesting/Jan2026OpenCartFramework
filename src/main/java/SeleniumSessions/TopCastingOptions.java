package SeleniumSessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1. ED = ED only supporting Edge and no other ; Not topcasting
//		EdgeDriver driver = new EdgeDriver();
		
		//2. WD d = new ED
		//local
		//Valid and recommended
//		WebDriver driver = new EdgeDriver();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		//3.SC d = new ED
		//valid and not recommended, bcoz of limitation to access the methods.
//		SearchContext driver = new EdgeDriver();
		
		//4. WD d = new RWD
		//valid and recommended: remote execution
		//Used when we want to run test cases in remote machine, cloud, AWS, grid, VM
//		WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);//cap: OS/Browser
		
		
		//5. SC d = new RWD
		//valid and not recommended
//		SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. RWD d = new ED
		//local
		//valid and recommended  
//		RemoteWebDriver driver = new EdgeDriver(); 
	
		//7. Chromium d = new ED
		//local execution
		//valid; limitation - All Cross browser is not allowed except chrome driver
		//not recommended
//		ChromiumDriver driver = new EdgeDriver(); 
//		driver = new ChromeDriver();
		
		//8. RWD d = new RWD
		//valid for only remote execution..
//		RemoteWebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);


		
	}

}
