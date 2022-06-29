package VariousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
	public void init() {
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void LocateElements() throws InterruptedException {
		
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		//driver.navigate().back();
		//driver.findElement(By.partialLinkText("TF-API Product")).click();
		
		
		//CSS
		driver.findElement(By.cssSelector("input#tool-2")).click();
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("is fun");
		driver.findElement(By.cssSelector("input[name='exp'][id='exp-5']")).click();
		
		//XPath
		//absolute
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[13]/input")).sendKeys("I hate absolute xpath");
		
		
		//relative
		driver.findElement(By.xpath("//input[@id='profession-1']")).click();
		
		driver.findElement(By.xpath("//input[@name='profession' and @id='profession-0']")).click();
		
		driver.findElement(By.xpath("//a[text()='API Documentations']")).click();
	//	driver.findElement(By.xpath("//a[contains(text(),'API Documentations')]")).click();
		
		
//*[@id="exp-6"] adjust it to //input[@id='exp-6'] (WHY WE DONT COPY XPATH)
//		driver.findElement(By.xpath("//*[@id=\"exp-6\"]")).click();
		
		
		
	}
	
//	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
