import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExtractLink 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://edition.cnn.com/");
		
		 
		List<WebElement> Text = driver.findElements(By.xpath("//a"));
		System.out.println(Text.size());
		
		WebElement ninthlink = Text.get(9);
		System.out.println(ninthlink.getText());
		System.out.println(ninthlink.getLocation().x);
		System.out.println(ninthlink.getLocation().y);
		//ninthlink.click();
		
//		for(int i=0;i<Text.size();i++)
//		{
//			WebElement e = Text.get(i);
//			System.out.println(e.getText()+"----"+e.isDisplayed());
//		}
		
		for(WebElement e:Text)
			System.out.println(e.getText()+"----"+e.isDisplayed());
		
		
		//driver.quit();
		
		
		

	}

}
