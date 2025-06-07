package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Linkedlistamdhasset extends Automate {
  static	WebDriver driver;
	public static  void Registration() {
		
		
	}

	public  void login() {
		
	driver=	 new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
 driver.get("http://localhost:8887/"); 
By byusername=	By.name("user_name");
WebElement CM	 =driver.findElement(byusername);
CM.sendKeys("admin");
By vc= By.name("user_password");
WebElement  zx =  driver.findElement(vc);
zx.sendKeys("321");


By be=	By.id("submitButton");
WebElement  ax=  driver.findElement(be);

ax.click();}
public void Droupdown() {
Actions act= new Actions(driver);

WebElement cc= driver.findElement(By.xpath("(//td[@class='homePageMatrixHdr'])[66]")); 
 
	
	WebElement drag= driver.findElement(By.xpath("//b[contains(text(),'Top Purchase Orders')]"));
	
	act.dragAndDrop(cc, drag).build().perform();
	
}
	
	public static void m12() {
		
		
	}
	//
	//



	//
	
	
	
	
		


}
