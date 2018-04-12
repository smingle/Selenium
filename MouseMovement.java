import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseMovement 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.americangolf.co.uk/");
		
		
		WebElement golfclub = driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(golfclub).build().perform();
		WebDriverWait wait  = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"))));
		
		
		WebElement box = driver.findElement(By.xpath("//*[@id='CLUBS_1']"));
		List<WebElement> links = box.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Random r = new Random();
		int n= r.nextInt(links.size()); // 0 to links -1
		String text =links.get(n).getText();
		System.out.println(text);
		links.get(n).click();
		
	}

}
