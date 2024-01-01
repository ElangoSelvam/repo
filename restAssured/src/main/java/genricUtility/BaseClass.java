package genricUtility;

import java.sql.SQLException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClass {

	public DatabaseAPI db=new DatabaseAPI();
	public JavaUtility jb=new JavaUtility();
	public RestAssuredLibrary rb=new RestAssuredLibrary();
	public RequestSpecification reqs;
	public ResponseSpecification resp;
	
	
	
	@BeforeSuite
	
	public void bsConfig() throws SQLException {
		db.connectToDataBase();
		reqs=new RequestSpecBuilder().setBaseUri("http://rmgtestingserver:8084")
		.setContentType(ContentType.JSON).build();
		resp=new ResponseSpecBuilder().expectContentType(ContentType.JSON).build();
	}
	@AfterSuite
	public void asConfig() throws SQLException {
		db.closeDataBase();
	}

	
	
	
	
	
	
	
}
