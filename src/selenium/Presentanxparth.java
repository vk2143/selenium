package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Presentanxparth {

	public static void main(String[] args) throws InterruptedException {
		
		
WebDriver	driver=	new ChromeDriver();

driver.get("http://localhost:8887/");
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("321");
driver.findElement(By.xpath("//input[@id='submitButton']")).click();
  WebElement clickactionclass=   driver.findElement(By.xpath("(//div[@id='stuff_10']/table/tbody/tr/td[1])[3]"));
     Actions  act=  new Actions(driver);
act.click(clickactionclass).perform();
		
Thread.sleep(5000);
   WebElement   hoclic=     driver.findElement(By.xpath("//tbody//tr//td[@class='tabSelected']"));
act.click(hoclic).build().perform();
Thread.sleep(3000);
 WebElement leadclick= driver.findElement(By.xpath("//body[@class='small']/a"));
act.click(leadclick).build().perform();

 WebElement lead =     driver.findElement(By.xpath("(//a[text()='Leads'])[1]"));
       
      
      lead.click();
driver.findElement(By.xpath("//img[@alt='Create Lead...']")).click();

driver.navigate().refresh();
  WebElement cc= driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[3]"));
  driver.navigate().refresh();
  




	}

	
		
	
}
