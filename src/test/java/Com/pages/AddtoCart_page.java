package Com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddtoCart_page {
	WebDriver driver;
	WebElement textbox;

	public void url() 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJars\\Chrome Driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://google.com");
	System.out.println(driver.getTitle());

	}
	public void demoblaze_homePage()
	{
		driver.get("https://demoblaze.com/index.html");
		System.out.println(driver.getTitle());
	}
	
	public void Select_product()
	{
		 driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a")).click();;
	
		
	}
	public void Add_cart() throws IOException
	{
	driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();;
		
		driver.switchTo().alert().accept();

	}
	
}
