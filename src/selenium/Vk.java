package selenium;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Vk  {

	public static void main(String[] args) throws IOException {
		WebDriver	 driver	=new EdgeDriver();
	driver.get("http://localhost:8887/");
	
	      
	
	
	
    WebElement element=   driver.findElement(By.name("user_name"));
    element.sendKeys("admin");
    
    
	By vc= By.name("user_password");
	WebElement  zx =  driver.findElement(vc);
	zx.sendKeys("321");


	By be=	By.id("submitButton");
	WebElement  ax=  driver.findElement(be);

	ax.click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/info.PNG']")).click();
	driver.findElement(By.xpath("//a[text()='Help']")).click();
Set<String>	 wi=driver.getWindowHandles();
 Iterator<String>it=  wi.iterator();
 
 
String fh= it.next();


 String shv=   it.next();

driver.switchTo().window(shv);
driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("vk");



driver.switchTo().window(fh);
 
 
	}

}
