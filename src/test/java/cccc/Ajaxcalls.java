package cccc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajaxcalls {
	
	
	
	public static void main(String[] args) throws IOException {
		
		
		
Properties pro = new Properties();

pro.setProperty("name", "kahtikr");

pro.setProperty("email", "ka@gamil.com");
pro.setProperty("age", "23");

String  filepath= System.getProperty("user.dir")+"\\data\\exmples.properties";

FileOutputStream fil=new FileOutputStream(filepath);
		
		pro.store(fil, filepath);
		
		fil.hashCode();
		
		System.out.println(".>>"+filepath);
		
		
		
		
		
		
	}

}
