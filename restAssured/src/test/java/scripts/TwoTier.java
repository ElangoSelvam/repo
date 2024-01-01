package scripts;
import org.testng.Assert;

import org.testng.annotations.Test;

import generic.PojoTwotier;
import genricUtility.BaseClass;
import genricUtility.EndPointLibrary;

import static io.restassured.RestAssured.*;

import java.util.Random;

import io.restassured.response.Response;


@Test
public class TwoTier extends BaseClass{

	@Test
	public void createProj() throws Throwable {
	PojoTwotier cp=new PojoTwotier("Akash","FireFlink"+(new Random().nextInt(500)),"Travelled",07);

	Response response=given()
			.spec(reqs).body(cp)
	        .when().post(EndPointLibrary.createProject);
	
	
	String expdata=rb.getJsonData(response,"projectId");
	System.out.println(expdata);
	
	String query ="select* from project;";
	String actData=db.getExecuteQuery("select* from project;", 1, expdata);
	Assert.assertEquals(actData,expdata);
	System.out.println("TC PASSED");
	response.then().log().all();
	
	}
}

