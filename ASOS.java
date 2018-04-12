import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ASOS {

	public static void main(String[] args)  {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("disable-extensions");
		//options.addArguments("disable-infobars");
		
		WebDriverWait wait = new WebDriverWait(driver, 120);
		
		driver.get("http://Shop.demoqa.com");
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//*[@id='menu-item-2213']/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(women).build().perform();
		driver.findElement(By.linkText("Jackets")).click();
		
		Select s1 = new Select(driver.findElement(By.name("filter_color")));
		
		s1.selectByVisibleText("Black");
		WebDriverWait Wait = new WebDriverWait(driver,220);
	
		Select s2 = new Select(driver.findElement(By.className("orderby")));
		s2.selectByValue("date");
		WebElement PriceBar = driver.findElement(By.xpath("//span[@style='left: 100%;']"));
		Actions action1 = new Actions(driver);
		action1.clickAndHold(PriceBar).moveByOffset((int) -207, 0).release(PriceBar).build().perform();
		driver.findElement(By.xpath("//*[@id='woocommerce_price_filter-1']/form/div/div[2]/button")).click();
		
	//List <WebElement>	string1 = driver.findElements(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div/div/div[2]/span/ins/span"));
		
	//List <String> cost = new ArrayList<String>(); 	
	
		//for(WebElement E : string1)
		//{
			
		//	cost.add(E.getText().indexOf(0, 1));
			
		//}
		//System.out.println(cost.);
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div[2]/div[1]/div/div[2]/div/h3/a")).click();
		
		driver.findElement(By.xpath("//*[@id='product-2004']/div[1]/div[2]/form/button")).click();
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id='noo-site']/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/div/a")).click();
		
		driver.findElement(By.id("billing_first_name")).sendKeys("Anant");
		driver.findElement(By.id("billing_last_name")).sendKeys("Wankhade");
		driver.findElement(By.id("billing_company")).sendKeys("Cognizant");
		driver.findElement(By.id("billing_email")).sendKeys("ananta.mw@gmail.com");
		driver.findElement(By.id("billing_phone")).sendKeys("9860017702");
		//driver.findElement(By.id("select2-drop-mask")).click();	
		
		
		//Select S3 = new Select (driver.findElement(By.id("s2id_autogen1_search")));
		//S3.selectByVisibleText("India");
		
		driver.findElement(By.id("billing_address_1")).sendKeys("Dhanori road");
		driver.findElement(By.id("billing_address_2")).sendKeys("Kukreja heritage");
		driver.findElement(By.id("billing_city")).sendKeys("Pune");
		
		Select S4 = new Select (driver.findElement(By.xpath("//*[@id='s2id_autogen2_search']")));
		S4.selectByVisibleText("Maharashtra");
		driver.findElement(By.id("billing_postcode")).sendKeys("411015");
		
		driver.findElement(By.xpath("//*[@id='order_comments']")).sendKeys("Please send order");
		driver.findElement(By.id("payment_method_cod")).click();
		driver.findElement(By.id("place_order")).click();
		
		
		
	}
}


