import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrintAjax 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.get("https://yahoo.com");
		driver.findElement(By.xpath("//*[@id='uh-search-box']")).sendKeys("Help");
		
		String txt = driver.findElement(By.xpath("//*[@id='uh-search-box']")).getAttribute("value");
		System.out.println(txt);
		
		

	}

}
