package zzzzzzzzzRestassured;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Proeot {
	
	@Test
	public void per() throws IOException {
		
		Properties prop= new Properties();
		File file= new File("testdata.properties");
		FileInputStream fis =new  FileInputStream (file);
		
		prop.load(fis);
		
		
		System.out.println(prop.getProperty("browser"));
		
		System.out.println(prop.getProperty("firstname"));
	}
	
	

	
}
