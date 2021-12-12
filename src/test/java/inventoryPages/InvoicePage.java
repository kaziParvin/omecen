package inventoryPages;

import org.openqa.selenium.By;

import loginTest.BaseTest;

public class InvoicePage extends BaseTest {
	
	public void invoiceLink() {
		driver.findElement(By.xpath("(//span[starts-with(@class,'kt-menu__')])[2]")).click();
		
	//driver.findElement(By.xpath("//*[contains(text(),'New Invoice')]")).click();

	}
	
	

}
