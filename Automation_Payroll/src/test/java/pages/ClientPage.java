package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClientPage {
	
	WebDriver driver;
	
	@FindBy(name="ClientSearch[client_name]")
	WebElement clientName;
	
	@FindBy(name="ClientSearch[id]")
	WebElement clientId;
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement search;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement reset;
	
	public ClientPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	public void enterClientName(String name) {
		clientName.sendKeys(name);
	}
	public void enterClientId(String Id) {
		clientId.sendKeys(Id);
	}
	public void enterSearch() {
		search.click();
	}
	public void enterReset() {
		reset.click();
	}
	

}



