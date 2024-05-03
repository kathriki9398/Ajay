package pojoclasspractice;

import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class JsonSchemvalidation {

	@Test
	public void json() {
		
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		
		.assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("storeJsonSchema.json"));
		
		
	}
	
	@Test
	public void ram() {
		
		
		String str = "A Sibling in Selenium Webdriver is a function used to fetch a web element which is a sibling to the parent element. If the parent element is known then the web element can be easily found or located that can use the sibling attribute of the Xpath expression in selenium webdriver.";
		
		
		
		str=str.toLowerCase();
		
	
		String a[] = str.split(" ");
		
		
		
		
	}
	
	
}
