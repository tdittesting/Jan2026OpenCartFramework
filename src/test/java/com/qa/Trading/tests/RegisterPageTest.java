package com.qa.Trading.tests;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.Trading.Base.BaseTest;
import com.qa.Trading.constants.AppConstants;
import com.qa.Trading.utils.CSVUtil;
import com.qa.Trading.utils.ExcelUtil;

public class RegisterPageTest extends BaseTest{
	
	@BeforeClass
	public void registerSetup() {
		registerPage = loginPage.navigateToRegisterPage();
	}

	@DataProvider
	public Object[][] getUserRegTestData() {
		return new Object[][] {
			{"vishal", "mehta", "45657891", "vishal@123", "yes"},
			{"jyothi", "sharma", "4654564", "jyothi@123", "no"},
			{"rahul", "japtap", "3432434", "vishal@123", "yes"}
		};
	}
	
	
	@DataProvider
	public Object[][] getUserRegData(){
		Object regData[][]= ExcelUtil.getTestData(AppConstants.REGISTER_SHEET_NAME);
		return regData;
	}
	
		
//	@DataProvider
//	public Object[][] getCSVData(){
//		return CSVUtil.csvData("product");
//	}
	
	@DataProvider
	public Object[][] getCSVData() throws IOException{
		
		List<Object[]> data = new ArrayList<>();
		try(BufferedReader  br = new BufferedReader(new FileReader("./src/test/resources/TestData/product.csv"))){
			String line;
			while((line=br.readLine())!=null) {
				String[] values = line.split(",");
				for(int i=0;i<values.length;i++) {
					values[i]=values[i].replace("\"", "").trim();
				}
				data.add(values);
			}
		}
		return data.toArray(new Object[0][]);
	}
	
	
	@Test(dataProvider = "getCSVData")
	public void userRegistrationTest(String firstName, String lastName, String telephone, 
			String password,String subscribe) {
		
		System.out.println(firstName + " | " + lastName + " | " + telephone + " | " + password + " | " + subscribe);
		Assert.assertTrue(registerPage.userRegistration(firstName, lastName, telephone, password,subscribe));
		
	}
}
