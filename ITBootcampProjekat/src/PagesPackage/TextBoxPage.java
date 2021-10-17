package PagesPackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {

	
	WebDriverWait wdwait;
	WebDriver driver;
	WebElement fullName;
	WebElement email;
	WebElement currAddress;
	WebElement permAddress;
	WebElement submitButton;
	
	
	public TextBoxPage(WebDriverWait wdwait, WebDriver driver) {
		super();
		this.wdwait = wdwait;
		this.driver = driver;
	}
	
	public void waiter(WebElement element) throws InterruptedException {
		wdwait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public WebElement getFullName() {
		return driver.findElement(By.id("userName"));
	}
	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	}
	public WebElement getCurrAddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	public WebElement getPermAddress() {
		return driver.findElement(By.id("currentAddress"));
	}
	public WebElement getSubmitButton() {
		return driver.findElement(By.id("submit"));
	}
	public void insertFullName(String fullNameData) {
		this.getFullName().clear();
		this.getFullName().sendKeys(fullNameData);
	}
	public void insertEmail(String emailData) {
		this.getEmail().clear();
		this.getEmail().sendKeys(emailData);
	}
	public void insertCurrAddress(String currAddressData) {
		this.getCurrAddress().clear();
		this.getCurrAddress().sendKeys(currAddressData);
	}
	public void insertPermAddress(String permAddressData) {
		this.getCurrAddress().clear();
		this.getCurrAddress().sendKeys(permAddressData);
	}
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}
}
