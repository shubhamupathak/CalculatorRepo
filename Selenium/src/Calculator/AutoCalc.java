package Calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class AutoCalc {
	
	@Test
	public void calculate() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","F:\\B21\\Drivers\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(" https://www.calculator.net/ ");
		Thread.sleep(2000);
		
//		Multiplication of n1 and n2
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("423");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'×')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("525");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
//		Division of n1 and n2
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("4000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'/')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("200");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
//		Addition of n1 and n2
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("-234234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'+')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("345345");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
//		Substraction of n1 ad n2
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("234823");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'-')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'(')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='sciOutPut']")).sendKeys("23094823");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'±']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),')')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'=')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'AC')]")).click();
		
	}

}
