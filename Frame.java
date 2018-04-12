import java.util.concurrent.TimeUnit;

import org.bouncycastle.jce.exception.ExtCertificateEncodingException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frame 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://paytm.com");
		
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		int total = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total Frames Are : " +total);
		
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("input_0")).sendKeys("somesuer");
//		driver.switchTo().defaultContent();
		
		for (int i=0;i<total; i++)
		{
			driver.switchTo().frame(i);
			int s=driver.findElements(By.id("input_0")).size();
			System.out.println("Size : " +s);
			
			if(s==0)
				driver.switchTo().defaultContent();
			else // found frame
				break;
			
		}
		//interact
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("username"))));
		driver.findElement(By.name("username")).sendKeys("somesuer");
		driver.switchTo().defaultContent();
	}

}
