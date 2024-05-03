package pojoclasspractice;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

import static io.restassured.matcher.RestAssuredMatchers.*;
public class RestAssured {

	@Test
	public void ram() {
		
		baseURI = "https://reqres.in/api";
		
		
		
		given()
		
		.when()
		.get("/users?page=2")
		.then()
		.statusCode(200)
		.header(DEFAULT_BODY_ROOT_PATH, isEmptyOrNullString())
		//.body("lindsay.ferguson@reqres.in", equalTo("lindsay.ferguson@reqres.in"))
		.log().all();
		
		
		
		
	}
	
	@Test
	public void raj() {
		
		Response res=
				given()
				
				.when()
				.get("https://reqres.in/api/users?page=2");
		
				
		Assert.assertEquals(res.getStatusCode(), 200);		
	
		Assert.assertEquals(res.header("Content_Type"), "application/json; charset=utf-8");
		
		
		
	}
	
	@Test
	public void moksh() {
		
		
		Response res= given()
				
				.get("https://reqres.in/api/users?page=2"
			);
		
		XmlPath xml= new XmlPath(res.)
		JsonPath json= new JsonPath(res.)
	}
	
	
	@Test
	public void singleFileuploade() {

		File myfile = new File("id");
		File myfile1 = new File("id");
		
		given()
		.multiPart("file",myfile)
		.multiPart("file",myfile1)
		.contentType("multipart/form-data")
		
		.when()
		.post("iekiK")
		.then()
		.statusCode(201)
		.body("[0].filename", equalTo("test1.txt"))
		.body("[1].filename", equalTo("Test1.txt"))
		.log().all();
		
	}
	
	
	@Test
	public void singleFileuploade1() {

		File myfile = new File("id");
		File myfile1 = new File("id");
		
		File filearr[] = {myfile,myfile1};
		given()
		.multiPart("file",myfile)
		.multiPart("file",myfile1)
		.contentType("multipart/form-data")
		
		.when()
		.post("iekiK")
		.then()
		.statusCode(201)
		.body("[0].filename", equalTo("test1.txt"))
		.body("[1].filename", equalTo("Test1.txt"))
		.log().all();
		
	}
	//how to downloade file in
	@Test
	void downloade() {
	
	given()
	
	.when()
	.get("https://reqres.in/api/users?page=2")
	.then()
	
	.statusCode(200)
	.log().all();
	
	
		
		
		
	}
	
	
}
