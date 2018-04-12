import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MultipleWindows
{

	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		
		Set<String> winId =  driver.getWindowHandles();
		System.out.println("Total Window" +winId.size());
		
		Iterator <String> it = winId.iterator();
		System.out.println(it.next());
		
		driver.get("http://naukri.com");
		
		System.out.println("-----------------------------");
		
		winId = driver.getWindowHandles();
		System.out.println("Total Window" +winId.size());
		
		it=winId.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		String mainwindow = it.next();
		String firstpopup = it.next();
		String secondpopup = it.next();
		
		System.out.println(mainwindow);
		System.out.println(firstpopup);
		System.out.println(secondpopup);
		
		driver.switchTo().window(firstpopup);
		driver.close();
		driver.switchTo().window(secondpopup);
		driver.close();
		
		driver.switchTo().window(mainwindow);
		//or 
		driver.switchTo().defaultContent();
		
		
	}

}
