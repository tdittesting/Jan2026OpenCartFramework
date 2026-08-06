package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFieldText {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("sump1");
		
//		String text = username.getText();
//		System.out.println(text);
		
		String usernameentry = username.getDomProperty("value");
		System.out.println(usernameentry);
		
	}

}
