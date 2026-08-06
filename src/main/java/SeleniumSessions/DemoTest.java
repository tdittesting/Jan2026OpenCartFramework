package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa. selenium. support.locators.RelativeLocator;

public class DemoTest {

	static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
		driver.get("https://orangehrm.com/30-day-free-trial");
//		
//		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@alt='facebook']")).click();
//		act.sendKeys(Keys.PAGE_DOWN).perform();
//		
//		WebElement baseEle = driver.findElement(By.xpath("//a[text()='Joe.Root']"));
//		driver.findElement(RelativeLocator.with(By.tagName("td")).toLeftOf(baseEle)).click();
		

//			String username = "admin";
//			String password = "admin";
//
//			WebDriver driver = new ChromeDriver();
//			//driver.get("https://" + username + ":"+password + "@" + "the-internet.herokuapp.com/basic_auth");
//
//			// basic auth
//			((HasAuthentication) driver).register(() -> new UsernameAndPassword(username, password));
//
//			driver.get("https://the-internet.herokuapp.com/basic_auth");
//			String mesg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
//			System.out.println(mesg);
		
	}
}
