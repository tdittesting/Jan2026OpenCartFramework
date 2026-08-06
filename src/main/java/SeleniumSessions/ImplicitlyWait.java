package SeleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//Sel 3.x - Fully deprecated
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Sel 4.x
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//global wait: It will be applied to all the webelements.
		//login page: 10 secs
		//e1(driver.findElement): 10 - 2 : 2 - Saved 8 secs
		//e2(driver.findElement): 10 - 5 : 5 - saved 5 secs
		
		driver.findElement(By.id("email-address")).sendKeys("tdit@gmail.com");//10: 0 secs
		
		//register link click webelement - 10
		//e1 on register page
		//Register page: 15 secs - Override
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
		//login :
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		//3rd drawback: Imp wait will not work for non web elements.
				
			

	}

}
