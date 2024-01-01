package Practice;


import org.testng.annotations.Test;

import com.ProjectGrid.tms.BaseClass;

public class TestClass2  extends BaseClass {

	@Test
	public void facebook() {
		
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver =new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
}
