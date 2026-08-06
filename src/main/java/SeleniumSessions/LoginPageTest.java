package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("edge");
		
		brUtil.launchURL("https://demoqa.com/text-box");
		
		System.out.println(brUtil.getPageTitle());
		
		By userNameField = By.id("userName");
		By userEmailField = By.id("userEmail");
		By currentAddressField = By.id("currentAddress");
		By permanentAddressField = By.id("permanentAddress");
		By submitButton = By.id("submit");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(userNameField, "TDIT");
		elUtil.doSendKeys(userEmailField, "TDIT@huha.com");
		elUtil.doSendKeys(currentAddressField, "PUNE");
		

	}

}
