package loginTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import extentManager.ExtentManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
  
	
	public ExtentReports extent =  ExtentManager.getInstance();
	public static ExtentTest test;
	public static WebDriver driver;
	
	public void openApp(String bType) {
		test = extent.startTest("This is Base test"); 
		test.log(LogStatus.INFO, " browser is opening foe over ride");

		if (bType.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			
		} else if(bType.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			System.out.println("you did not specify correct driver");
		}
		//test.log(LogStatus.INFO, " browser is opening");
		driver.get("https://inventory.omecen.com/");
		test.log(LogStatus.INFO, "application  is opening");
		

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//test.log(LogStatus.INFO, bType, "browser is opening");
		test.log(LogStatus.INFO,  "browser is maximizing");

				}
	
	
	public void takeScreenShot(){
		  // store screenshot in that file
		  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  try {
		   //FileUtils.copyFile(src, new File("C:\\images\\pic.png"));
		   FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//images//pic.png"));
		   
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  //test.log(LogStatus.INFO,test.addScreenCapture("C:\\images\\pic.png"));
		  test.log(LogStatus.INFO,test.addScreenCapture(System.getProperty("user.dir")+"//images//pic.png"));
		 }
	
	public void writeReports() {
		if (extent != null) {
			extent.endTest(test);
			extent.flush();
		}
	}
}
