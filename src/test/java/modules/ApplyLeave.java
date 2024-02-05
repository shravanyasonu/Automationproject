package modules;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Base.BaseTest;

public class ApplyLeave {

	public WebDriver driver;
	ApplyLeave() throws IOException{

		BaseTest bt=new BaseTest();
		 driver= bt.loginToApplication();
	}

	@Test
	public void navigatetoApplyLeaveModule()
	{
	driver.findElement(By.xpath("//button[@title='Apply Leave']")).click();

	}


}
