package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.LoginPage;
import 
public class TestCase007 {
 WebDriver driver;
	Location location;
	DropDownHandlers dropown;
	LoginPage subscribe_btn;
	@BeforeMethod
	public void preCondition()
	{
		driver = TestConfig.getDriverInstance();
		
		location=new Location(driver);
		subscribe_btn =  new LoginPage(driver);
		dropdown =new  DropDownHandler();
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	@Test
	public void testcase005(){
        subscribe_btn.waitForLoginPageToLoad();
	WebElement login = subscribe_btn.getLogin();
	login.click();
        subscribe_btn.getLoginButton().click();
        String actualEmptytext=subscribe_btn.getUsernameTextbox().getAttribute("value");
         System.out.println(actualEmptytext);    
	 dropdown.selectDDLByText(location.searchTextBox,"Bangalore")
        }
        }
        
}
