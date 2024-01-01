import java.util.Random;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DataMasking {
	public static void main(String[] args) {
		Random  random=new Random();
		int ran=random.nextInt();
		
		JSONObject js=new JSONObject();
		
		
		js.put("createdBy","Tyss");
		
		js.put("projectName","Tourism"+ran);
		js.put("status","created");
		js.put("teamSize","3");
		
		
		given().config(RestAssured.config.logConfig(LogConfig.logConfig().blacklistHeader("ContentType")))
		.body(js)
		.contentType(ContentType.JSON)
		.log().all()
		.when().post("http://rmgtestinserver:8084/addProject").then().assertThat().log().all();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
