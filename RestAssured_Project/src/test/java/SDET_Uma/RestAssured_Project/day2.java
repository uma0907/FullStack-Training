package SDET_Uma.RestAssured_Project;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

import POJO.pojoclass;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class day2<objectMapper> {
	
//	@Test
//	public void JSONtoStr(enabled = false)
//	{
//		RestAssured.baseURI=("http://localhost:3000");
//			String reqbody = "{\"course\":\"IBMtraining\",\"purpose\":\"Training\",\"name\":\"A\",\"email\":\"abc@a.com\",\"duration\":\"1year\",\"mode\":\"online\"}";
//			
//		RestAssured
//			.given().contentType(ContentType.JSON)
//			.body(reqbody)
//			.when()
//				.post("/training")
//			.then().statusCode(201).log().all();
//	}
//	
//}


//	@Test
//	public void pojosample() throws IOException
//	{
//	pojoclass pojoobject = new pojoclass();
//	pojoobject.setAddr("street");
//	pojoobject.setCity("Mumbai");
//	pojoobject.setEmpname("Tester");
//	
//	System.out.println(pojoobject.getAddr());
//	System.out.println(pojoobject.getCity());
//	System.out.println(pojoobject.getEmpname());
//	
//	ObjectMapper obj = new ObjectMapper();
//	String body = obj.writerWithDefaultPrettyPrinter().writeValueAsString(pojoobject);
//	
//	System.out.println(body);
//	
//	}
	}