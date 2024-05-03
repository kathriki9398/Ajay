package app;

import org.apache.juneau.json.JsonSerializer;
import org.testng.annotations.Test;

public class Serilization {

	
	
	@Test
	public void se() {
		
		JsonSerializer js = JsonSerializer.DEFAULT_READABLE;
		
		ExtentDemo v= new ExtentDemo("kaitki",1234);
		
		String k= js.serialize(v);
		
		System.out.println(k);
	}
	
	
	
	
}
