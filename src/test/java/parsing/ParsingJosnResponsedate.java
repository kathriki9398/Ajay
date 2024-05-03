package parsing;

import static org.testng.Assert.assertEquals;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class ParsingJosnResponsedate {

	
	//@Test(priority=1)
	void tesJsonResponse() {
		
		//Approch one
		
	/*given()
	
	.contentType("ContentTypeJSON")
	
	.when()
	.get("http://localhost:3000/users")
	
	.then()
	
	.statusCode(200)
	.body("[1].firstname", equalTo("Mallaish"))*/
	
	//approch2
		
		Response res=
		given()
		
		.contentType(ContentType.JSON)
		.when()
		
		.get("http://localhost:3000/users")
		
		;
	
		
		Assert.assertEquals(res.getStatusCode(),200);
		
		assertEquals(res.header("Content-Type"), "application/json");
		
		
		String firstname=res.jsonPath().get("[1].firstname").toString();
		
		Assert.assertEquals(firstname, "Mallaish")
		
		;
	
	
	
	
	
		
		
	}
	

	@Test(priority=1)
	void tesJsonResponse1() {
		
		//Approch one
		
	
	//approch2
		
		Response res=
		given()
		
		.contentType(ContentType.JSON)
		.when()
		
		.get("http://localhost:3000/users")
		
		;
	
		
		/*Assert.assertEquals(res.getStatusCode(),200);
		
		assertEquals(res.header("Content-Type"), "application/json");
		
		
		String firstname=res.jsonPath().get("[1].firstname").toString();
		
		Assert.assertEquals(firstname, "Mallaish")*/
		
		;
	
	//JSONObject class
		
		JSONObject js= new JSONObject(res.toString());
		
		
		/*for(int i=0;i<js.getJSONArray("users").length();i++
				) {
			
			
			String book=js.getJSONArray("users").getJSONObject(i).get("firstname").toString();
			System.out.println(book);
			
		}*/
		boolean status= false;
		for(int i=0;i<js.getJSONArray("users").length();i++
				) {
			String book=js.getJSONArray("firstname").getJSONObject(i).get("firstname").toString();
		if(book.equals("Raghava")) {
			
			status=true;
			break;
		}
			
		}
		
		
	Assert.assertEquals(status, true);
		
		
	}
	
	
	
	
	
	
}
