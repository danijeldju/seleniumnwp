package sign;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.google.common.io.Files;

import base.BaseTest;
import page.HomePage;

public class ScreenTest extends BaseTest{

	
	@Test
	public void testScreenSh()  {

			
				SoftAssert sa = new SoftAssert();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				sa.assertEquals(HomePage.URL, driver.getCurrentUrl());
				
				TakesScreenshot camera = (TakesScreenshot) driver;
				File SrcFile = camera.getScreenshotAs(OutputType.FILE);
				
				try{
		            Files.move(SrcFile, new File("src\\main\\resources\\screenshots\\test.png"));
		        }catch(IOException e){
		            e.printStackTrace();
		        }
			
				sa.assertAll();
		  }
	}

