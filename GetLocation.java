import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		int x = driver.findElement(By.name("q")).getLocation().x;
		int y = driver.findElement(By.name("q")).getLocation().y;
		System.out.println(x +"------"+y);
		driver.findElement(By.name("q")).sendKeys("Selenium");

	}

}
