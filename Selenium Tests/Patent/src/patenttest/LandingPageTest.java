package patenttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LandingPageTest {

	
	//PROF-34 | Selenium Test Initiative
	//Launching automative testing using chrome
		
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
			//Landing Page test | Carousels
			
			
			
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[2]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[3]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[4]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[5]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[6]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[7]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[8]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//ol[@class='carousel-indicators']//li[9]")).click();
			
			Thread.sleep(1000);
			
			
			
			//PROF-28 | Write selenium tests
			//Landing Page Test | Dropdowns
			
			
			
			driver.findElement(By.xpath("//a[contains(text(),'Download Inventor Disclosure Form')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Learn More')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'FIU Patent Policy')]")).click();
			
			Thread.sleep(3000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Learn More')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'FIU Libraries')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Learn More')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'FIU IP Policy')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Learn More')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'USTPO IP Policy')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Learn More')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'US Copyright Office')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			
			
			
			
			
			driver.findElement(By.xpath("//div[contains(text(),'Fill Out Form')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@ui-sref='patent.search']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Fill Out Form')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[@ui-sref='patent.business']")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
		
			
		
			
			
			driver.findElement(By.xpath("//div[contains(text(),'Get Involved')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//a[contains(text(),'StartUp FIU')]")).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Get Involved')]")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//button[contains(text(),'Submit Inquiry Form')]")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[@aria-hidden='true']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[contains(text(),'Get Involved')]")).click();
			
			Thread.sleep(2000);
			
			driver.quit();
			
			
			
		}
}
