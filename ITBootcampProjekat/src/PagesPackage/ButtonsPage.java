package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ButtonsPage {

	WebDriver driver;
	WebElement doubleClick;
	WebElement rightClick;
	WebElement click;
	WebElement doubleClickMessage;
	WebElement rightClickMessage;
	WebElement clickMessage;
	
	public ButtonsPage(WebDriver driver) {
		super();
		this.driver = driver;
	
	}
	public WebElement getDoubleClick() {
		return driver.findElement(By.id("doubleClickBtn"));
	}
	public WebElement getRightClick() {
		return driver.findElement(By.id("rightClickBtn"));
	}
	public WebElement getClick() {
		return driver.findElement(By.id("U5M4K"));
	}
	public WebElement getDoubleClickMessage() {
		return driver.findElement(By.id("doubleClickMessage"));
	}
	public WebElement getRightClickMessage() {
		return driver.findElement(By.id("rightClickMessage"));
	}
	public WebElement getClickMessage() {
		return driver.findElement(By.id("dynamicClickMessage"));
	}
	public void clickDoubleClick() {
		this.getDoubleClick().click();
		this.getDoubleClick().click();
	}
	public void clickRightClick() {
		this.getRightClick().click();
	}
	public void clickClick() {
		this.getClick().click();
	}
	
}
