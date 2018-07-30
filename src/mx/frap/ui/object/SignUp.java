package mx.frap.ui.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SignUp {
	WebDriver driver;
	public SignUp(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.
			visibilityOfAllElementsLocatedBy(By.id("subscribe_btn")));
	}
	public WebElement getSignUpLink(){
		return driver.findElement(By.linkText("Sign Up"));
	}
	public WebElement getFirstName(){
		return driver.findElement(By.xpath("//*[@id='sign_up']/div[1]/div/input"));
	}
	public WebElement getLastName(){
		return driver.findElement(By.xpath("//*[@id='sign_up']/div[2]/div/input"));
	}
	public WebElement getEmail(){
		return driver.findElement(By.xpath("//*[@id='exampleInputEmail']"));
	}
	public WebElement getPassword(){
		return driver.findElement(By.xpath("//*[@id='password']"));
	}
	public WebElement setCountry() {
		return driver.findElement(By.id("phone"));
	}
        public WebElement setGenderFemale(){
               return driver.findElement(By.className("label_radio.r_on"));
        }
        public WebElement setGenderMale(){
               return driver.findElement(By.className("label_radio.r_on"));
        }
         public WebElement setDOB(){
               return driver.findElement(By.id("dob"));
        }
        public WebElement getSingUpButton(){
             return driver.findElement(By.id("signupsubmit"));
        }
        public WebElement getSignUpSuccessMessage(){
            return driver.findElement(By.className("toast-message"));
        }
}
