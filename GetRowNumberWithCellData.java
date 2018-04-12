import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetRowNumberWithCellData
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		int rNum = getRowNumWithCellData("Tata Steel");	
		System.out.println(rNum);
		String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rNum+"]/td[4]")).getText();
		System.out.println(price);
	}

	private static int getRowNumWithCellData(String data) 
	{
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		
		for (int rNum=0;rNum<rows.size();rNum++)
		{
			WebElement row= rows.get(rNum);
			List<WebElement> cells = row.findElements(By.xpath("td"));
			for (int cNum=0; cNum<cells.size();cNum++)
			{
				String celldata=cells.get(cNum).getText();
				if(celldata.equals(data))
					return ++rNum;
			}
		}
		return -1;
	}

}
