package webDriverInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseAndQuit {
	
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		CloseAndQuit obj = new CloseAndQuit();
		obj.close();
		obj.quit();
		obj.openAndQuit();
	
	}
	
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
		
	}
	
	public void close() {
		
	//close the current windows or tab
		
		openApp();
		System.out.println(driver.getTitle()); 
		driver.close();
		
	}
	
	public void quit() {
		//close and kill all the windows
		//quit the browser
		openApp();
		System.out.println("This is the title" + driver.getTitle());
		driver.close();
	}
	
	public void openAndQuit() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.assurancewireless.com/");
		driver.findElement(By.linkText("Coverage Map")).click();
		Thread.sleep(4000L);
		driver.quit();
	}
}
