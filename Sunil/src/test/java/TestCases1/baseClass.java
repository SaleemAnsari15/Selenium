package TestCases1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class baseClass {
	public static WebDriver driver; 
		
	public void Setup() {
		
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\saleem.ansari\\eclipse-workspace\\Sunil\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://dev112stg.safetrax.in/auth?redirectTo=/");
		
	}

}
