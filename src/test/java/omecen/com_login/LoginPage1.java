package omecen.com_login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage1 {

	public static void main(String[] args) throws InterruptedException {
		
		// open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		
		// open after 2 second for maximizing browser
		Thread.sleep(2000L);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin_test");
		//driver.findElement(By.id("btn btn-pill kt-login__btn-primary")).click();
		
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();

		

	}
	
	

}
