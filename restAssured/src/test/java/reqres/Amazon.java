package reqres;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	
	@Test
	public void mobile() throws Throwable
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement( By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone",Keys.ENTER);
	driver.findElement(By.xpath("//span[.='Need help?']"));
	Actions act=new Actions(driver);
	//act.scrollToElement(driver.findElement(By.xpath("//span[.='Need help?']"))).perform();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,4950)");
	String nu="4";
	
			
			
	String my = driver.findElement(By.xpath("//span[@class=\"s-pagination-strip\"]/descendant::span[@class=\"s-pagination-item s-pagination-selected\"]")).getText();
	WebElement next=driver.findElement(By.xpath("//a[.='Next']"));
	try {
	for(int i=0;i<=3;i++) {
		next.click();
	}
	}
	catch(Exception e)
	{
		
	}
	}
	
}
