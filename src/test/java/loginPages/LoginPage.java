package loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import loginTest.BaseTest;

public class LoginPage extends BaseTest{
	
	
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
