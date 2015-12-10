package com.bmo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Thirdpage {
	WebDriver driver;
	By header2 = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-guidetextdraw_299897191__']/p");
	By empincome = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-employmentIncome1434569909512___widget']");
	By penincome = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-pensionIncome1434570049809___widget']");
	By otherincome = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-addresscontainer-otherIncome1436196431393___widget']");
	By householdincome = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-namecontainer-otherHouseholdIncome1436198231960___widget']");
	//By check = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-termsandcondition__']/div[1]/div/div[1]/label");
	//By next1 = By.xpath("//*[contains(@id,'guideContainer-rootPanel-accordioncontainer']");
	//By next1 = By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639___button_next']");
	
	public Thirdpage(WebDriver driver){
		this.driver = driver;
	}
	public String getheader2(){
		return driver.findElement(header2).getText();
	}
	public void setempincome(String income){
		driver.findElement(empincome).sendKeys(income);
	}
	public void setpenincome(String pincome){
		driver.findElement(penincome).sendKeys(pincome);
	}
	public void setotherincome(String oincome){
		driver.findElement(otherincome).sendKeys(oincome);
	}
	public void sethouseincome(String hincome){
		driver.findElement(householdincome).sendKeys(hincome);
	}
	/*public void click(){
		driver.findElement(check).click();
	}
	public void clicknext(){
		driver.findElement(next1).click();
	}*/
	public void lastinfo(String income,String pincome,String oincome,String hincome){
		this.setempincome(income);
		this.setpenincome(pincome);
		this.setotherincome(oincome);
		this.sethouseincome(hincome);
		
		
	}
	/*public void lastinfo1() {
		this.clicknext();
	}*/
}
