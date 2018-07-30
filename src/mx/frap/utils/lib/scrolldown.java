package mx.frap.utils.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Scrolldown{
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,1000)");
}

