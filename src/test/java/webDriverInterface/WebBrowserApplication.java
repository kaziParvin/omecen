package webDriverInterface;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebBrowserApplication {

	public static void main(String[] args) {
		chromeDriver();
		//fireFox();
		

	}
	
	public static void chromeDriver() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://inventory.omecen.com/");
	}
	
	
	//public static void fireFox() {
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver = new FirefoxDriver();
	//}
	
}

