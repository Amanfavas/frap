package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.LoginPage;
public class Testcase001 {
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
	public void testcase001()
	{
		subscribe_btn.waitForLoginPageToLoad();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Frap";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
