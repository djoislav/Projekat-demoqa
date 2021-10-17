package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	WebDriver driver;

	WebElement goToRegistration;
	WebElement firstNameField;
	WebElement lastNameField;
	WebElement emailField;
	WebElement mobileField;
	WebElement selectCountry;
	WebElement cityField;
	WebElement messageField;
	WebElement inputCodeField;
	WebElement sendButton;
	WebElement output;
	
	public RegistrationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getGoToRegistration() {
		return driver.findElement(By.cssSelector(".btn.btn-primary-shadow.btn-block"));
	}

	public WebElement getFirstNameField() {
		return driver.findElement(By.id("first-name"));
	}
	public WebElement getLastNameField() {
		return driver.findElement(By.id("last-name"));
	}
	public WebElement getEmailField() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getMobileField() {
		return driver.findElement(By.id("mobile"));
	}
	public WebElement getSelectCountry() {
		return driver.findElement(By.id("country"));
	}
	public WebElement getCityField() {
		return driver.findElement(By.id("city"));
	}
	public WebElement getMessageField() {
		return driver.findElement(By.id("message"));
	}
	public WebElement getInputCodeField() {
		return driver.findElement(By.id("code"));
	}
	public WebElement getSendButton() {
		return driver.findElement(By.cssSelector(".btn.btn-block.btn-primary"));
	}
	
	public WebElement getOutput() {
		return driver.findElement(By.id("output"));
	}

	public void goToRegistration() {
		this.getGoToRegistration().click();
	}
	public void insertfirstName(String firstNameData) {
		this.getFirstNameField().clear();
		this.getFirstNameField().sendKeys(firstNameData);
		}
	public void insertlastName(String lastNameData) {
			this.getLastNameField().clear();
			this.getLastNameField().sendKeys(lastNameData);
	}
	public void insertEmail(String emailData) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(emailData);
}
	public void insertMobile(String mobileData) {
		this.getMobileField().clear();
		this.getMobileField().sendKeys(mobileData);
}
	public void selectCountry() {
		this.getSelectCountry().clear();
		
}
	
}
