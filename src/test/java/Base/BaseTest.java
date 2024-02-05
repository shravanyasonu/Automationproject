package Base;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public WebDriver driver;
	
	

	

    @Test()
	public WebDriver loginToApplication() throws IOException {

		 FileInputStream fis = new  FileInputStream("C:\\Users\\shravan\\OneDrive\\Desktop\\suresh\\eclps\\SelinumJavaProj\\src\\test\\resources\\configurations.properties");
		 
	     Properties prop= new Properties();
	     
	     prop.load(fis);
	     if (prop.getProperty("browser").equalsIgnoreCase("chrome") ){
	    	 
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			WebDriverManager.chromedriver().setup();
	     }
    	if(prop.getProperty("browser").equalsIgnoreCase("edge")) {
		 driver= new EdgeDriver();
		 driver.manage().window().maximize();
		 WebDriverManager.edgedriver().setup();
    	}
    	
    	if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
   		driver= new FirefoxDriver();
 		driver.manage().window().maximize();
 		WebDriverManager.firefoxdriver().setup();
    	}
    	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

		driver.get(prop.getProperty("url"));
		
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    
//		JavascriptExecutor jse =(JavascriptExecutor) driver;
//		jse.executeScript("window.scrollTo(0,600)");

	      return driver;
        
	}

}
