package scripts;

import static io.restassured.RestAssured.when;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.PomApi;
import genricUtility.DatabaseAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;

public class ThreeTierWithPom {

	  public   DatabaseAPI db=new DatabaseAPI();
      @Test
		public void create() throws InterruptedException, SQLException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(1000);
		
		PomApi pom=new PomApi(driver);
		pom.login("rmgyantra","rmgy@9999");
		pom.passValue("divi1906","Created");
		
		DatabaseAPI db=new DatabaseAPI();
		
		Response res=when().get("http://rmgtestingserver:8084/projects/TY_PROJ_76781");
		System.out.println(res.then().log().all());
	 db.connectToDataBase();
	 String actdata=db.getExecuteQuery("select * from project;",1, "TY_PROJ_76781");
	 Assert.assertEquals(actdata,"TY_PROJ_76781");
	 System.out.println("TC is passed");
		
		
		
		
		
		
		
	
	
	
	
	
      }
	
}
