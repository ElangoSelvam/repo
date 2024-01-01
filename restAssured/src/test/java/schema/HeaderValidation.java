package schema;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.Headers;
import  io.restassured.response.Response ;
import junit.framework.Assert;

public class HeaderValidation {
	
	@Test
	
	
	public void validate() {
		
		baseURI="http://rmgtestingserver";
		port=8084;
		String exp_statusLine="HTTP/1.1 200 ";		
		String exp_vary="Access-Control-Request-Method";
		String exp_contentType="application/json";
		String exp_Pragma="no-cache";
		String exp_Connection="keep-alive";
		
		Response response=when().get("projects/TY_PROJ_75453");
		String statusline=response.statusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline,exp_statusLine);
		
		Headers header= response.getHeaders();
		System.out.println(header);
		
		String act_contentType=response.getHeader("Content-Type");
		Assert.assertEquals(act_contentType,exp_contentType);
		
		String act_pragma=response.getHeader("Pragma");
		Assert.assertEquals(act_pragma, exp_Pragma);
		
		String act_Connection=response.getHeader("Connection");
		Assert.assertEquals(act_Connection,exp_Connection);
			
	}

}
