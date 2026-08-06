package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//123
		driver = new FirefoxDriver();//456
		driver = new EdgeDriver();//765
		driver.get("https://www.google.com");//765
		driver.quit();//765
		//sid = null
//		driver.getTitle();
		driver.quit();//SID = null

	}

}
