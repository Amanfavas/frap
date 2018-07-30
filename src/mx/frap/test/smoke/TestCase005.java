package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.LoginPage;
public class TestCase005 {
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
	public void testcase005(){
		subscribe_btn.waitForLoginPageToLoad();
		WebElement login = subscribe_btn.getLogin();
		login.click();
		subscribe_btn.getUsernameTextbox().sendKeys("hh@mailinator.com");
		subscribe_btn.getPasswordTextbox().sendKeys("123456");
		subscribe_btn.getLoginButton().click();
		String ActualToast=subscribe_btn.getLoginErrorToastMessage().getText();
		System.out.println(ActualToast);
		String ExpectdToast="messages.Kindly verify your email id and mobile number";
		Assert.assertEquals(ActualToast, ExpectdToast);
	}
}
