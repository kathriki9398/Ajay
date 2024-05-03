package practiceperpose;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Lisnesers {

	
	
	@Test
	public void listen() {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		SoftAssert raju= new SoftAssert()
				;
		driver.get("https://www.facebook.com/login/");
		
		System.out.println(driver.getTitle());
		
		WebElement ram=driver.findElement(By.id("email"));
				ram.sendKeys("ekid");
				
				System.out.println(ram.getSize());
		
		System.out.println(ram.getAttribute("value"));
		
		
		raju.assertEquals(ram.getAttribute("value"), "ek23d");
		Assert.assertEquals(driver.getTitle(), "Log in to Facebook");
		
		driver.quit();
		
		
		
		
		
		
	}
	
	
}
