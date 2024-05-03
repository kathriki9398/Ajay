package cccc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Rampractice {

	
	@Test
public void postmethodceation() {
	
		baseURI="https://reqres.in/api";
		
		
		JSONObject js= new JSONObject();
		
		js.put("name", "kahtikri");
		
		js.put("addres", "bengalore");
		
		js.put("email", "kahtikri");
		
	String ram[]= {"Ram","ve"};
	js.entrySet();
	
	
		
		
		
		given()
		.header("Content-Type","contentType/json")
		.contentType("application/json")
		.body(js)
		
		.when()
		.post("/users")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("kahtikri"))
		
		.log().all();
		
		

		
		
		
}
	
	
	
	
}
