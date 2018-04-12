import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new FirefoxDriver();
		driver.get("https://tutorialehtml.com/en/html-tutorial-radio-buttons/");
		
		List<WebElement> allradio =  driver.findElements(By.name("citizenship"));
		System.out.println("Total Radio Buttons Are " +allradio.size());
		allradio.get(0).click();
		System.out.println(allradio.get(0).getAttribute("selected"));
		System.out.println(allradio.get(1).getAttribute("selected"));
		System.out.println(allradio.get(2).getAttribute("selected"));
		takeScreenShot();
	}
	public static void takeScreenShot()
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"//123.jpg"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
