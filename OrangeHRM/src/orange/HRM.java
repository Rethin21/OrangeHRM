package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HRM {
public WebDriver driver;

@BeforeTest
	public  void launchbrowser() throws InterruptedException{
			
	System.out.println("Launch browser");
	System.setProperty("webdriver.gecko.driver","C:\\Users\\RETHIN SINGH\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("http://localhost/OrangeHRM/orangehrm-5.5/web/index.php/auth/login");
	Thread.sleep(1000);
}



@Test
public void  loginandAddemployee()throws InterruptedException{
	
	System.out.println("login");
	
	driver.findElement(By.name("username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("Rethin@2102");
	driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	Thread.sleep(1000);

	System.out.println("PIM");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	Thread.sleep(1000);
	
	System.out.println("Add Employee");
	
	driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.name("firstName")).sendKeys("Rethin");
	Thread.sleep(2000);
	driver.findElement(By.name("middleName")).sendKeys("Singh");
	driver.findElement(By.name("lastName")).sendKeys("K");
	driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	Thread.sleep(3000);
}


@AfterTest
public void quit() throws InterruptedException {
	
	System.out.println("close browser");
	
	driver.quit();
}

}