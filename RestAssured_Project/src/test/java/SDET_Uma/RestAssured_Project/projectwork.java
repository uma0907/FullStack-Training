package SDET_Uma.RestAssured_Project;

import org.json.simple.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class projectwork {
 
	String usrname = "Uma";
	
	@Test
	public void createuser()
	{
		JSONObject obj = new JSONObject();
		obj.put("username", usrname);
		obj.put("firstName", "Test");
		obj.put("lastName", "User");
		obj.put("email", "Tester@g.com");
		obj.put("password", "Tester1");
		obj.put("phone", "9999999999");
		obj.put("userStatus", 0);
		
		System.out.println(obj);
			
		RestAssured.baseURI=("https://petstore.swagger.io/v2");
			RestAssured
			.given().contentType(ContentType.JSON)
				.body(obj)
			.when()
				.post("/user")
			.then().statusCode(200).log().all().extract().response();
			
			
		}

	@Test(dependsOnMethods = {"createuser"})
	public void modifyuser()
	{
		JSONObject obj = new JSONObject();
		obj.put("username", usrname);
		obj.put("firstName", "Fullstack");
		obj.put("lastName", "Trainee");
		obj.put("email", "fullstack@g.com");
		obj.put("password", "fullstack");
		obj.put("phone", "9999999999");
		obj.put("userStatus", 1);
		
				
		System.out.println(obj);	
		
		
		RestAssured.baseURI=("https://petstore.swagger.io/v2");
			RestAssured
			.given().contentType(ContentType.JSON).queryParam("username",usrname)
				.body(obj)
			.when()
				.put("/user/"+usrname)
			.then().statusCode(200).log().all();
			
			System.out.println(obj);
			
	}
	
	@Test
	public void login()
	{
		RestAssured.baseURI=("https://petstore.swagger.io/v2");
			RestAssured.
			given().queryParam("username","string").queryParam("password","string").when()
				.get("/user/login").then().statusCode(200).log().all();
			}
	
	@Test
	public void logout()
	{
		RestAssured.baseURI=("https://petstore.swagger.io/v2");
			RestAssured.
			given()
				.get("/user/logout").then().statusCode(200).log().all();
			}
	
	
	@Test(dependsOnMethods = {"modifyuser"})
	public void deleteuser()
	{
		JSONObject obj = new JSONObject();
						
		RestAssured.baseURI=("https://petstore.swagger.io/v2");
			RestAssured
			.given().contentType(ContentType.JSON).queryParam("username",usrname)
				.body(obj)
			.when()
				.delete("/user/"+usrname)
			.then().statusCode(200).log().all();
			
			System.out.println(obj);
			
	}
	}

	



