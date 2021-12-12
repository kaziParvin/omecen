package inventoryTests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import inventoryPages.InvoicePage;
import loginPages.LoginPage;
import loginTest.BaseTest;

public class InvoiceTest extends BaseTest{
	
	@BeforeClass(groups={"smoke"})
	public void openApplication() {
		openApp("chrome");
	}
	
	@Test(groups={"smoke"}, priority = 0)
	public void invoiceLinkTest() throws InterruptedException {
		LoginPage lg = new LoginPage();
		lg.userName("admin");
		lg.password("admin_test");
		lg.signIn();
		Thread.sleep(2000);
	}
		@Test(groups={"smoke"}, priority =1)
		public void invoice() {
			InvoicePage lp = new InvoicePage();
			lp.invoiceLink();
	}
	
	@AfterClass(groups={"smoke"})
	public void finish() {
			  driver.quit();
	}
	
	

}
