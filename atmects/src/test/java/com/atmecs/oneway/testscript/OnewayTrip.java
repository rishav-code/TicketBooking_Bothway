package com.atmecs.oneway.testscript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.read.ProvideData;
import com.atmecs.read.ReadProp;
import com.atmecs.testbase.testscript.SetupDriver;

public class OnewayTrip extends SetupDriver  {
	@Test(dataProvider = "destination", dataProviderClass = ProvideData.class)
	public void onewaytripbooking(String from, String to, String email, String f_name, String l_name, String cf_name,String cl_name, String phone ) throws FileNotFoundException, InterruptedException {
		ReadProp rp = new ReadProp();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		/*driver.findElement(By.id(rp.takeproperties("loc.roundtrip.btn"))).click();
		WebElement from =driver.findElement(By.xpath(rp.takeproperties("loc.from.txt")));
		from.click();
		from.sendKeys("kolkata");*/
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys(from);
		Thread.sleep(5000);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys(Keys.ENTER);
		       driver.findElement(By.xpath(rp.takeproperties("locators.textarea.To"))).sendKeys(to);
		Thread.sleep(3000);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.To"))).sendKeys(Keys.ENTER);
		clickOnElement(driver, "//input[@id='DepartDate']");
		clickOnElement(driver, rp.takeproperties("locators.textarea.Departon"));
		       selectDropdown(rp.takeproperties("locators.textarea.Adults"), "1");
		       selectDropdown(rp.takeproperties("locators.textarea.Children"), "1");
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.searchFlight"))).click();
		  Thread.sleep(5000);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.book"))).click();
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Insurance"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.ContinueDetails"))).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.EmailId"))).sendKeys(email);
		   Thread.sleep(5000);
		   System.out.println(rp.takeproperties("locators.textarea.Continue1"));
		   driver.findElement(By.id(rp.takeproperties("locators.textarea.Continue1"))).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Title"))).sendKeys(Keys.ENTER);
		   driver.findElement(By.xpath(rp.takeproperties("locator.select.title2"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).sendKeys(f_name);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.LastName"))).sendKeys(l_name);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.ctitle1"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("loc.textarea.ctitle"))).click();

		   
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.cFirstName"))).sendKeys(cf_name);
		   driver.findElement(By.id(rp.takeproperties("locators.textarea.cLastName"))).sendKeys(cl_name);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Day"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Month"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.year"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Mobileno"))).sendKeys(phone);
		  driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Continue"))).click();
	}
		  public void selectDropdown(String xpath, String visibleText) {
			  WebElement element= driver.findElement(By.xpath(xpath));
			  Select noOfpeople= new Select(element);
			  noOfpeople.selectByVisibleText(visibleText);
		  }


public void clickOnElement(WebDriver driver, String xpath){
driver.findElement(By.xpath(xpath)).click();

}
}


