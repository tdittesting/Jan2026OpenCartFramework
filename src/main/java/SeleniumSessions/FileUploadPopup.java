package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/upload");
		
		//attribute: type = "file", then only it will work
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\prasa\\OneDrive\\Desktop\\JavaFiles\\ElementUtil.java");
		
	}

}
