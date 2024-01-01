package Practice;


import org.testng.annotations.Test;

import com.ProjectGrid.tms.BaseClass;

 class TestClass1  extends BaseClass {
@Test
	public void amazon() {
	//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	//WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
}
