package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopupHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException{
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. alert_JS
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept();//click on ok
//		alert.dismiss();
		
		//2. confirm JS
				
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//				
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		
////		alert.accept();//click on ok
//		alert.dismiss();
		
		
		//3. Prompt JS:
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);//i am a js prompt
		
		alert.sendKeys("Alert automation prompt");
		Thread.sleep(2000);
		
		alert.accept();

	}

}
