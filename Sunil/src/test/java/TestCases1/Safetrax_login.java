package TestCases1;


import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Safetrax_login extends baseClass {
	
	public  Safetrax_login() throws IOException{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id = "user")
	WebElement Username;
	
	
	@FindBy(id = "password")
	WebElement Password;
	
	
	@FindBy(id = "formsubmit")
	WebElement Formsubmit;
		
// New user create
	@FindBy(linkText = "SETTINGS")
	WebElement Settings ;
	
	@FindBy(xpath  = "/html/body/div[3]/div[1]/div/div[2]/div[4]/a")
	 WebElement CreateNew ;
	
	@FindBy(id =  "eFirstName")
	WebElement Firstname ;
	
	@FindBy(id = "eMiddleName")
	WebElement MiddleName;
	
	@FindBy(id = "eLastName")
	WebElement Lastname;
	
	@FindBy(id = "eEmpId")
	WebElement EmployeeID ;
	
	@FindBy(id = "eEmpType")
	WebElement EmPType;
	
	@FindBy(xpath =  "/html[1]/body[1]/div[3]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[6]/div[1]/div[1]/ul[1]/li[3]")
	WebElement EmPTypeYes;
	
	@FindBy(id = "eGenderSelect")
	WebElement Gender;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/form/fieldset/div/div/div[7]/div/div/ul/li[2]/span")
	WebElement GenderMale;
	
	@FindBy(id = "eMobile")
	WebElement Mobile;
	
	@FindBy(id = "eEmailId")
	WebElement EmailId;
	
	@FindBy(xpath = "//*[@id=\\\"epoc\\\"]")
	WebElement POC;
	
	@FindBy(xpath = "//div[12]/div/div/ul/li[2]")
	WebElement SelectPOC;
	
	@FindBy(id = "eIsSupervisor")
	WebElement SPOC;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/form/fieldset/div/div[1]/div[14]/div/div/ul/li[3]")
	WebElement SelectSPOC;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[20]/div[1]/div[1]/input[1]")
	WebElement DateOfJoining;
	
	@FindBy(xpath = "/html[1]/body[1]/div[8]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]")
	WebElement SelectDateSep1;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[21]/div[1]/div[1]/input[1]")
	WebElement SelfEdit;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[21]/div[1]/div[1]/ul[1]/li[3]")
	WebElement SelectSelfEditYes;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[22]/div[1]/div[1]/input[1]")
	WebElement SelfRoster;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[22]/div[1]/div[1]/ul[1]/li[3]")
	WebElement SelectSelfRosterYes;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Office;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/form/fieldset/div/div[2]/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div")
	WebElement SelectOffice;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement Team;
	
	@FindBy(xpath = "html/body/div[3]/div/div/form/fieldset/div/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div")
	WebElement SelectTeam;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement Status;
	
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement SelectStatusActive;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement SpecialCase;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement selectSC;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement TransportUser;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")
	WebElement SelectTU;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/button[1]")
	WebElement submit;
	
 
 
public void Page() throws InterruptedException{
	
	Username.sendKeys("saleem");
	Thread.sleep(5000);
	Password.sendKeys("safe@123");
	Thread.sleep(4000);
	Formsubmit.click();
	
}
public void Create_New() throws InterruptedException{
	
	Settings.click();
	Thread.sleep(5000);
	CreateNew.click();
	Thread.sleep(2000);
	Firstname.sendKeys("Automation");
	MiddleName.sendKeys("S");
	Lastname.sendKeys("Safetrax");
	EmployeeID.sendKeys("auto123");
	EmPType.click();
	EmPTypeYes.click();
	Gender.click();
	GenderMale.click();
	Mobile.sendKeys("9191222711");
	EmailId.sendKeys("automation@gmail.com");
	POC.click();
	SelectPOC.click();
	SPOC.click();
	SelectSPOC.click();
	DateOfJoining.click();
	SelectDateSep1.click();
	SelfEdit.click();
	SelectSelfEditYes.click();
	SelfRoster.click();
	SelectSelfRosterYes.click();
	Office.sendKeys("cessna business park");
	SelectOffice.click();
	Team.sendKeys("saleem testing");
	SelectTeam.click();
	Status.click();
	SelectStatusActive.click();
	SpecialCase.click();
	selectSC.click();
	TransportUser.click();
	SelectTU.click();
	submit.click();
	
		
}
}