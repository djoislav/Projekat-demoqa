package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeDemoQA {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement joinNowButton;
	WebElement elements;
	WebElement forms;
	WebElement alerts;
	WebElement widgets;
	WebElement interactions;
	WebElement bookStore;

	
	
	public HomeDemoQA(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}
	public void waiter() throws InterruptedException {
		wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".avatar.mx-auto.white")));
	}
	public WebElement getJoinNowButton() {
		return driver.findElement(By.className("home-content"));
	}

	public WebElement getElements() {
		return driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
	}

	public WebElement getForms() {
		return driver
				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[1]"));

	}

	public WebElement getAlerts() {
		return driver
				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/*[1]"));
	}

	public WebElement getWidgets() {
		return driver
				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/*[1]"));
	}

	public WebElement getInteractions() {
		return driver
				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[2]/*[1]"));
	}

	public WebElement getBookStore() {
		return driver
				.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]/div[1]/div[2]/*[1]"));
	}

	public void clickJoinButton() {
		this.getJoinNowButton().click();
	}

	public void clickElementsButton() {
		this.getElements().click();
	}

	public void clickFormsButton() {
		this.getForms().click();
	}

	public void clickAlertsButton() {
		this.getAlerts().click();
	}

	public void clickWidgetsButton() {
		this.getWidgets().click();
	}

	public void clickInterractionsButton() {
		this.getInteractions().click();
	}

	public void clickBookStoreButton() {
		this.getBookStore().click();
	}
}