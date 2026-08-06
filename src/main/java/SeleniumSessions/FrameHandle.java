package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");//parent
		Thread.sleep(2000);
		
		int countFrames = driver.findElements(By.tagName("frame")).size();
		System.out.println(countFrames);
		
		//switch driver to frame
//		driver.switchTo().frame(2);
//		By name or id
//		driver.switchTo().frame("main");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);

	}

}
