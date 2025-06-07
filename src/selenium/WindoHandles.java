package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindoHandles {

	public static void main(String[] args) {
	WebDriver	driver= new ChromeDriver();
String zz=	driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
	driver.get("http://localhost:8887/");
	WebElement dk=	driver.findElement(By.xpath("//input[@name='user_name']"));
	dk.sendKeys("admin");
WebElement sendkerpassword=	driver.findElement(By.xpath("//input[@name='user_password']"));
		sendkerpassword.sendKeys("321");
driver.findElement(By.xpath("//input[@id='submitButton']")).click();
 Actions act =new Actions(driver);
 WebElement movetohelp=driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']"));
act.moveToElement(movetohelp).click().build().perform();

 WebElement hc=   driver.findElement(By.xpath("//a[@href='http://wiki.vtiger.com/index.php/Main_Page']"));
act.click(hc).build().perform();
 
 act.moveToElement(movetohelp).click().build().perform();
 WebElement anu=  driver.findElement(By.xpath("//a[text()='Feedback']"));
 act.click(anu).build().perform();

 Set<String> cc=  driver.getWindowHandles();
 
 for(String vk:cc) {
	 driver.switchTo().window(vk);
	String it= driver.getTitle();
	
if(it.equalsIgnoreCase("Vtiger CRM - vtiger")) {
break;
}
		
	}
 
 
 
 
 
 
driver.findElement(By.xpath("//input[@name='search']")) .sendKeys("vitiger");
 

cc=  driver.getWindowHandles();

for(String vk:cc) {
	 driver.switchTo().window(vk);
	String it= driver.getTitle();
	
if(it.equalsIgnoreCase("")) {
break;
}
		
	}

 driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("vitigr");
 
 driver.switchTo().window(zz);
	}
	
	

}
