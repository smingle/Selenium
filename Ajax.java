import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Ajax 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(5000);
		List<WebElement> count = driver.findElements(By.xpath("//ul[@role='listbox']/li"));		
		System.out.println(count.size());
		
		for (int i=0;i<count.size();i++)
		{
			System.out.println(count.get(i).getText());
		}
		
	}

}
