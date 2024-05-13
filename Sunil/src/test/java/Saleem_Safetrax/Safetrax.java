package Saleem_Safetrax;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases1.baseClass;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Safetrax {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
	//driver.manage().timeouts().
	Actions action= new Actions(driver);
	JavascriptExecutor scroll =(JavascriptExecutor)(driver);
	driver.manage().window().maximize();
	
	driver.get("https://staging.safetrax.in/auth?redirectTo=/");
	driver.findElement(By.id("user")).sendKeys("safetrax");
	Thread.sleep(2000);
	driver.findElement(By.id("password")).sendKeys("safe@123");
	Thread.sleep(2000);
	driver.findElement(By.id("formsubmit")).click();
	Thread.sleep(3000);
	//driver.findElement(By.partialLinkText("https://dev112.safetrax.in/systemsettings/master/employeesettings")).click();
	
	
	driver.findElement(By.xpath("/html[1]/body[1]/ul[1]/li[10]/a[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[3]/tr[1]/td[2]/i[1]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.findElement(By.linkText("SETTINGS")).click();
//	Thread.sleep(3000);
//	
//	
//	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div[4]/a")).click();
//	Thread.sleep(2000);
//	
//	// Create new Employee 
//	driver.findElement(By.id("eFirstName")).sendKeys("Automation");
//	driver.findElement(By.id("eMiddleName")).sendKeys("A");
//	driver.findElement(By.id("eLastName")).sendKeys("Testing");
//	driver.findElement(By.id("eEmpId")).sendKeys("auto123");
//	driver.findElement(By.id("eEmpType")).click();
//	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/fieldset/div/div/div[6]/div/div/ul/li[3]/span")).click();
//	driver.findElement(By.id("eGenderSelect")).click();
//	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/fieldset/div/div/div[7]/div/div/ul/li[2]/span")).click();
//	driver.findElement(By.id("eMobile")).sendKeys("9191222711");
//	//driver.findElement(By.id("eSMobile")).sendKeys("2121212121");
//	driver.findElement(By.id("eEmailId")).sendKeys("automation@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"epoc\"]")).click();
//	driver.findElement(By.xpath("//div[12]/div/div/ul/li[2]")).click();
//	Thread.sleep(5000);
//	scroll.executeScript("window.scrollBy(0,400)");
//	Thread.sleep(5000);
//	driver.findElement(By.id("eIsSupervisor")).click();
//	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/fieldset/div/div[1]/div[14]/div/div/ul/li[3]")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[20]/div[1]/div[1]/input[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[8]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[6]/div[1]")).click();
//	
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[21]/div[1]/div[1]/input[1]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[21]/div[1]/div[1]/ul[1]/li[3]")).click();
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[22]/div[1]/div[1]/input[1]")).click();
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[1]/div[22]/div[1]/div[1]/ul[1]/li[3]")).click();
//	
//	
////	scroll.executeScript(window.scrollBy, args)
//	scroll.executeScript("window.scrollBy(0,400)");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("cessna business park");
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("/html/body/div[3]/div/div/form/fieldset/div/div[2]/div[3]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div")).click();
//	//scroll.executeScript("window.scrollBy(0,300)");
//	//WebElement suggestion = suggestionList.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1"))
//	//Thread.sleep(3000);
//	//suggestion.click();
//	
//	
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("saleem testing");
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("html/body/div[3]/div/div/form/fieldset/div/div[2]/div[3]/div[2]/div[2]/div/div[2]/div/div/div/div[2]/div/div")).click();
//	
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
//
//	scroll.executeScript("window.scrollBy(0,70)");
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
//	scroll.executeScript("window.scrollBy(0,70)");
//	
//	
//	
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]")).click();
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/form[1]/fieldset[1]/div[1]/div[2]/div[3]/div[2]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[2]")).click();
//	Thread.sleep(4000);
//	driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();
	
	//scroll.executeScript("window.scrollBy(0,200)");
	
	//driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[5]/div[1]/button[1]")).click();
	//driver.findElement(By.xpath("//input[@id='PickulocationAddr']")).sendKeys("HSR Layout");
	
	
	//driver.close();
	
	
	
	
	}

}
