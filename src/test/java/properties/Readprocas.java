package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;
import java.util.Set;

public class Readprocas {

	public static void main(String[] args) throws IOException {
		
		Properties pro= new Properties();
		
		String filePath=System.clearProperty("user.dir")+"\\data\\example.properties";
		
		
		FileInputStream file= new FileInputStream(filePath);
		
		pro.load(file);
		
		file.close();
		
		//read dta form properti file 
		String name=pro.getProperty("name");
		String email=pro.getProperty("email");
		String age= pro.getProperty("age");
		System.out.println(age+" "+name+" "+email);
		//capture all the properties
		Set<String> keys=pro.stringPropertyNames();
		System.out.println(keys);
		// capture all teh properties method2
		
		Set<Object>allKeys=pro.keySet();
		System.out.println(allKeys);
		
		
		// caputure all the values
		
		Collection<Object> values=pro.values();
		
		
		System.out.println(values);
		
		//read all the properi and their values
		
		
		for(String key:pro.stringPropertyNames()) {
			
			System.out.println(key+" "+pro.getProperty(key));
		}
		
	}
	
	
}
