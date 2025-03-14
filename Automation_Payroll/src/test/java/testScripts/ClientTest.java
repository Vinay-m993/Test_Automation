package testScripts;

import org.testng.Assert;

import pages.BranchPage;
import pages.ClientPage;
import pages.CompanyPage;
import pages.DashBoardPage;
import pages.DivisionPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class ClientTest extends ExcelDataUtil {

	// @Test
	public void verifyClientpageTitle() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		CompanyPage company = dashboard.clickonCompanyMenu();
		BranchPage branch = company.clickonBranchsubMenu();
		DivisionPage division = branch.clickonDivisionsubMenu();
		ClientPage client = division.clickonClientMenu();
		String act = client.getTitle();
		String exp = "Clients";
		Assert.assertEquals(act, exp, "Invalid page title");
	}

}
