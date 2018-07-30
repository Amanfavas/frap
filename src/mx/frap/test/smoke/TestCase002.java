package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.LoginPage;
public class TestCase002 {
	WebDriver driver;
	LoginPage subscribe_btn;
	@BeforeMethod
	public void preCondition()
	{
		driver = TestConfig.getDriverInstance();
		subscribe_btn =  new LoginPage(driver);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	@Test
	public void testcase002()
	{
		subscribe_btn.waitForLoginPageToLoad();
		WebElement login = subscribe_btn.getLogin();
		login.click();
		boolean loginButtonStatus = 
		subscribe_btn.getLoginButton().isEnabled();
		Assert.assertEquals(loginButtonStatus, true);
		WebElement usernameTextbox =subscribe_btn.getUsernameTextbox();
		Assert.assertNotNull(usernameTextbox);
		WebElement passwordTextbox = subscribe_btn.getPasswordTextbox();
		Assert.assertNotNull(passwordTextbox);
	}
}
