package cccc;

import org.testng.annotations.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.json.JSONTokener;
import org.json.simple.*;
import org.testng.annotations.Test;



import org.json.simple.JSONObject.*;
import org.testng.ITestContext;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
public class Jsonvalur {

	@Test
	public void po() throws FileNotFoundException {
		
		
	
		
		
		
		File file= new File("C:\\Users\\User\\eclipse-workspace\\zzzzzzzzzRestassured\\target\\mm.json");		
		System.out.println(file.exists());
		
		FileReader fr= new FileReader(file);
		 ;
		 
		 JSONTokener r= new JSONTokener(fr);
		 
		 JSONObject data = new JSONObject(r);
		given()
		
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		given
		.post("https://reqres.in/api/users")
		
		.then()
		
		.statusCode(201)
		.log().all();
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
