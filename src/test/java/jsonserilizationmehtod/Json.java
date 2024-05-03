package jsonserilizationmehtod;

import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;

public class Json {

	
	@Test
	public void ram() {
		
		
		JsonSerializer js= JsonSerializer.DEFAULT_READABLE;
		
		Serilization r= new Serilization("ramanj",1234,"sdf");
		
		String se= js.serialize(r);
		
		System.out.println(se);
		
		XmlSerializer xml = XmlSerializer.DEFAULT_NS_SQ;
		 String x= xml.serialize(r);
		 
		 System.out.println(x);
		
		
	}
	
	
}
