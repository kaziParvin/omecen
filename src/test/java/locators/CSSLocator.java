package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSLocator {
	
	WebDriver driver;

	public static void main(String[] args) {
		CSSLocator obj = new CSSLocator();
		obj.openCSS();
		obj.userName("samia");
		obj.password("Tithi");
		obj.loginButton();

	}
	
	
	public void openCSS() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://facebook.com");
	}
	
	public void userName(String userName) {
		//driver.findElement(By.cssSelector("#email")).sendKeys(userName);
		driver.findElement(By.cssSelector("#email")).sendKeys(userName);

	}
	
	public void password(String password) {
		
		//driver.findElement(By.cssSelector("[name='pass']")).sendKeys(password);
		
		//driver.findElement(By.cssSelector("[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("[name='pass'][id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("(//*[@id='email'])[1]")).click();
	}
	
	public void  loginButton() {
		
		//driver.findElement(By.cssSelector("[id^='u_0_d_']")).click();
		driver.findElement(By.xpath("//button[starts-with(@id,'u_0_d_')]")).click();
		
		
	}
	
	
	
}
