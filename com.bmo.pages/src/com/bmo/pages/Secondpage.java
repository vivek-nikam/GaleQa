package com.bmo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secondpage {
	WebDriver driver;
	By header1 = By.xpath("//*[@id='topOfAccordion_guideContainer-rootPanel-accordioncontainer_68159639__']/h2");
	By empname =  By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-employerName1434568164069___widget']");
	By empyear = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-employedSince1434568305818-year___widget']");
	By empadd = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-textfield___widget']");
	By streetno = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-streetNumber___widget']");
	By streetname = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-streetName___widget']");
	By suite = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-apt___widget']");
	By city = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-city___widget']");
	By postalcode = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-postalCode___widget']");
	By workno = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workPhoneNumber1434569463060-phoneNumber___widget']");
	By ext = By.xpath(" //*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workPhoneNumber1434569463060-extension___widget']");
	
	
	public Secondpage(WebDriver driver){
		this.driver = driver;
	}
	public String getheader(){
		return driver.findElement(header1).getText();
	}
	public void empname(String name){
		driver.findElement(empname).sendKeys(name);
	}
	public void empyear(String year){
		driver.findElement(empyear).sendKeys(year);
	}
	public void empaddress(String add){
		driver.findElement(empadd).sendKeys(add);
	}
	public void setstreetno(String number){
		driver.findElement(streetno).sendKeys(number);
	}
	public void setstreetname(String stname){
		driver.findElement(streetname).sendKeys(stname);
	}
	public void setsuite(String suiteno){
		driver.findElement(suite).sendKeys(suiteno);
	}
	public void setcity(String cityname){
		driver.findElement(city).sendKeys(cityname);
	}
	public void postalcode(String code){
		driver.findElement(postalcode).sendKeys(code);
	}
	public void setworkno(String officeno){
		driver.findElement(workno).sendKeys(officeno);
	}
	public void setext(String exten){
		driver.findElement(ext).sendKeys(exten);
	}
	public void info(String name,String year,String add){
		this.empname(name);
		this.empyear(year);
		this.empaddress(add);
	}
	public void info1(String number,String stname,String suiteno,String cityname){
		this.setstreetno(number);
		this.setstreetname(stname);
		this.setsuite(suiteno);
		this.setcity(cityname);
	}
	public void info2(String code,String officeno,String exten){
		this.postalcode(code);
		this.setworkno(officeno);
		this.setext(exten);
	}
	
}
