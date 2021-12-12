package searchContext;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElement {
	
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		FindElement obj = new FindElement();
		obj.findElement();

	}
	
	public void findElement() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		Thread.sleep(2000L);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		// How you can create WebElement
		WebElement userName = driver.findElement(By.name("username"));
		WebElement passWord = driver.findElement(By.name("password"));
		WebElement signIn = driver.findElement(By.xpath("//*[contains(text(),'Sign In')]"));
		String text = signIn.getText();
		System.out.println(text);
		
		userName.sendKeys("admin");
		passWord.sendKeys("admin_test");
		Thread.sleep(3000L);
		signIn.click();
		Thread.sleep(3000L);
		
	
	}
	

}
