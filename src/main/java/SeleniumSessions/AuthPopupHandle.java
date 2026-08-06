package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AuthPopupHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		
		String username = "admin";
		String password = "admin";
				
		//Basic authentication approach works when password does not have @
		driver = new FirefoxDriver();
//		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		//It will work for any un/pwd containing @
		//Selenium 4.X
		//Work only for chrome and edge browser
		
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username,password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		String authMsg = driver.findElement(By.xpath("//div[@id='content']//p")).getText();
		System.out.println(authMsg);
		
	}
}
