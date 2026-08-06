package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorConcept {

	public static void main(String[] args) throws InterruptedException {
		//Selenium 4.x: RelativeLocator : with

//		               above
//	                     |	
//		      left <--  ele  --> right
//		                 |
//		               below
		               
		//near   
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(6000);
		
		WebElement ele = driver.findElement(By.xpath("//p[text()='Conklin']"));
		String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(leftRank);
		
		String aqiNum = driver.findElement(with(By.xpath("//div[@class='aqi']")).toRightOf(ele)).getText();
		System.out.println(aqiNum);
		
		String aqiStatus = driver.findElement(with(By.cssSelector("p.status")).toRightOf(ele)).getText();
		System.out.println(aqiStatus);
		
		
		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);
		
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);
		
		String nearText = driver.findElement(with(By.tagName("div")).near(ele)).getText();
		System.out.println(nearText);
		
	}

}
