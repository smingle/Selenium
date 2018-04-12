import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffAlart 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("somesuer");
		driver.findElement(By.name("proceed")).click();
		//wait till pop up alart appears
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert a1=driver.switchTo().alert(); // switch control to alart
		System.out.println(a1.getText());
		a1.accept();//Ok
		//a1.dismiss();//cancel
		driver.switchTo().defaultContent(); // switch back to main page
		

	}

}
