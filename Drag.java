import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/draggable/");
		
		

		int s = driver.findElements(By.tagName("iframe")).size();
		System.out.println(s);
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.id("draggable"));
		
		Actions act= new Actions(driver);
		act.dragAndDropBy(e, 100, 100).build().perform();;
		driver.switchTo().defaultContent();
	}

}
