package ram;

import org.apache.juneau.json.JsonSerializer;

import org.testng.annotations.Test;
import static ram.Getterandsettermehto.*;
public class Jsonformatechangingthing {

	@Test
	public void a() {
		
		
		JsonSerializer js= JsonSerializer.DEFAULT_READABLE;
		
		
		Getterandsettermehto jj= new Getterandsettermehto("eikis",1234);
		
		
		String raj= js.serialize(jj);
		
		System.out.println(raj);
		
		
	}
	
	
	
}
