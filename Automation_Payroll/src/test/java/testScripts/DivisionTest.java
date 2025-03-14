package testScripts;

import org.testng.Assert;

import pages.BranchPage;
import pages.CompanyPage;
import pages.DashBoardPage;
import pages.DivisionPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class DivisionTest extends ExcelDataUtil {
	
	//@Test
		public void verifyDivisionTitle() {
			LoginPage login= new LoginPage(driver);
			login.enterUsername("carol");
			login.enterPassword("1q2w3e4r");
			DashBoardPage dashboard=login.clickonLogin();
			CompanyPage company=dashboard.clickonCompanyMenu();
			BranchPage branch=company.clickonBranchsubMenu();
			DivisionPage division=branch.clickonDivisionsubMenu();
			String actual=division.getTitle();
			String exp="Create Division";
			Assert.assertEquals(actual, exp, "Invalid page title");
		}
		//@Test
		public void verifyDivisionRegistration() {
			LoginPage login= new LoginPage(driver);
			login.enterUsername("carol");
			login.enterPassword("1q2w3e4r");
			DashBoardPage dashboard=login.clickonLogin();
			CompanyPage company=dashboard.clickonCompanyMenu();
			BranchPage branch=company.clickonBranchsubMenu();
			DivisionPage division=branch.clickonDivisionsubMenu();
			division.selectCompanyId("Obsquratvm");
			division.selectBranchId("Tech");
			division.enterDivisionName("Software");
			division.clickonSaveButton();
		}

	}



