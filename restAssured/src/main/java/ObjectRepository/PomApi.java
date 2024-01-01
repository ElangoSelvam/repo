package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PomApi {

	
	@FindBy(xpath="//input[@id='usernmae']")
    private WebElement userbtn;
	@FindBy(xpath="//input[@id='inputPassword']")
    private WebElement passbtn;
	@FindBy(xpath="//button[text()='Sign in']")
    private WebElement createbtn;
	@FindBy(xpath="//a[text()='Projects']")
    private WebElement projects;
	@FindBy(xpath="//span[text()='Create Project']")
    private WebElement createprobtn;
	@FindBy(xpath="//input[@name='projectName']")
    private WebElement proname;
	@FindBy(xpath="//input[@name='teamSize']")
    private WebElement teambtn;
	@FindBy(xpath="//input[@name='createdBy']")
    private WebElement createBybtn;
	@FindBy(xpath="(//select[@name='status'])[2]")
    private WebElement dropdownbtn;
	@FindBy(xpath="//input[@type='submit']")
    private WebElement submitbtn;
	
	
	public PomApi(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getUserbtn() {
		return userbtn;
	}


	public void setUserbtn(WebElement userbtn) {
		this.userbtn = userbtn;
	}


	public WebElement getPassbtn() {
		return passbtn;
	}


	public void setPassbtn(WebElement passbtn) {
		this.passbtn = passbtn;
	}


	public WebElement getCreatebtn() {
		return createbtn;
	}


	public void setCreatebtn(WebElement createbtn) {
		this.createbtn = createbtn;
	}


	public WebElement getProjects() {
		return projects;
	}


	public void setProjects(WebElement projects) {
		this.projects = projects;
	}


	public WebElement getCreateprobtn() {
		return createprobtn;
	}


	public void setCreateprobtn(WebElement createprobtn) {
		this.createprobtn = createprobtn;
	}

//getters
	public WebElement getProname() {
		return proname;
	}


	public void setProname(WebElement proname) {
		this.proname = proname;
	}


	public WebElement getTeambtn() {
		return teambtn;
	}


	public void setTeambtn(WebElement teambtn) {
		this.teambtn = teambtn;
	}


	public WebElement getCreateBybtn() {
		return createBybtn;
	}


	public void setCreateBybtn(WebElement createBybtn) {
		this.createBybtn = createBybtn;
	}


	public WebElement getDropdownbtn() {
		return dropdownbtn;
	}


	public void setDropdownbtn(WebElement dropdownbtn) {
		this.dropdownbtn = dropdownbtn;
	}


	public WebElement getSubmitbtn() {
		return submitbtn;
	}


	public void setSubmitbtn(WebElement submitbtn) {
		this.submitbtn = submitbtn;
	}
	//Business Library
	public void login(String un,String pw){
		userbtn.sendKeys(un);
		passbtn.sendKeys(pw);
		createbtn.click();
		
	}
	
	
	
	public void passValue(String text,String value) {
	projects.click();
	createprobtn.click();
	proname.sendKeys(text);
	
	createBybtn.sendKeys(value);
	
	Select s=new Select(dropdownbtn);
	s.selectByValue("Created");
	submitbtn.click();
	}
	
	
	
}
