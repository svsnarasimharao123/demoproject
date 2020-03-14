package Com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Excelutility.Excel;

public class Login_page 
{
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
		public void userclick()
		{
			driver.findElement(By.id("login2")).click();
			
		}
		public void usernamepassword(int a) throws IOException
		{
			Excel ex=new Excel();
			driver.findElement(By.xpath("//*[@id=\"loginusername\"]")).sendKeys(ex.excel_username(a));
			driver.findElement(By.xpath("//*[@id=\"loginpassword\"]")).sendKeys(ex.excel_password(a));
			WebElement d=driver.findElement(By.xpath("//*[@id=\"logInModal\"]//div//div//div[3]//button[2]"));
		
			d.click();
			driver.close();
						
		}	
		

		
}


