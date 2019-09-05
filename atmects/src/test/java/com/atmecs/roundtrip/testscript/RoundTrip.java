package com.atmecs.roundtrip.testscript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.atmecs.read.ProvideData;
import com.atmecs.read.Readroundtrip_prop;
import com.atmecs.testbase.testscript.SetupDriver;

public class RoundTrip extends SetupDriver {

	@Test(dataProvider = "destination", dataProviderClass = ProvideData.class)
	public void roundtrip(String from, String to, String email, String f_name, String l_name, String cf_name,String cl_name, String phone) throws FileNotFoundException, InterruptedException {

		Readroundtrip_prop rrp = new Readroundtrip_prop();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(rrp.takeproperties("loc.roundtrip.btn"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.From"))).sendKeys(from);
		Thread.sleep(5000);
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.From"))).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.To"))).sendKeys(to);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='DepartDate']"));
		
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Departon")));
	
		driver.findElement(By.xpath(rrp.takeproperties("searchpage.returntab.txt")));
		driver.findElement(By.xpath(rrp.takeproperties("searchpage.returndate.txt")));

		selectDropdown(rrp.takeproperties("searchpage.Adults.txt"), "1");
		selectDropdown(rrp.takeproperties("searchpage.Children.txt"), "1");
		selectDropdown(rrp.takeproperties("searchpage.Infants.txt"), "0");
		clickOnElement(driver, rrp.takeproperties("searchpage.searchFlight.txt"));
		Thread.sleep(10000);
		driver.findElement(By.xpath(rrp.takeproperties("loc.2ndpagebook.btn"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(rrp.takeproperties("Itinerarystep.Insurance.txt"))).click();
		driver.findElement(By.xpath(rrp.takeproperties("Itinerarystep.ContinueDetails.txt"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.EmailId")))
				.sendKeys("email");
		Thread.sleep(5000);
		
		 driver.findElement(By.id(rrp.takeproperties("locators.textarea.Continue1"))).click();
			Thread.sleep(5000);
		driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.Title"))).sendKeys(Keys.ENTER);
		  driver.findElement(By.xpath(rrp.takeproperties("locator.select.title2"))).click();
	   driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.FirstName"))).click();
		 driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.FirstName"))).sendKeys("rishav");
		  driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.LastName"))).sendKeys("kumar");
		  driver.findElement(By.xpath(rrp.takeproperties("locators.textarea.ctitle1"))).click();
	   driver.findElement(By.xpath(rrp.takeproperties("loc.textarea.ctitle"))).click();

	}

	public void selectDropdown(String xpath, String visibleText) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select noOfpeople = new Select(element);
		noOfpeople.selectByVisibleText(visibleText);
	}

	public void clickOnElement(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}

}
