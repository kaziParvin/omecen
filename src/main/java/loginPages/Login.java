package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	 public static WebDriver driver;
	public void userName(String userName) {
		driver.findElement(By.name("username")).sendKeys(userName);
	}
	
	public void password(String password) {
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void signIn() {
		driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
		
	}
	
	
}
