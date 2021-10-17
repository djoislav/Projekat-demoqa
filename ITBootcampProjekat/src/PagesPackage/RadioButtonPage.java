package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage {

	WebDriver driver;
	WebElement yes;
	WebElement impressive;
	WebElement no;

	public RadioButtonPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getYes() {
		return driver.findElement(By.id("yesRadio"));
	}

	public WebElement getImpressive() {
		return driver.findElement(By.id("impressiveRadio"));
	}

	public WebElement getNo() {
		return driver.findElement(By.id("noRadio"));
	}

	public void clickYesButton() {
		this.getYes().click();
	}

	public void clickImpressiveButton() {
		this.getImpressive().click();
	}

	public void clickNoButton() {
		this.getNo().click();
	}
}
