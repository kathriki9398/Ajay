package app;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parallelexcuion {
	
	
	@Test
	@Parameters("browser")
	public void fire(String b) throws IOException {
	
		
		
		
		
	String browserName=b;
			;
	
	WebDriver driver=null;
	
	if(browserName.equalsIgnoreCase("chrome")) {
		
		
		driver= new ChromeDriver();
	}
	else if(browserName.equalsIgnoreCase("firefox")) {
		
		driver= new FirefoxDriver();
	}
	else if(browserName.equalsIgnoreCase("edge")) {
		
		driver=new EdgeDriver();
	}
	}

}
