package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserBlankWindowTab {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://tdittesting.co.in/tool1/login.php");//parent
		String parentWinId = driver.getWindowHandle();
//		Thread.sleep(2000);
//		driver.get("https://www.google.com");
//		driver.navigate().to("https://www.google.com");
		
		//Selenium 4.x
		driver.switchTo().newWindow(WindowType.WINDOW);//open a blank window
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());//google
		driver.close();
		//driver is lost
		driver.switchTo().window(parentWinId);
		System.out.println(driver.getTitle());//TDIT Login Page

	}

}
