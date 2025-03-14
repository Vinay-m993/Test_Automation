package testScripts;

import org.testng.Assert;

import pages.BranchPage;
import pages.CompanyPage;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class BranchTest extends ExcelDataUtil {

	// @Test
	public void verifyBranchtitle() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		BranchPage branch = company.clickonBranchsubMenu();
		String actual = branch.getTitle();
		String exp = "Create Branch";
		Assert.assertEquals(actual, exp);
	}

	// @Test
	public void verifyBranchRegistration() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		BranchPage branch = company.clickonBranchsubMenu();
		branch.enterCompanyname("Obsquratvm");
		branch.enterBranchname("Tech");
		branch.enterBranchaddress("Tvm");
		branch.clickonSave();
	}

}
