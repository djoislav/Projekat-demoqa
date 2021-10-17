package BasePackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import PagesPackage.ButtonsPage;
import PagesPackage.ElementsPage;
import PagesPackage.HomeDemoQA;
import PagesPackage.RadioButtonPage;
import PagesPackage.RegistrationPage;
import PagesPackage.TextBoxPage;
import PagesPackage.WebTablesPage;

public class Base {

	
			
			public WebDriver driver;
			public WebDriverWait wdwait;		
			public String homeurl;
			public HomeDemoQA homeDemoQA;
			public ElementsPage elementsPage;
			public RegistrationPage registrationPage;
			public TextBoxPage textBoxPage;
			public RadioButtonPage radioButtonPage;
			public WebTablesPage webTablesPage;
			public ButtonsPage buttonsPage;
			public ExcelProjekat excelProjekat;
			
			
			
			
			@BeforeClass
			public void setUp() throws IOException {
				System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
				driver = new ChromeDriver();
				homeDemoQA = new HomeDemoQA (driver, wdwait);
				elementsPage = new ElementsPage (driver, wdwait);
				textBoxPage = new TextBoxPage (wdwait, driver); 
				radioButtonPage = new RadioButtonPage (driver);
				webTablesPage = new WebTablesPage (driver);
				buttonsPage = new ButtonsPage (driver);
				excelProjekat = new ExcelProjekat("C:\\Users\\PC\\Desktop\\ExcelProjekat.xlsx");
				homeurl = excelProjekat.getStringData("TestProjekat", 1, 0);
				wdwait = new WebDriverWait(driver, 10);
			}

			@AfterClass
			public void tearDown() {
				driver.close();
				driver.quit();
			}

		


	}


