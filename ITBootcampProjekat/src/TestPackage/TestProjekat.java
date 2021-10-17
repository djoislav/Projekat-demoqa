package TestPackage;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import BasePackage.Base;
// *************Project in progress**********
public class TestProjekat extends Base {

	
	public void scrollView(WebElement element) {
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollView(true);", element);
	}
	
	@BeforeMethod
	public void pageSetUp() {
		driver.manage().window().maximize();
		driver.navigate().to(homeurl);
	}

	@Test(priority = 10)
	public void textbox1() throws InterruptedException {

		String fullName = excelProjekat.getStringData("TestProjekat", 1, 3);
		String email = excelProjekat.getStringData("TestProjekat", 1, 4);
		String cAddress = excelProjekat.getStringData("TestProjekat", 1, 5);
		String pAddress = excelProjekat.getStringData("TestProjekat", 1, 6);
		homeDemoQA.waiter();
		homeDemoQA.getElements();
		elementsPage.waiter();
		elementsPage.gettextBox();
		textBoxPage.insertFullName(fullName);
		textBoxPage.insertEmail(email);
		textBoxPage.insertCurrAddress(cAddress);
		textBoxPage.insertPermAddress(pAddress);
		textBoxPage.clickSubmitButton();

	}

	@Test(priority = 20)

	// Test will fail because "No" radio button should be accessed, but it's not.
	public void testRadioButtons() throws InterruptedException {
		
		
		Thread.sleep(2000);
		homeDemoQA.clickElementsButton();
		// elementsPage.waiter();
		Thread.sleep(2000);
		elementsPage.getRadioButton();
		// We are checking if expected buttons are displayed
		Assert.assertTrue(radioButtonPage.getYes().isDisplayed());
		Assert.assertTrue(radioButtonPage.getImpressive().isDisplayed());
		Assert.assertTrue(radioButtonPage.getNo().isDisplayed());
		radioButtonPage.clickYesButton();
		radioButtonPage.clickImpressiveButton();
		radioButtonPage.clickNoButton();

	}

	@Test(priority = 30)

	public void testWebTablesForm() throws InterruptedException {
		//edit form locator is locator for editing the first row in table
		//so we will search by email, which is unique, so our data will be in the first row
		//if our add element is not there, no element will be present, so edit button won'be there too, so we can just check the presence of edit button
		//after we search, we can also go to edit and compare any data in table with our data, because only one element will be present
		String firstName = excelProjekat.getStringData("TestProjekat", 1, 1);
		String lastName = excelProjekat.getStringData("TestProjekat", 1, 2);
		String email = excelProjekat.getStringData("TestProjekat", 1, 4);
		String age = excelProjekat.getStringData("TestProjekat", 1, 10);
		String salary = excelProjekat.getStringData("TestProjekat", 8, 1);
		String department = excelProjekat.getStringData("TestProjekat", 8, 2);

		homeDemoQA.waiter();
		homeDemoQA.clickElementsButton();
		elementsPage.clickWebTablesButton();
		webTablesPage.clickAdd();
		webTablesPage.insertfirstName(firstName);
		webTablesPage.insertlastName(lastName);
		webTablesPage.insertEmail(email);
		webTablesPage.insertAge(age);
		webTablesPage.insertSalary(salary);
		webTablesPage.insertDepartment(department);
		webTablesPage.clickSubmit();
		webTablesPage.inputsearchBox(email);
		assert webTablesPage.getEditForm().isDisplayed();
		
		
		
	}
	@Test(priority = 40)

	public void testSortingByAge() throws InterruptedException {
		
		//we will insert minimum and maximum number of age and check if table can sort by age ascending, and then descending
		
		String maxage = excelProjekat.getStringData("TestProjekat", 3, 10);
		String minage = excelProjekat.getStringData("TestProjekat", 2, 10);
		

		homeDemoQA.waiter();
		homeDemoQA.clickElementsButton();
		elementsPage.clickWebTablesButton();
		webTablesPage.getEditForm();
		webTablesPage.insertAge(maxage); 	//inserting max number of age-99 in first row
		webTablesPage.clickSubmit();
		webTablesPage.clickSortAge();       //sorting so if table sorts by age, max number will fall onto bottom
		webTablesPage.getEditForm();
		webTablesPage.insertAge(minage);	//inserting minimum age - 1 in first row
		webTablesPage.clickSubmit();
		webTablesPage.clickSortAge();		//sorting age, so now is sorted descending
		webTablesPage.getEditForm();
		webTablesPage.getAge().getText();   //picking ages from first row, should be maxage, because its sorted descending
		assertEquals(maxage, webTablesPage.getAge().getText()); //comparing maxage to first row
		webTablesPage.clickSubmit();
		webTablesPage.clickSortAge();		//sorting age, so now is sorted ascending
		webTablesPage.getEditForm();
		webTablesPage.getAge().getText();
		assertEquals(minage, webTablesPage.getAge().getText()); //comparing minage to first row
		
	}
	
	@Test(priority = 50)

	public void testEditTables() throws InterruptedException {
		
		String firstName = excelProjekat.getStringData("TestProjekat", 2, 1);
		String lastName = excelProjekat.getStringData("TestProjekat", 2, 2);
		//we will try to change/edit original first and last name to Roger Waters
		homeDemoQA.waiter();
		
		homeDemoQA.clickElementsButton();
		elementsPage.clickWebTablesButton();
		webTablesPage.getEditForm();
		webTablesPage.insertfirstName(firstName);
		webTablesPage.insertlastName(lastName);
		webTablesPage.clickSubmit();
		webTablesPage.getEditForm().getText();
		Assert.assertEquals(webTablesPage.getEditForm().getText(), "Roger");  //we are comparing the edited form to text we edited/entered
		
	}	
		
		
	@Test(priority = 60)
	//testing double click by catching the confirmation message
	public void testDoubleClick() throws InterruptedException {
		homeDemoQA.waiter();
		homeDemoQA.clickElementsButton();
		elementsPage.clickButtonsButton();
		buttonsPage.clickDoubleClick();
		assert buttonsPage.getDoubleClickMessage().isDisplayed();
	}

	@Test(priority = 70)
	//testing right click by catching the confirmation message
	// The test wont work because we can't automate right click
	public void testRightClick() throws InterruptedException {
		homeDemoQA.waiter();
		homeDemoQA.clickElementsButton();
		elementsPage.clickButtonsButton();
		buttonsPage.clickRightClick();
		assert buttonsPage.getRightClickMessage().isDisplayed();
	}

	@Test(priority = 80)
	//testing single click by catching the confirmation message
	public void testSingleClick() throws InterruptedException {
		homeDemoQA.waiter();
		homeDemoQA.clickElementsButton();
		elementsPage.clickButtonsButton();
		buttonsPage.clickClick();
		assert buttonsPage.getClickMessage().isDisplayed();
	}

	@AfterMethod
	public void deleteCookies() {
		driver.manage().deleteAllCookies();
	}

}
