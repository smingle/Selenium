import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragaAndDrop 
{

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		int s = driver.findElements(By.tagName("iframe")).size();
		System.out.println(s);
		driver.switchTo().frame(0);
		
		WebElement src  = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions act  =new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
		driver.switchTo().defaultContent();
		
		
	}

}
