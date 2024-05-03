package pojoclasspractice;

import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.xml.XmlSerializer;
import org.testng.annotations.Test;
import org.w3c.dom.html.HTMLSelectElement;

public class Setuppojo {

	@Test
	public void ram() {
		
		JsonSerializer js= JsonSerializer.DEFAULT_READABLE;
		
		Pojodetails raj= new Pojodetails("ramanji",234);
		
		String rajv= js.serialize(raj);
		System.out.println(rajv);
		
		XmlSerializer xm= XmlSerializer.DEFAULT_NS_SQ_READABLE;
		
		String sx= xm.serialize(raj);
		
		System.out.println(sx);
		HtmlSerializer ht = HtmlSerializer.DEFAULT_SQ;
		
		String vv= js.serialize(rajv);
		System.out.println(vv);
	}
	
	
}
