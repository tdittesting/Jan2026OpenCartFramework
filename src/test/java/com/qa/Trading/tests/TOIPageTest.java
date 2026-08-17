package com.qa.Trading.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static com.qa.Trading.constants.AppConstants.*;

import java.util.Arrays;
import java.util.List;

import com.qa.Trading.Base.BaseTest;
import com.qa.Trading.constants.AppConstants;
import com.qa.Trading.utils.ExcelUtil;

public class TOIPageTest extends BaseTest{
	
	
	@DataProvider
	public Object[][] getMenuData(){
		Object menuData[][]= ExcelUtil.getTestData(AppConstants.TOI_SHEET_NAME);
		return menuData;
	}
	

	
	
	@Test
	public void acctPageHeadersTest() {
		List<String> actMenuList = toiPage.getMenuHeaders();
		Assert.assertEquals(actMenuList, AppConstants.expMenuList);
		
		Object menuData[][]= ExcelUtil.getTestData(AppConstants.TOI_SHEET_NAME);
		System.out.println();
		
//		List<String> expMenuList = Arrays.asList(menItems);
//		Assert.assertEquals(actMenuList, expMenuList);
//		System.out.println(actMenuList);
		
//		for(String actualItem : actMenuList) {
//			Assert.assertTrue(expMenuList.contains(actualItem),
//		            "Actual menu item not found in expected list: " + actualItem);
//		}

	}
	
}
