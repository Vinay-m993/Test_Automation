package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	public static void waitforElementToBeClickable(WebDriver driver, WebElement element, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void waitforTextPresenceofElement(WebDriver driver, WebElement element, Duration timeout, String value) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.textToBePresentInElementValue(element, value));
	}

	public static void waitforVisibilityOfElement(WebDriver driver, WebElement element, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitforAlertIsPresent(WebDriver driver, WebElement element, Duration timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public void handleSleep(long timeout) throws InterruptedException {
		long timeSleep = 15L;
		TimeUnit time = TimeUnit.SECONDS;
		try {
			time.sleep(timeSleep);
		} catch (InterruptedException e) {
			System.out.println("Interrupted while sleeping");
		}
	}

}
