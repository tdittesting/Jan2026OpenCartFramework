package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowPopupHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");//parent

		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();

		driver.findElement(By.linkText("Goibibo Bus")).click();//child

		//1st: fetch the window ids
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWinID = it.next();
		System.out.println("Parent window id: "+parentWinID);
		
		String childWinID = it.next();
		System.out.println("Child window id: "+childWinID);
		
		//2nd : Switch to window
		driver.switchTo().window(childWinID);
		System.out.println("Child window title: "+driver.getTitle());
		Thread.sleep(3000);
		driver.close();
		
		//driver is lost
		//switch back to parent window.
		driver.switchTo().window(parentWinID);
		System.out.println("Parent window title: "+driver.getTitle());
//		driver.quit();
		
	}

}
