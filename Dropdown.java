import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		
		WebElement dropDown=driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		Select s= new Select(dropDown);
		
		s.selectByVisibleText("Handmade");
		
		List <WebElement> options = s.getOptions();
		System.out.println("Total Elements "+options.size());
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		
		System.out.println("Currently Selected -  " +s.getFirstSelectedOption().getText());
		
	}

}
