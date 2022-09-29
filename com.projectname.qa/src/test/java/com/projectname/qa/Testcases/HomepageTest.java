package com.projectname.qa.Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Page.Homepage;

public class HomepageTest {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\chrome104\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://demoblaze.com/index.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	

	
@Test
	public void DemoblazeHomepagetest() {
		
		Homepage t = new Homepage(driver);
		t.clickDemoblazesineupbtn();
		t.setDeomblazesineupbtnUsername();
		t.setDeomblazesineupbtnPassword();
		t.clickclickDemoblazesubmitbtn();
		t.clickDemoblazePhonestab();
		t.selectDemoblazegalaxys6();
		t.clickDemoblazeAddtocartbtn();
		t.clickDemoblazeHomebtn();
		t.clickDemoblazelaptoptabbtn();
		t.selectDemoblazeDelli78gb();
		t.clickDemoblazeAddtocartbtnOflaptop();
		t.clickDemoblazeHomeMenu();
		t.clickDemoblazeMonitorstab();
		t.selectDemoblazeAsushd();
		t.clickDemoblazeAddtocartbtnMonitor();
		t.clickclickDemoblazeCartMenu();
		t.clickclickDemoblazePlaceorderbtn();
		t.setDeomblazePlaceOrdertabNamefield();
		t.setDeomblazePlaceOrdertabCountryfield();
		t.setDeomblazePlaceOrdertabCityfield();
		t.setDeomblazeCreaditcardnofield();
		t.setDeomblazeMonthfield();
		t.setDeomblazeYearfield();
		t.clickDemoblazePurchesorderbtn();
		t.clickDemoblazePurchaspopup();
		t.clickDemoblazeOkbtn();
		
		
	}

     @AfterClass
     public void teardown() {
	  driver.quit();

     }	
}
