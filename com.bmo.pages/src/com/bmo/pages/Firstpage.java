package com.bmo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Firstpage {
	WebDriver driver;
	By standard = By.xpath("html/body/div[2]/form[2]/input[1]");
	By header = By.xpath("//*[@id='navbar']/div/div[3]/h1");
	By firstname = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-yourName1434555782280-firstName___widget']");
	By middlename = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-yourName1434555782280-middleInitial___widget']");
	By lastname = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-yourName1434555782280-title___widget']");
	By sin = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-socialInsuranceNumber1434563821255___widget']");
	By searchhomeadd = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-textfield___widget']");
	By street = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-streetNumber___widget']");
	By streetname = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-streetName___widget']");
	By suite = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-apt___widget']");
	By city = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-textfield___widget']");
	By postal = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-postalCode___widget']");
	By phoneno = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-phoneNumber1434564904495-textfield___widget']");
	By emailadd = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-email1438104695209___widget']");
	By mortgage = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentAddressRent1435241383913___widget']");
	By year = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentAddressLivedSince1435241601308-year___widget']");
	By next = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer___button_next']");
	public Firstpage(WebDriver driver){
		this.driver = driver;
	}
	public void stdclick(){
		driver.findElement(standard).click();
	}
	public String title(){
		return driver.findElement(header).getText();
	}
	public void setuserfname(String fname){
		driver.findElement(firstname).sendKeys(fname);
	}
	public void setusermname(String mname){
		driver.findElement(middlename).sendKeys(mname);
	}
	public void setuserlname(String lname){
		driver.findElement(lastname).sendKeys(lname);
	}
	public void setsin(String number){
		driver.findElement(sin).sendKeys(number);
	}
	public void setsearchhomeadd(String address){
		driver.findElement(searchhomeadd).sendKeys(address);
	}
	public void setstreet(String strstreet){
		driver.findElement(street).sendKeys(strstreet);
	}
	public void setstreetname(String strname){
		driver.findElement(streetname).sendKeys(strname);
	}
	public void setsuite(String strsuite){
		driver.findElement(suite).sendKeys(strsuite);
	}
	public void setcity(String strcity){
		driver.findElement(city).sendKeys(strcity);
	}
	public void setpostal(String postalno){
		driver.findElement(postal).sendKeys(postalno);
	}
	public void setphoneno(String phone){
		driver.findElement(phoneno).sendKeys(phone);
	}
	public void setemail(String email){
		driver.findElement(emailadd).sendKeys(email);
	}
	public void setmortgage(String mort){
		driver.findElement(mortgage).sendKeys(mort);
	}
	public void setyear(String cyear){
		driver.findElement(year).sendKeys(cyear);
	}
	public void clknext(){
		driver.findElement(next).click();
	}
	public void validate(){
		this.stdclick();
	
	}
	public void setdetails(String fname,String mname,String lname,String number ){
		this.setuserfname(fname);
		this.setusermname(mname);
		this.setusermname(mname);
		this.setsin(number);
	}
	public void setdetails1(String address,String strstreet,String strname,String strsuite,String strcity){
		this.setsearchhomeadd(address);
		this.setstreet(strstreet);
		this.setstreetname(strname);
		this.setsuite(strsuite);
		this.setcity(strcity);
	}
	public void setdetails2(String postalno,String phone,String email){
		this.setpostal(postalno);
		this.setphoneno(phone);
		this.setemail(email);
	}
	public void setdetails3(String mort,String cyear){
		this.setmortgage(mort);
		this.setyear(cyear);

	}
	public void nextpage(){
		this.clknext();
	}
}

