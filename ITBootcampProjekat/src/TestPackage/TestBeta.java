package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBeta {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.demoqa.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 //Find element by link text and store in variable "Element"        		
     //   WebElement Element = driver.findElement(By.linkText("Linux"));

        //This will scroll the page till the element is found		
    //    js.executeScript("arguments[0].scrollIntoView();", Element);
	//	WebElement joinNow = driver.findElement(By.className("banner-image"));
	//	joinNow.click();
		
	//	WebElement elements = driver.findElement(By.cssSelector(".avatar.mx-auto.white"));
	//	elements.click();
		
		WebElement forms = 	driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/*[1]"));
		forms.click();
	//	WebElement textbox = driver.findElement(By.id("item-0"));
	//	textbox.click();
//		WebElement getGoToRegistration = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]/a"));
//		getGoToRegistration.click();
	//	Thread.sleep(2000);
//		WebElement getFirstNameField = driver.findElement(By.id("first-name"));
//		getFirstNameField.click();
//		getFirstNameField.sendKeys("Djordje");
///	WebElement getLastNameField = driver.findElement(By.id("last-name"));

	//	WebElement getEmailField = driver.findElement(By.id("email"));

//		WebElement getMobileField = driver.findElement(By.id("mobile"));

//		WebElement getSelectCountry = driver.findElement(By.id("country"));

//		WebElement getCityField = driver.findElement(By.id("city"));

	//	WebElement getMessageField = driver.findElement(By.id("message"));

//		WebElement getInputCodeField = driver.findElement(By.id("code"));

	//	WebElement getSendButton = driver.findElement(By.cssSelector(".btn.btn-block.btn-primary"));
	}
}
