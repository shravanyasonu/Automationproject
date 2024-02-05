package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Base.BaseTest;

public class TimeSheet {

	WebDriver driver;
	TimeSheet() throws IOException
	{
		BaseTest bt= new BaseTest();

	  driver=bt.loginToApplication();
	  driver.findElement(By.xpath("//button[@type='button']")).click();

	}
	
	
	@Test
	public void clickOnTimeSheetModule()
	{
		driver.findElement(By.xpath("//button[@title='My Timesheet']")).click();
	}

}
