package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://inventory.omecen.com/");  
		driver.get("https://www.inventory.omecen.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");

	}

}
