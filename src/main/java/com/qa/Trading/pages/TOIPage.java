package com.qa.Trading.pages;

import static com.qa.Trading.constants.AppConstants.DEFAULT_TIMEOUT;
import static com.qa.Trading.constants.AppConstants.LOGIN_PAGE_TITLE;

import java.util.ArrayList;
import java.util.List;

import static com.qa.Trading.constants.AppConstants.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.Trading.utils.ElementUtil;

public class TOIPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	private final By headers = By.xpath("//ul/li[contains(@class,'ICPb0')]/a");
	
	public TOIPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}


	public List<String> getMenuHeaders() {
		List<WebElement> menuList = eleUtil.getElements(headers);
		List<String> menuValList = new ArrayList<String>();
		for(WebElement e:menuList) {
			String text = e.getText();
			menuValList.add(text);
		}
		System.out.println("TOI Main page menu items: "+menuValList);
		return menuValList;
	}
	
}
