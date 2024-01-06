package com.sevenmartsupermarketnew.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sevenmartsupermarketnew.base.Base;
import com.sevenmartsupermarketnew.pages.HomePage;
import com.sevenmartsupermarketnew.pages.LoginPage;
import com.sevenmartsupermarketnew.utilities.ExcelRead;

public class LoginTest extends Base {

	LoginPage loginPage;
	HomePage homePage;
	ExcelRead excelRead=new ExcelRead();

	@Test(groups = "regression")
	public void verifyLogin() {
		loginPage = new LoginPage(driver);
		loginPage.login("admin", "admin");
		homePage = new HomePage(driver);
		String actualProfileName = homePage.getProfileName();
		String expectedProfileName = "Admin";
		Assert.assertEquals(actualProfileName, expectedProfileName);
	}


	@Test(groups = "smoke")
	public void excelRead() {
		excelRead.setExcelFile("LoginCredentials", "Valid Login Credentials"); //Workbookname & sheetName
		String username1=excelRead.getCellData(1, 0);
		String password1=excelRead.getCellData(1, 1);
		System.out.println(username1);
		System.out.println(password1);
	}
}

