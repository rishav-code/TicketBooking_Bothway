package com.atmecs.oneway.testscript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.read.ReadProp;
import com.atmecs.testbase.testscript.SetupDriver;

public class OnewayTrip extends SetupDriver  {
	@Test
	public void onewaytripbooking() throws FileNotFoundException, InterruptedException {
		ReadProp rp = new ReadProp();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		/*driver.findElement(By.id(rp.takeproperties("loc.roundtrip.btn"))).click();
		WebElement from =driver.findElement(By.xpath(rp.takeproperties("loc.from.txt")));
		from.click();
		from.sendKeys("kolkata");*/
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys("Hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.xpath(rp.takeproperties("locators.textarea.From"))).sendKeys(Keys.ENTER);
		       driver.findElement(By.xpath(rp.takeproperties("locators.textarea.To"))).sendKeys("Vijayawada");
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
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.EmailId"))).sendKeys("rishav.kumar25@gmail.com");
		   Thread.sleep(5000);
		   System.out.println(rp.takeproperties("locators.textarea.Continue1"));
		   driver.findElement(By.id(rp.takeproperties("locators.textarea.Continue1"))).click();
		   Thread.sleep(5000);
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Title"))).sendKeys(Keys.ENTER);
		   driver.findElement(By.xpath(rp.takeproperties("locator.select.title2"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.FirstName"))).sendKeys("rishav");
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.LastName"))).sendKeys("kumar");
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.ctitle1"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("loc.textarea.ctitle"))).click();

		   
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.cFirstName"))).sendKeys("ris");
		   driver.findElement(By.id(rp.takeproperties("locators.textarea.cLastName"))).sendKeys("kum");
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Day"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Month"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.year"))).click();
		   driver.findElement(By.xpath(rp.takeproperties("locators.textarea.Mobileno"))).sendKeys("7063744660");
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


