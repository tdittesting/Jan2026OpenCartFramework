package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/ipl-2026-1510719/lucknow-super-giants-vs-chennai-super-kings-59th-match-1529302/full-scorecard");
		Thread.sleep(4000);
		
		getWktTakerName("Urvil Patel");
		getWktTakerName("Kartik Sharma");
		getWktTakerName("Josh Inglis");
	
		
//		System.out.println(getScoreCard("Urvil Patel"));
//		System.out.println(getScoreCard("Kartik Sharma"));
//		System.out.println(getScoreCard("Josh Inglis"));
	}
	
	public static List<String> getScoreCard(String playerName) {
		List<WebElement> scoreList = driver.findElements(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-center')]/span/span"));
		
		System.out.println("Size of scorecard: "+scoreList.size()+" for player - "+playerName);
		
		List<String> scoreCardList = new ArrayList<String>();
		
		for(WebElement e:scoreList) {
			String text = e.getText();
			System.out.println(text);
			scoreCardList.add(text);
		}
		return scoreCardList;
	}
	
	public static void getWktTakerName(String playerName) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		String wktTakerName = driver.findElement(By.xpath("//span[text()='"+playerName+"']/ancestor::td/following-sibling::td/span"))
				.getText();
		System.out.println(wktTakerName);
	}
}
