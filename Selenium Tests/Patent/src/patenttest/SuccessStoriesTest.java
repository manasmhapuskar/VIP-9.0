package patenttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuccessStoriesTest {

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		//PROF-34 | Selenium Test Initiative
		//Launching automative testing using chrome
		
		
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver", projectLocation+"/lib/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:3000/#/");
		
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@ui-sref='patent.home']")).click();
		
		Thread.sleep(3000);
		
		//PROF-28 | Write selenium tests
		//Going in Success stories tab
				
				
				
		driver.findElement(By.xpath("//strong[contains(text(),'SUCCESS STORIES')]")).click();
				
		Thread.sleep(3000);
				
		driver.findElement(By.xpath("//input[@placeholder='Search Patents']")).sendKeys("ranu");
				
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//button[contains(text(),'Submit Stories')]")).click();
		
		Thread.sleep(2500);
		
		driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}
}
