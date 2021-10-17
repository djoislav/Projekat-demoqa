package PagesPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablesPage {

	WebDriver driver;
	WebElement addButton;
	WebElement firstName;
	WebElement lastName;
	WebElement email;
	WebElement age;
	WebElement salary;
	WebElement department;
	WebElement submit;
	WebElement searchBox;
	WebElement searchButton;
	WebElement editForm;
	WebElement deleteForm;
	WebElement sortAge;

	public WebTablesPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getAddButton() {
		return driver.findElement(By.id("addNewRecordButton"));
	}

	public WebElement getFirstName() {
		return driver.findElement(By.id("firstName"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("lastName"));
	}

	public WebElement getEmail() {
		return driver.findElement(By.id("userEmail"));
	}

	public WebElement getAge() {
		return driver.findElement(By.id("age"));
	}

	public WebElement getSalary() {
		return driver.findElement(By.id("salary"));
	}

	public WebElement getDepartment() {
		return driver.findElement(By.id("department"));
	}

	public WebElement getSubmit() {
		return driver.findElement(By.id("submit"));
	}

	public WebElement getSearchBox() {
		return driver.findElement(By.id("searchBox"));
	}

	public WebElement getSearchButton() {
		return driver.findElement(By.id("basic-addon2"));
	}

	public WebElement getEditForm() {
		return driver.findElement(By.xpath("//*[@id=\"edit-record-1\"]/svg"));
	}

	public WebElement getDeleteForm() {
		return driver.findElement(By.xpath("//*[@id=\"delete-record-4\"]/svg/path"));
	}

	public WebElement getSortAge() {
		return sortAge;
	}

	public void insertfirstName(String firstNameData) {
		this.getFirstName().clear();
		this.getFirstName().sendKeys(firstNameData);
	}

	public void insertlastName(String lastNameData) {
		this.getLastName().clear();
		this.getLastName().sendKeys(lastNameData);
	}

	public void insertEmail(String emailData) {
		this.getEmail().clear();
		this.getEmail().sendKeys(emailData);
	}

	public void insertAge(String ageData) {
		this.getAge().clear();
		this.getAge().sendKeys(ageData);
	}

	public void insertSalary(String salaryData) {
		this.getSalary().clear();
		this.getSalary().sendKeys(salaryData);
	}

	public void insertDepartment(String departmentData) {
		this.getDepartment().clear();
		this.getDepartment().sendKeys(departmentData);
	}

	public void clickSubmit() {
		this.getSubmit().click();
	}

	public void inputsearchBox(String searchData) {
		this.getSearchBox().clear();
		this.getSearchBox().sendKeys(searchData);
	}

	public void clickSearch() {
		this.getSearchButton().click();
	}

	public void clickAdd() {
		this.getAddButton().click();
	}

	public void clickDelete() {
		this.getDeleteForm().click();
	}

	public void clickSortAge() {
		this.getSortAge().click();
	}
}
