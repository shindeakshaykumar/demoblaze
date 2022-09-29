package com.projectname.qa.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class Homepage {
	
	
	@FindBy(xpath="//a[text()='Sign up']")private WebElement sineupbtn;
	@FindBy(xpath="//input[@id='sign-username']")private WebElement username;
	@FindBy(xpath="//input[@id='sign-password']")private WebElement password;
	@FindBy(xpath="//button[text()='Sign up']")private WebElement submitbtn;
	@FindBy(xpath="//a[text()='Phones']") private WebElement phones;
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")private WebElement galaxys6;
	@FindBy(xpath="//a[text()='Add to cart']")private WebElement addtocart;
	@FindBy(xpath="//a[@class='nav-link']")private WebElement homebtn;
	@FindBy(xpath="//a[text()='Laptops']")private WebElement laptopbtn;
	@FindBy(xpath="//img[@src='imgs/dell.jpg']")private WebElement delli7;
	@FindBy(xpath="//a[text()='Add to cart']")private WebElement addtocartlaptop;
	@FindBy(xpath="//a[@class='nav-link']")private WebElement homemenu;
	@FindBy(xpath="//a[text()='Monitors']")private WebElement monitorbtn;
	@FindBy(xpath="//a[text()='ASUS Full HD']")private WebElement asushd;
	@FindBy(xpath="//a[text()='Add to cart']")private WebElement addcartMonitor;
	@FindBy(xpath="//a[text()='Cart']")private WebElement cartmenu;
	@FindBy(xpath="//button[text()='Place Order']")private WebElement placeorder;
	@FindBy(xpath="//input[@id='name']")private WebElement namefoulder;
	@FindBy(xpath="//input[@id='country']")private WebElement countryname;
	@FindBy(xpath="//input[@id='city']")private WebElement cityname;
	@FindBy(xpath="//input[@id='card']")private WebElement creaditcard;
	@FindBy(xpath="//input[@id='month']")private WebElement month;
	@FindBy(xpath="//input[@id='year']")private WebElement year;
	@FindBy(xpath="//button[text()='Purchase']")private WebElement purchased;
	@FindBy(xpath="//p[@class='lead text-muted ']")private WebElement purchasepopup;
	@FindBy(xpath="//button[text()='OK']")private WebElement okbtn;
	
             //initilization

   public Homepage (WebDriver driver) {
	   PageFactory.initElements(driver,this);
   }
   
        //Usage
   
   public void clickDemoblazesineupbtn () {
	   Assert.assertTrue(sineupbtn.isDisplayed(),"sineup button is not display");
	   sineupbtn.click();
	   Reporter.log("clickDemoblazesineupbtn",true);
   }
   
   public void setDeomblazesineupbtnUsername() {
	   username.sendKeys("sctqaautomation@grr.la");
	   Reporter.log("setDeomblazesineupbtnUsername",true);
   }
   
   
   public void setDeomblazesineupbtnPassword() {
	   password.sendKeys("Spring@123");
	   Reporter.log("setDeomblazesineupbtnPassword",true);
   }
   
   
   public void clickclickDemoblazesubmitbtn () {
	   Assert.assertTrue(submitbtn.isDisplayed(),"submit botton is not display");
	   submitbtn.click();
	   Reporter.log("clickclickDemoblazesubmitbtn",true); 
   }
   
   public void clickDemoblazePhonestab () {
	   Assert.assertTrue(phones.isDisplayed(),"phones button id not display");
	   phones.click();
	   Reporter.log("clickDemoblazePhonestab",true); 
   }
   
   public void selectDemoblazegalaxys6 () {
	   Assert.assertTrue(galaxys6.isDisplayed(),"galaxys6 button id not display");
	   galaxys6.click();
	   Reporter.log("selectDemoblazegalaxys6",true); 
   }
   
   public void clickDemoblazeAddtocartbtn () {
	   Assert.assertTrue(addtocart.isDisplayed(),"add cart button is not display");
	   addtocart.click();
	   Reporter.log("clickDemoblazeAddtocartbtn",true); 
   }
   
   public void clickDemoblazeHomebtn () {
	   Assert.assertTrue( homebtn.isDisplayed(),"Home button is not display ");
	   homebtn.click();
	   Reporter.log("clickDemoblazeHomebtn",true); 
   }
   
   public void clickDemoblazelaptoptabbtn () {
	   Assert.assertTrue(laptopbtn.isDisplayed(),"laptopbtn is not display");
	   laptopbtn.click();
	   Reporter.log("clickDemoblazelaptoptabbtn",true); 
	   
   }
   
   public void selectDemoblazeDelli78gb () {
	   delli7.click();
	   Reporter.log("selectDemoblazeDelli78gb",true); 
   }
   public void clickDemoblazeAddtocartbtnOflaptop () {
	   Assert.assertTrue(addtocartlaptop.isDisplayed(),"addtocartlaptop button is not display");
	   addtocartlaptop.click();
	   Reporter.log("clickDemoblazeAddtocartbtnOflaptop",true); 
   }
   
   public void clickDemoblazeHomeMenu () {
	   Assert.assertTrue(homemenu.isDisplayed(),"Home button is not display");
	   homemenu.click();
	   Reporter.log("clickDemoblazeHomeMenu",true);
   }
   
   public void clickDemoblazeMonitorstab () {
	   Assert.assertTrue( monitorbtn.isDisplayed()," monitorbtn button is not display");
	   monitorbtn.click();
	   Reporter.log(" clickDemoblazeMonitorstab",true);
   }
   
   public void selectDemoblazeAsushd () {
	   asushd.click();
	   Reporter.log("selectDemoblazeAsushd",true);
   }
   
   public void clickDemoblazeAddtocartbtnMonitor () {
	   Assert.assertTrue(addcartMonitor.isDisplayed()," addcartMonitor button is not display");
	   addcartMonitor.click();
	   Reporter.log("clickDemoblazeAddtocartbtnMonitor",true);
   }
   
   public void clickclickDemoblazeCartMenu () {
	   Assert.assertTrue(cartmenu.isDisplayed()," cartmenu button is not display");
	   cartmenu.click();
	   Reporter.log("clickclickDemoblazeCartMenu",true);
   }
   
   public void clickclickDemoblazePlaceorderbtn (){
	   Assert.assertTrue( placeorder.isDisplayed(),"  placeorder button is not display");
	   placeorder.click();
	   Reporter.log("clickclickDemoblazePlaceorderbtn",true);
	   
   }
   
   public void setDeomblazePlaceOrdertabNamefield() {
	   namefoulder.sendKeys("akshaykumar");
	   Reporter.log("setDeomblazePlaceOrdertabNamefield",true);
   }
   
   public void setDeomblazePlaceOrdertabCountryfield() {
	   countryname.sendKeys("India");
	   Reporter.log("setDeomblazePlaceOrdertabCountryfield",true);
   }
   
   public void setDeomblazePlaceOrdertabCityfield() {
	   cityname.sendKeys("Pune");
	   Reporter.log("setDeomblazePlaceOrdertabCityfield",true);
   }
   
   public void setDeomblazeCreaditcardnofield() {
	   creaditcard.sendKeys("1234 9546 4751 2347");
	   Reporter.log("setDeomblazeCreaditcardnofield",true);
	   
   }
   
   public void setDeomblazeMonthfield() {
	   month.sendKeys("sept");
	   Reporter.log("setDeomblazeMonthfield",true);
	   
   }
   
   public void setDeomblazeYearfield() {
	   year.sendKeys("2022");
	   Reporter.log("setDeomblazeYearfield",true);
   }
   
   public void clickDemoblazePurchesorderbtn () {
	   Assert.assertTrue( purchased.isDisplayed(),"purchased button is not display");
	   purchased.click();
	   Reporter.log("clickDemoblazePurchesorderbtn",true);   
   }
   
   public void clickDemoblazePurchaspopup () {
	   Assert.assertTrue(purchasepopup.isDisplayed(),"purchasepopup button is not display");
	   purchasepopup.getText();
	   Reporter.log("clickDemoblazePurchaspopup",true); 
	   
   }
   
   public void clickDemoblazeOkbtn() {
	   Assert.assertTrue(okbtn.isDisplayed(),"okbtn button is not display");
	   okbtn.click();
	   Reporter.log("clickDemoblazeOkbtn",true); 
	   
   }
}
