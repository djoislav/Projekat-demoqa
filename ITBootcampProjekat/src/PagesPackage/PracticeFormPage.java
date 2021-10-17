package PagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {

	WebDriver driver;
	WebElement firstName;
	WebElement lastName;
	WebElement email;
	WebElement maleGender;
	WebElement femaleGender;
	WebElement otherGender;
	WebElement mobile;
	WebElement dateOfBirth;
	WebElement subjects;
	WebElement hobbiesSports;
	WebElement hobbiesReading;
	WebElement hobbiesMusic;
	WebElement choosePicture;
	WebElement currentAdress;
	WebElement state;
	WebElement city;
	WebElement submit;

	public PracticeFormPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getMaleGender() {
		return maleGender;
	}

	public WebElement getFemaleGender() {
		return femaleGender;
	}

	public WebElement getOtherGender() {
		return otherGender;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDateOfBirth() {
		return dateOfBirth;
	}

	public WebElement getSubjects() {
		return subjects;
	}

	public WebElement getHobbiesSports() {
		return hobbiesSports;
	}

	public WebElement getHobbiesReading() {
		return hobbiesReading;
	}

	public WebElement getHobbiesMusic() {
		return hobbiesMusic;
	}

	public WebElement getChoosePicture() {
		return choosePicture;
	}

	public WebElement getCurrentAdress() {
		return currentAdress;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
