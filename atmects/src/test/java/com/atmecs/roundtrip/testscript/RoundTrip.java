package com.atmecs.roundtrip.testscript;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.atmecs.read.Readroundtrip_prop;
import com.atmecs.testbase.testscript.SetupDriver;

public class RoundTrip extends  SetupDriver {
	
	@Test
	public void roundtrip() throws FileNotFoundException {
	
	
	Readroundtrip_prop rrp= new Readroundtrip_prop();
	driver.get("https://www.cleartrip.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(rrp.takeproperties("loc.roundtrip.btn"))).click();

}
}