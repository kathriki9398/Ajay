package cccc;

import java.io.File;
import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Ram {

	
	
		@Test
	public void ramm() {
		
	HashMap data = new HashMap();
	
		data.put("name", "kathriki");
		data.put("locatin", "France");
		
		data.put("Phone", "12342")
		;
		
		String courseArr[] = {"c","c++","kahtikri","java","selenium","testng","veershs"};
		int ram[]= {2,34,2,2,3,234,24,3243};
		data.put("number", ram);
		
		
		data.put("course", courseArr);
		
		given()
		.header("Content-Type","application/json")
		.contentType("application/json")
		.body(data)
		
		.when()
		
		.post("https://reqres.in/api/users")
		
		.then()
		
		.statusCode(201)
		
		.body("name", equalTo("kathriki"))
		.log().all()
		;
	
	
	
	
	
	
	}
		
		@Test
		public void jsonlibrair() {
			
		JSONObject data= new JSONObject();
		
	data.put("name", "Scott");
	data.put("location", "France");
	data.put("phone", "1234");

	
	
	given() 
	
	.contentType("application/json")
	.body(data.toString())
	.when()
	
	
	.post("https://reqres.in/api/users")
	
	
.then()


.statusCode(201)
//.body("name", equalTo("Scott"))
//.body("location", equalTo("France"))
//.body("phone", equalTo("1234"))
//.body("course[0]", equalTo("c"))
//.body("course[1]", equalTo("c++"))

.log().all();
	
	
	
	
	
			
		}
}