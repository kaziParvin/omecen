package webDriverInterface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigation {

	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Navigation obj = new Navigation();
		obj.navigation();
		
	}
	
	public void navigation() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://inventory.omecen.com/");
		Thread.sleep(2000L);
		driver.manage().window().maximize();

		// telling the website for wait 10 second
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin_test");
		//driver.findElement(By.id("btn btn-pill kt-login__btn-primary")).click();
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		
		Thread.sleep(3000L);
		driver.navigate().back();
		Thread.sleep(3000L);
		driver.navigate().forward();
		
		// driver.nagiagte has the capability to go forward and backward
	}
	
	

}
