package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();//123
		driver.get("https://www.google.com");//123
		String title = driver.getTitle();//123
		System.out.println(title);
		
		String url = driver.getCurrentUrl();//123
		System.out.println(url);
		
//		driver.quit();//123
	
		//sid = null for quit
		
		driver.close();
		//sid = exist but it is invalid/expired
		
		driver = new ChromeDriver();//487
		driver.get("https://www.google.com");//487
		System.out.println(driver.getTitle());//487
		

	}

}
