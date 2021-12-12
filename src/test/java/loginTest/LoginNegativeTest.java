package loginTest;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import loginPages.LoginPage;


public class LoginNegativeTest extends BaseTest {
	
@BeforeClass(groups={"smoke","regression"})
public void openApplication() {
	openApp("chrome");
	
}

  @Test (groups={"smoke"},priority =0)
  public void invalidLoginTest() {
  LoginPage lp = new LoginPage(); 
  lp.userName("parvin"); 
  lp.password("560998");
  lp.signIn();
 
  }
  
  @Test (groups={"smoke","regression"},priority =1)
  public void invalidPasswordTest() {
  LoginPage lp = new LoginPage(); 
  lp.userName("tithi"); 
  lp.password("579099786");
  lp.signIn();
  }
  
  @Test (groups={"smoke"},priority =2)
  public void invalidUserNameTest(){
  LoginPage lp = new LoginPage(); 
  lp.userName("samia parvin"); 
  lp.password("50966");
  lp.signIn();
  }
  
  @AfterClass(groups={"smoke","regression"})
  public void finishTest() {
	driver.quit(); 
		  
  }
 
}
