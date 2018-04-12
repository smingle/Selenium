import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesAddDel
{

	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://bbc.com");
		
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		Iterator<Cookie> it = cookies.iterator();
		
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"------------"+c.getValue());
			
			if(c.getName().equals("ckns_policy"))
			{
				driver.manage().deleteCookie(c);
				Cookie mycookies= new Cookie("ckns_policy","222");
				driver.manage().addCookie(mycookies);
			}
			
		}
		
		System.out.println("------------------------------------------------");
		
		cookies = driver.manage().getCookies();
		
		it = cookies.iterator();
		
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"------------"+c.getValue());
			
			if(c.getName().equals("ckns_policy"))
			{
				driver.manage().deleteCookie(c);
			}
			
		}
		
		
		
		

	}

}
