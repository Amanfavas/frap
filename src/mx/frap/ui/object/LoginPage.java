package mx.frap.ui.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.
			visibilityOfAllElementsLocatedBy(By.id("subscribe_btn")));
	}
	public WebElement getLogin(){
		return driver.findElement(By.xpath("//*[@id='bs-example-navbar-collapse-1']/div/ul/li[1]/a"));
		 
	}
	public WebElement getUsernameTextbox()
	{
		WebElement element = 
				driver.findElement(By.id("exampleInputEmail"));
		return element;
	}
	public WebElement getPasswordTextbox()
	{
		return driver.findElement(By.id("exampleInputPassword13"));
	}
	public WebElement getLoginButton()
	{
		return driver.findElement(By.id("signsubmit"));
	}
	public WebElement getLoginSuccessMessage()
	{
		return driver.findElement(By.xpath
				("//div[contains(text(), 'Invalid login credentials')]"));
	}
	public WebElement getLoginErrorMessage()
	{
		return driver.findElement(By.xpath
				("//div[contains(text(), 'Invalid login credentials')]"));
	}
	public WebElement getTitle(){
		return driver.findElement(By.id("open_drop_hed"));
	}
	public WebElement getLoginErrorToastMessage(){
		return driver.findElement(By.className("toast-message"));
	}
}
