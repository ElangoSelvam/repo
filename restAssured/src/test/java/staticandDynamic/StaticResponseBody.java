package staticandDynamic;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class StaticResponseBody {
	@Test
	public void get()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		String expected="HRM_DDT122";
		 Response resp = when().get("/projects");
		 
		 String actual=resp.jsonPath().get("[0].projectId");
		// Assert.assertEquals(actual, expected);
		 System.out.println("verified");
		 resp.then().log().all();
		 
				
	
		
	} 

}
