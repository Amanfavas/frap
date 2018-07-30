package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.SignUp;
public class TestCase006 {
	WebDriver driver;
	SignUp subscribe_btn;
	@BeforeMethod
	public void preCondition()
	{
		driver = TestConfig.getDriverInstance();
		subscribe_btn =  new SignUp(driver);
	}
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	@Test
	public void testcase005() throws InterruptedException{
		subscribe_btn.waitForLoginPageToLoad();
		subscribe_btn.getSignUpLink().click();
		Thread.sleep(5000);
		subscribe_btn.getFirstName().sendKeys("hh");
		String FirstName=subscribe_btn.getFirstName().getText();
		System.out.println(FirstName);
		subscribe_btn.getLastName().sendKeys("hh");
		String LastName=subscribe_btn.getLastName().getText();
		System.out.println(LastName);
		subscribe_btn.getEmail().sendKeys("hh@mailinator.com");
		String email=subscribe_btn.getEmail().getText();
		System.out.println(email);
		subscribe_btn.getPassword().sendKeys("hh");
		String passwd=subscribe_btn.getPassword().getText();
		System.out.println(passwd);
                subscribe_btn.setCountry.click();
		subscribe_btn.setCountry.clear();
                subscribe_btn.setCountry.sendkeys("+917034191716");
                subscribe_btn.setGenderMale().click();
                JavascriptExecuter js = (JavascrpitExecuter)driver
                js.executeScript("document.getElementById('dob').value='09/12/2017'");
                subscribe_btn.getSingUpButton().click();
	}
}
