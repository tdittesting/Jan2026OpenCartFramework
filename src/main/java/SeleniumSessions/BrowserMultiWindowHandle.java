package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultiWindowHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/30-day-free-trial");//parent
		String parentWinId = driver.getWindowHandle();//wieur334234
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).perform();
		WebElement fb = driver.findElement(By.xpath("//img[@alt='facebook']"));
		WebElement li = driver.findElement(By.xpath("//img[@alt='linkedin']"));
		WebElement tw = driver.findElement(By.xpath("//img[@alt='youtube']"));

		fb.click();
		li.click();
		tw.click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			Thread.sleep(1000);
			if(!parentWinId.equals(windowId)) {
				driver.close();	
			}
		}
		driver.switchTo().window(parentWinId);
		System.out.println("Parent title: "+driver.getTitle());
		
	}
}
