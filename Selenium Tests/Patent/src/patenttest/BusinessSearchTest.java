package patenttest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusinessSearchTest {

	
	//PROF-34 | Selenium Test Initiative
	//Launching automated testing using chrome
		
		public static void main(String[] args) throws InterruptedException 
		{
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
			//Going to Business search
			
			
			
			
			driver.findElement(By.xpath("//strong[contains(text(),'BUSINESS SEARCH')]")).click();
			
			Thread.sleep(2000);
		
			driver.findElement(By.id("txtTerm")).sendKeys("hotels");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='txtLocation']")).clear();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='txtLocation']")).sendKeys("Mumbai");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='confirm']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@id='txtLocation']")).clear();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@id='txtLocation']")).sendKeys("San Francisco");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			
			Thread.sleep(3500);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,250)", "");
			
			Thread.sleep(3500);
			
			driver.findElement(By.xpath("//td[contains(text(),'Hayes Valley Inn')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[contains(text(),'Save Selected')]")).click();
			
			Thread.sleep(1500);
			
			JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			
			jse1.executeScript("window.scrollBy(0,250)", "");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//body/div[@class='container']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='ng-scope']/div[@class='business-search-body ng-scope']/div[@class='ng-scope']/button[2]")).click();
			
			Thread.sleep(2000);
			
			driver.quit();
			
			
		}
}
