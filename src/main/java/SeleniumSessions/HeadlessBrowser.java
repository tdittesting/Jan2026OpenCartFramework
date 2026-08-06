package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessBrowser {

	//Headless:
	//speed is faster than the headful mode
	//testing of script can be done behind the scene
	//it will not interrupt your other tasks
	
	//Problems:
	//Real time industry - This is not a simulation
	//If my DOM is complex, lot of navigations - Script might get failed
	
	
	//Real use case to have headless mode:
	//linux OS: no GUI: CI/CD or JENKINS
	
	
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--headless");
//		co.addArguments("--incognito");
		
		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
		fo.addArguments("--incognito");
		
		EdgeOptions eo = new EdgeOptions();
//		eo.addArguments("--headless");
		eo.addArguments("--InPrivate");
		
//		WebDriver driver = new ChromeDriver(co);
//		WebDriver driver = new FirefoxDriver(fo);
		WebDriver driver = new EdgeDriver(eo);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();

	}

}
