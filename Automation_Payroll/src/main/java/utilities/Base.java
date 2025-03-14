package utilities;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	public WebDriver driver;

	public void initializeBrowser(String Browser) throws Exception {
		if (Browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\vinay\\OneDrive\\Documents\\WebDriver\\Drivers\\ChromeDriver86\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\vinay\\OneDrive\\Documents\\WebDriver\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invaid Browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@BeforeMethod
	@Parameters({ "Browser", "Url" })
	public void launchBrowser(String browserName, String urlName) throws Exception {
		initializeBrowser(browserName);
		driver.get(urlName);
	}

	@AfterMethod
	public void closeBrowser(ITestResult result) throws Exception {
		if (ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
			File screenShot = takeScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./Screenshots/" + result.getName() + ".png"));
		}
		driver.close();
	}

}
