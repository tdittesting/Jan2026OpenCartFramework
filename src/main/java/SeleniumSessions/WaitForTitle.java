package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitle {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		if(wait.until(ExpectedConditions.titleContains("TDIT"))) {
//			System.out.println(driver.getTitle());
//		}
//		String title = waitForTitleContains("OrangeHRM",5);
//		System.out.println(title);
		
		String title = waitForTitleIs("Sign up for OrangeHRM Free Trial | OrangeHRM",5);
		System.out.println(title);
		
		

	}
	
	public static String waitForTitleContains(String fractionTitle,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			wait.until(ExpectedConditions.titleContains(fractionTitle));
			return driver.getTitle();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	public static String waitForTitleIs(String Title,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			wait.until(ExpectedConditions.titleIs(Title));
			return driver.getTitle();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}

}
