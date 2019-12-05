package testdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Online_Shopping {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\A08019DIRP_C2C.02.02\\Downloads\\chromedriver_win32.zip");
		WebDriver drivers=new ChromeDriver();
		drivers.get("http://newtours.demoaut.com/");
		drivers.findElement(By.name("userName")).sendKeys("mercury");
		  drivers.findElement(By.name("password")).sendKeys("mercury");
		  drivers.findElement(By.xpath("//input[@value='Login']")).click();
		
	}

}
