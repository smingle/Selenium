import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Table1
{
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		int col = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
		int row = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
 		
		System.out.println("Total Col = "+col);
		System.out.println("Total row = "+row);
		
		String companyname = "HDFC Bank";
		List<WebElement> name = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		
		for(int i=0;i<name.size();i++)
		{
			if(companyname.equals(name.get(i).getText()))
				{
				System.out.println(name.get(i).getText()+"---------------"+price.get(i).getText());
				break;
				}
		}

	}

}
