package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		
		// selenium + Java --> JavaScriptExecutor -- inject the js code into the browser
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://tdittesting.co.in/tool1/login.php");
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
		
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
//		String title = jsutil.getTitleByJS();
//		System.out.println(title);
//		
//		String url = jsutil.getURLByJS();
//		System.out.println(url);
//		
//		jsutil.generateJSAlert("Todays climate is having red alert");
		
//		driver.get("https://classic.crmpro.com/");
//		Thread.sleep(3000);
//		String innertext = jsutil.getPageInnerText();
//		System.out.println(innertext);
//		if(innertext.contains("SALES PIPELINE DASHBOARD")) {
//			System.out.println("Pass");
//		}
		
//		jsutil.scrollPageDown();
//		Thread.sleep(2000);
//		jsutil.scrollPageUp();
//		Thread.sleep(2000);
//		jsutil.scrollPageDown("1000");
//		
//		
//		driver.get("https://www.flipkart.com/");
//		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Brands in Spotlight')]"));
//		
//		jsutil.scrollIntoView(element);
		
		driver.get("https://tdittesting.co.in/tool1/login.php");
		
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("password"));
		WebElement loginBut = driver.findElement(By.className("login_button"));
		
		WebElement frame = driver.findElement(By.cssSelector("div.inner_container"));
		
		jsutil.flash(username);
		username.sendKeys("sump1");
		jsutil.flash(password);
		password.sendKeys("techfin@12");
//		jsutil.drawBorder(password);
//		jsutil.drawBorder(frame);
		jsutil.clickElementByJS(loginBut);
		
	}

}
