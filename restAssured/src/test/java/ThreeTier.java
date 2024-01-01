




import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;


import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

import ObjectRepository.PomApi;
import genricUtility.DatabaseAPI;
import io.github.bonigarcia.wdm.WebDriverManager;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class ThreeTier  {

	
	
      public   DatabaseAPI db=new DatabaseAPI();
      @Test
		public void create() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver:8084/");
		Thread.sleep(1000);
		
		PomApi pom=new PomApi(driver);
		pom.login("rmgyantra","rmgy@9999");
		pom.passValue("divi1906","Created");
		
		
//		WebElement username=driver.findElement(By.xpath("//input[@id='usernmae']"));
//		username.sendKeys("rmgyantra");
//		WebElement password=driver.findElement(By.xpath("//input[@id='inputPassword']"));
//		password.sendKeys("rmgy@9999");
//		WebElement signin=driver.findElement(By.xpath("//button[text()='Sign in']"));
//		signin.click();
//		WebElement projects=driver.findElement(By.xpath("//a[text()='Projects']"));
//		projects.click();
//		WebElement createprojects=driver.findElement(By.xpath("//span[text()='Create Project']"));
//		createprojects.click();
//		WebElement projectname=driver.findElement(By.xpath("//input[@name='projectName']"));
//		projectname.sendKeys("divi1906");
//		WebElement teamsize=driver.findElement(By.xpath("//input[@name='teamSize']"));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value=10",teamsize);
//		WebElement projectmanager=driver.findElement(By.xpath("//input[@name='createdBy']"));
//		projectmanager.sendKeys("Leo Leo");
//		WebElement dropdown=driver.findElement(By.xpath("(//select[@name='status'])[2]"));
//		Select s=new Select(dropdown);
//				s.selectByValue("Created");
//				WebElement addproject=driver.findElement(By.xpath("//input[@type='submit']"));
//		addproject.click();
		}
		@Test
		
		public void validate() throws Throwable {
		
		Response res=when().get("http://rmgtestingserver:8084/projects/TY_PROJ_76781");
		System.out.println(res.then().log().all());
	 db.connectToDataBase();
	 String actdata=db.getExecuteQuery("select * from project;",1, "TY_PROJ_76781");
	 Assert.assertEquals(actdata,"TY_PROJ_76781");
	 System.out.println("TC is passed");
				
				
				
				
		}
		
	
}
	

