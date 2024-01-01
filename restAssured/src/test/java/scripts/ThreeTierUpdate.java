package scripts;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import ObjectRepository.PomApi;
import genricUtility.DatabaseAPI;
import genricUtility.JavaUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ThreeTierUpdate {
	
	@Test
	
	
	public void update() throws InterruptedException, SQLException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		
		
		
		Thread.sleep(1000);
		
		PomApi pom=new PomApi(driver);
		pom.login("rmgyantra","rmgy@9999");
		pom.passValue("divi1906","Created");
		
		// Project creation
		DatabaseAPI db=new DatabaseAPI();
		JavaUtility jb=new JavaUtility();
		String projectName="divi1906"+jb.getRandom();
		String createBy="Elango";
		
		
		
		// updating the Project
		
		JSONObject jobj=new JSONObject();
		
		jobj.put("createdBy", "createBy");
		jobj.put("projectName","projectName");
		jobj.put("status","Completed");
		jobj.put("teamSize",5);
		
		String baseURI = "http:rmgtestingserver:8084";
		RequestSpecification reqs=RestAssured.given();
		reqs.body(jobj);
		reqs.contentType(ContentType.JSON);
		Response res =reqs.put("http:rmgtestingserver:8084/projects/"+"ProjectId");
		res.then().log().all();
		db.connectToDataBase();
		String query="select* from project";
		String actdata=db.getExecuteQuery("select* from project;",1, "ProjectId");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
