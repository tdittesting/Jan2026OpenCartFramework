package SeleniumSessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		
		//click back and forward button - back/ forward button simulation or navigation option
		
		
		//diff b/w get and navigate.to()
		//1. functionality wise both are exactly same, ultimately called get method with string parameter
		//2. get method is not overloaded and navigate.to is overloaded...
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		//navigate to flipkart.com
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//google
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();//flipkart
		System.out.println(driver.getTitle());
		
		driver.navigate().back();//google
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();

	}

}
