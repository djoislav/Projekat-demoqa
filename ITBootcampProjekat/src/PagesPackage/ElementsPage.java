package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage {

	WebDriver driver;
	WebDriverWait wdwait;
	WebElement textBox;
	WebElement checkBox;
	WebElement radioButton;
	WebElement webTables;
	WebElement buttons;
	WebElement links;
	WebElement brokenLinksImages;
	WebElement uploadDownload;
	WebElement dynamicProperties;

	public ElementsPage(WebDriver driver, WebDriverWait wdwait) {
		super();
		this.driver = driver;
		this.wdwait = wdwait;
	}

	public void waiter() throws InterruptedException {
		wdwait.until(ExpectedConditions.elementToBeClickable(By.id("item-0")));
	}
	WebElement Element = driver.findElement(By.id("item-2"));
	
	public WebElement gettextBox() {
		return driver.findElement(By.id("item-0"));
	}

	public WebElement getCheckBox() {
		return driver.findElement(By.id("item-1"));
	}

	public WebElement getRadioButton() {
		return driver.findElement(By.id("item-2"));
	}

	public WebElement getWebTables() {
		return driver.findElement(By.id("item-3"));
	}

	public WebElement getButtons() {
		return driver.findElement(By.id("item-4"));
	}

	public WebElement getLinks() {
		return driver.findElement(By.id("item-5"));
	}

	public WebElement getBrokenLinksImages() {
		return driver.findElement(By.id("item-6"));
	}

	public WebElement getUploadDownload() {
		return driver.findElement(By.id("item-7"));
	}

	public WebElement getDynamicProperties() {
		return driver.findElement(By.id("item-8"));
	}

	public void clickTextBoxButton() {
		this.gettextBox().click();
	}

	public void clickCheckBoxButton() {
		this.getCheckBox().click();
	}

	public void clickRadioBoxButton() {
		this.getRadioButton().click();
	}

	public void clickWebTablesButton() {
		this.getWebTables().click();
	}

	public void clickButtonsButton() {
		this.getButtons().click();
	}

	public void clickLinkButton() {
		this.getLinks().click();
	}

	public void clickBrokenLinksImagesButton() {
		this.getBrokenLinksImages().click();
	}

	public void clickuploadDownloadButton() {
		this.uploadDownload.click();
	}
	public void clickdynamicPropertiesButton() {
		this.dynamicProperties.click();
	}
}
