import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Rediffexample
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("Hello");
		String text = driver.findElement(By.id("login1")).getText();
		System.out.println(text);
		
		text = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(text);
		
		text = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input")).getAttribute("value");
		System.out.println(text);
	}

}
