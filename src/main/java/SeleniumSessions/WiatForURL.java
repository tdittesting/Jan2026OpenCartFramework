package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WiatForURL {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");
		
		driver.findElement(By.xpath("(//button[text()='Book a Free Demo'])[1]")).click();
		
//		String url = waitForURLContains("book-a-free-demo", 5);
//		System.out.println(url);
		
		String url = waitForURLToBe("https://orangehrm.com/book-a-free-demo", 5);
		System.out.println(url);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	}
	
	public static String waitForURLContains(String fractionURL,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			wait.until(ExpectedConditions.urlContains(fractionURL));
			return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}
	
	public static String waitForURLToBe(String URL,int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			wait.until(ExpectedConditions.urlToBe(URL));
			return driver.getCurrentUrl();
		}
		catch(TimeoutException e) {
			return null;
		}
		
	}

}
