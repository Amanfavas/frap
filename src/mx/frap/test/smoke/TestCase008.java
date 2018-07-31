package mx.frap.test.smoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import mx.frap.test.config.TestConfig;
import mx.frap.ui.object.Location;
public class TestCase008{
  WebDriver driver;
	Location subscribe_btn;
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
	public void testcase002(){
        subscribe_btn.waitForLoginPageToLoad();
        Select oSelect = new Select(subscribe_btn.searchTextBox());
        List <WebElement> elementCount = oSelect.getOptions();
        //System.out.println(elementCount.size());
        int isize = elementCount.size();
        for(int i=0; i<isize; i++){
        String actualValue = elementCount.get(i).getText();
        System.out.println(actualValue);
        String expectedValue="Bangaluru";
        Assert.assertEquals(actualValue,expectedValue)
        }
        }
}
