package patenttest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PatentSearchTest {
	
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
			//Going to Patent search
			

			
			
			driver.findElement(By.xpath("//strong[contains(text(),'PATENT SEARCH')]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='form-inline']//input[@type='text']")).sendKeys("communication virtual machine");
			
			Thread.sleep(1500);
			
			Select uspto = new Select(driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/select")));
			
			uspto.selectByValue("string:USPTO V2");
			
			driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//button[@class='btn btn-default btn-sm']")).click();
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//input[@placeholder='Last name']")).sendKeys("Sadjadi");
			
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-search']")).click();
			
			Thread.sleep(2000);
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			
			jse.executeScript("window.scrollBy(0,250)", "");
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@href='http://patft.uspto.gov/netacgi/nph-Parser?Sect1=PTO1&Sect2=HITOFF&d=PALL&p=1&u=%2Fnetahtml%2FPTO%2Fsrchnum.htm&r=1&f=G&l=50&s1=8578325.PN.&OS=PN/8578325&RS=PN/8578325']//i[@class='glyphicon glyphicon-book']")).click();
			
			Thread.sleep(3000);
			
			driver.close();
			
			Thread.sleep(2000);
			
			driver.quit();
			
		}

}
