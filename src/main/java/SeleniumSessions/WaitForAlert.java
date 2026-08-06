package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForAlert {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());//This is not only waiting for alert but also switch to alert.
		
//		driver.switchTo().alert();
		
		
		System.out.println(alert.getText());
		alert.accept();
	
	}
	public static Alert waitForAlert(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	public static void acceptAlertWithWait(int timeOut) {
		waitForAlert(timeOut).accept();
	}
	public static void dismissAlertWithWait(int timeOut) {
		waitForAlert(timeOut).dismiss();
	}
	public static String getTextAlertWithWait(int timeOut) {
		return waitForAlert(timeOut).getText();
	}

}
