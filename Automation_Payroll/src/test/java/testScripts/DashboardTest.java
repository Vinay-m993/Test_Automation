package testScripts;

import org.testng.Assert;

import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ExcelDataUtil;

public class DashboardTest extends ExcelDataUtil {

	// @Test
	public void verifyDashboardTitle() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("carol");
		login.enterPassword("1q2w3e4r");
		DashBoardPage dashboard = login.clickonLogin();
		String Actual = dashboard.getHeaderTitle();
		String Expt = "Payroll Application";
		Assert.assertEquals(Actual, Expt);
	}

}
