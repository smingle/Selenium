import java.util.List;

import org.apache.http.client.fluent.Request;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class ExtractLinkFromArea1
{
	static WebDriver driver;
	public static void main(String[] args) throws Exception 
	{
		driver = new FirefoxDriver();
		driver.get("https://edition.cnn.com/");
		
		String part1 = "//*[@id='intl_homepage1-zone-1']/div[2]/div/div[3]/ul/li[";
		String part2 = "]/article/div/div/h3/a/span[1]";
		
		int i=2;
		while (isElementPresent(part1+i+part2, "xpath"))
		{
		String txt = driver.findElement(By.xpath(part1+i+part2)).getText();
		System.out.println(txt);
		String url = driver.findElement(By.xpath(part1+i+part2)).getAttribute("href");
		System.out.println(url);
		//driver.findElement(By.xpath(part1+i+part2)).click();
		//driver.navigate().to("https://edition.cnn.com/");
		i++;
		}
		
				

	}
	
	public static boolean isElementPresent(String locator, String locaterType)
	{
		List<WebElement> alllink=null;
		if(locaterType.equals("xpath"))
			alllink= driver.findElements(By.xpath(locator));
		else if (locaterType.equals("cssSelector"))
			alllink= driver.findElements(By.xpath(locator));
		
		if(alllink.size()==0)
			return false;
		else 
		return true;
		
		
	}
	
	public static boolean getResponseCode(String url)
	{
		int resp_code=0;
		try
		{
			resp_code=Request.Get(url).execute().returnResponse().getStatusLine().getStatusCode();
			System.out.println(resp_code);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		if(resp_code==200)
			return true;
		else 
			return false;
		
	}

}
