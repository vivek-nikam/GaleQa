package com.bmocases.pages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bmo.pages.Firstpage;
import com.bmo.pages.Secondpage;
import com.bmo.pages.Thirdpage;


public class Testcases {
	 WebDriver driver;
	 Firstpage objfirstpage;
	 Secondpage objsecondpage;
	 Thirdpage objthirdpage;
  @BeforeTest
  public void setup() {
	 
	  driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("http://ec2-52-25-9-88.us-west-2.compute.amazonaws.com/content/forms/af/bmo/wl/entry.html");
	}
  @Test(priority=0)
  public void clickit(){
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.validate();
	  driver.findElement(By.xpath("//*[@id='costofborrowing_accept']")).click();
  }
  @Test(priority=1)
	  public void test_page() {
		  objfirstpage = new Firstpage(driver);
		  String actualText =  objfirstpage.title();
		  Assert.assertEquals(actualText,"Your Application");
	  }
  @Test(priority=2)
  public void data(){
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-switchcontainer__']/div/div[1]/label[1]")).sendKeys(Keys.SPACE);
	  //driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-emailentry__']/div[1]/div/div[1]/h3")).sendKeys(Keys.ARROW_DOWN);
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.setdetails("Vivek", "G.", "Nikam", "747 647 121");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-yourName1434555782280-title1435439214367___widget']"))).selectByValue("0");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-dateOfBirth1434563837348-day___widget']"))).selectByValue("29");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-dateOfBirth1434563837348-month___widget']"))).selectByValue("7");
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-dateOfBirth1434563837348-year___widget']")).sendKeys("1980");
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-yourName1434555782280-title___widget']")).sendKeys("Nikam");
  }
  
  @Test(priority=3)
  public void data1(){
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-dateOfBirth1434563837348__']/div[1]/label")).sendKeys(Keys.SPACE);
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.setdetails1("1/2 MAIN STREET", "1/2 MAIN STREET", "Abbey", "10-123", "MONTREAL");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentHomeAddress1434564160490-province___widget']"))).selectByValue("QC");
	  }
  @Test(priority=4)
  public void data2(){
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.setdetails2("H3Z 2Y7", "5143453663", "vivek.nikam@galepartners.com");
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-phoneNumber1434564904495__']/div[1]/label")).sendKeys(Keys.SPACE);
  }
  @Test(priority=5)
  public void data3(){
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-housingStatus1434565546405___widget']"))).selectByValue("0");
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.setdetails3("25000", "1989");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer-panel-currentAddressLivedSince1435241601308-month___widget']"))).selectByValue("6");
  }
  @Test(priority=6)
  public void data4(){
	  objfirstpage = new Firstpage(driver);
	  objfirstpage.clknext();
  }
  @Test(priority=7)
  public void data5(){
	  objsecondpage = new Secondpage(driver);
	  String realtext = objsecondpage.getheader();
	  Assert.assertEquals(realtext,"Financial Information");
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-switchcontainer__']/div/div[1]/label[1]")).sendKeys(Keys.SPACE);
  }
  @Test(priority=8)
  public void data6(){
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-employmentStatus1434568111831___widget']"))).selectByValue("0");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-occupation1434567999785___widget']"))).selectByValue("0");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-employedSince1434568305818-month___widget']"))).selectByValue("1");
	  objsecondpage = new Secondpage(driver);
	  objsecondpage.info("Vivek", "1989", "PO BOX 1");
	  
  }
  @Test(priority=9)
  public void data7(){
	  objsecondpage = new Secondpage(driver);
	  objsecondpage.info1("123", "Abbey", "10-12", "Advocate Harbour");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-workAddress1435605731346-province___widget']"))).selectByValue("NS");	  
  }
  @Test(priority=10)
  public void data8(){
	  objsecondpage = new Secondpage(driver);
	  objsecondpage.info2("B0M 1A0", "5143633446", "438");
  }
  @Test(priority=11)
  public void data9(){
	  objthirdpage = new Thirdpage(driver);
	  String realtext1 = objthirdpage.getheader2();
	  Assert.assertEquals(realtext1,"Gross Monthly Income");
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-guidetextdraw_299897191__']/p")).sendKeys(Keys.SPACE);
  }
  @Test(priority=12)
  public void data10() throws InterruptedException{
	  objthirdpage = new Thirdpage(driver);
	  objthirdpage.lastinfo("25000", "5000", "2000", "3000");
	  Thread.sleep(3000);
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-addresscontainer-otherIncomeSource1436197761983___widget']"))).selectByValue("2");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-namecontainer-otherHouseholdIncomeSource1436198311861___widget']"))).selectByValue("3");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-namecontainer-otherHouseholdIncomeSource1436198311861___widget']"))).selectByValue("4");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-bankingInformation1434570593941-typeOfAccount___widget']"))).selectByValue("3");
	  new Select(driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-bankingInformation1434570593941-bankNameOfAccount___widget']"))).selectByValue("3");
	  
  }
  @Test(priority=13)
  public void data11(){
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639-panel-termsandcondition__']/div[1]/div/div[1]/label")).click();
	  
	  
  }
  @Test(priority=14)
  public void data12() throws InterruptedException   {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639__']/div/div[2]")).click();
	  driver.findElement(By.xpath("//*[@id='guideContainer-rootPanel-accordioncontainer_68159639___button_next']")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("guideContainer-rootPanel-accordioncontainer_68159639___button_next")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("guideContainer-rootPanel-accordioncontainer_68159639___button_continue")).click();
	  driver.findElement(By.id("submitBtn__panelThree")).click();
	  Thread.sleep(3000);
	  String newtext = driver.findElement(By.xpath("//*[@id='bmoContainer']/div[3]/div[1]/div/div[1]/div/h1")).getText();
	  Assert.assertEquals(newtext, "Congratulations!");
	  Thread.sleep(5000);
	  driver.close();
  }
  }

