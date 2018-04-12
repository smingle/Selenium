import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffLogin 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.get("https://portfolio.rediff.com/portfolio-login");
		
		driver.findElement(By.xpath("//*[@id='useremail']")).sendKeys("smingle@rediffmail.com");
		driver.findElement(By.xpath("//*[@id='emailsubmit']")).click();
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='userpass']"))));
		driver.findElement(By.xpath("//*[@id='userpass']")).sendKeys("Test1234");
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
		
		
	}

}
