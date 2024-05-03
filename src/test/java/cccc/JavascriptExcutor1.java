package cccc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExcutor1 {

	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	
	WebElement alert=driver.findElement(By.id("alert1"));
	
	//js.executeScript("window.scrollBy(0,600)");
	
	js.executeScript("arguments[0].click()", alert);
	
	
		System.out.println("successfully completed");
		
	}
	
}
