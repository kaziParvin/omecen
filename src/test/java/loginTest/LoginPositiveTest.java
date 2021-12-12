package loginTest;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loginPages.LoginPage;

public class LoginPositiveTest extends BaseTest {
	
@BeforeClass(groups={"smoke"})
public void openApplication() {
	openApp("chrome");
	
}

 @Test(groups={"smoke"}) 
  public void positiveLoginTest() {
	 test = extent.startTest("loginWith_Valid_Credentials"); 

	// test=extent.startTest("positiveLoginTest");
  LoginPage lp = new LoginPage();
  lp.userName("admin");
  lp.password("admin_test");
  lp.signIn();
  
  String actualTitle="A Product of Bost IT Solution - Inventory1";
     Assert.assertEquals(actualTitle, driver.getTitle());
  
  
 }
 

  @AfterClass(groups={"smoke"})
  public void finishTest() {
   driver.quit(); 
  }
 
}
