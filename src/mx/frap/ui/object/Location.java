package mx.frap.ui.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Location{
   WebDriver driver;
	public Location(WebDriver driver)
	{
		this.driver = driver;
	}
	public void waitForLoginPageToLoad()
	{
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.
			visibilityOfAllElementsLocatedBy(By.id("subscribe_btn")));
	}
        public WebElement searchTextBox(){
           return driver.findElement(By.id("select2-city_id-container"));
        }
        public WebElement findButton(){
           return driver.findElement(By.id("find_location"));
        }
}
