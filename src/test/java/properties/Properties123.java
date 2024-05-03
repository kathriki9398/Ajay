package properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties123 {

	
	public static void main(String[] args) throws IOException {
		
		Properties pro = new Properties();
		pro.setProperty("name", "ramanji");
		
		pro.setProperty("email", "ram@gmail.com");
		
		pro.setProperty("age","23");
		
		
		String filePath=System.getProperty("user.dir")+"\\data\\example.properties";
		FileOutputStream file= new FileOutputStream(filePath);
		
	
		
		pro.store(file, "diekis");
	
		
		file.close();
		
		System.out.println("properties hava been written into "+filePath);
		
		
		
		
		
		
	}
}
