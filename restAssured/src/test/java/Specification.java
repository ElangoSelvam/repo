import org.testng.annotations.Test;

import generic.CreateProjectSpec;
import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;




public class Specification {
	@Test

	public void createProj() {
		
		
		CreateProjectSpec cp=new CreateProjectSpec("Elango","Ty","Tms",02);
		RequestSpecification req =new RequestSpecBuilder()
	
		.setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		
		ResponseBuilder res=new ResponseBuilder();
		//.expectContentType(ContentType.JSON)
		
		
		
		
		//.expectStatusCode(200).build();
		
		
		
		
		 
		
	}
	
	
	
}
