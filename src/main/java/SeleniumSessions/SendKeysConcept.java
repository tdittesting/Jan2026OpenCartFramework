package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysConcept {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.redbus.com/");
		
//		WebElement fn = driver.findElement(By.id("firstName"));
//		String str = "Test";
//		StringBuilder sb = new StringBuilder("Sel");
//		StringBuffer sbf = new StringBuffer("Java");
		
//		fn.sendKeys(str," , ",sb," , ",sbf);
//		fn.sendKeys("Test","Java","Api");
//		fn.sendKeys(null);
		
//		List<WebElement> busroutes = driver.findElements(By.className("bus-route"));
		driver.findElements(By.tagName("a"));
		
//		System.out.println(busroutes.size());
		

	}

}
