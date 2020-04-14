package test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Startup {
	WebDriver driver;
	
	
	
	
		
		
		
		@Test
		
		public void path() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		
		
		driver.get("https://www.ebay.com");
	
	}
	
	
	
	public void screens() {
		
		File take=  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtil.copyfile(take new File);
	
	}
	
	
	
	
	

	
	
	
	
	
}
