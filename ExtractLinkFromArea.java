import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractLinkFromArea
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://edition.cnn.com/");
		
		WebElement Box=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]")); 
		List<WebElement> link = Box.findElements(By.tagName("a"));
		
		for(int i=0;i<link.size();i++)
		{
			WebElement e = link.get(i);
			System.out.println(e.getText());
			link.get(i).click();
			System.out.println(driver.getTitle());
			
			driver.get("https://edition.cnn.com/");
			Box=driver.findElement(By.xpath("//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]"));
			link = Box.findElements(By.tagName("a"));
			System.out.println("------------------------------------------------");
		}
		

		
		
	
		

	}

}
