package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> imageList = driver.findElements(By.tagName("img"));
		System.out.println("Total images present : "+imageList.size());
		
		for(WebElement e: imageList) {
			//web Scraping
			String srcVal = e.getDomAttribute("src");
			String altVal = e.getDomAttribute("alt");
			System.out.println(altVal+" : "+srcVal);
		}

	}

}
