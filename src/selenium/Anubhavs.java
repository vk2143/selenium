package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anubhavs {
	
	
	
		public static void main(String[] args) {
			
	
			
	WebDriver	driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http:localhost:8887/");
	WebElement username=	 driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("321");
		
	WebElement cc=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		cc.click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		
	List<WebElement>	gettext=  driver.findElements(By.xpath("//a"));
	int numberofgettext=	gettext.size();
		System.out.println(numberofgettext);
		int blankcount=0;
		int nowblankcountnumber=0;
		
		for(int i=0;i<=207;i++) {
			WebElement counttag=	gettext.get(i);
		String linktext=	counttag.getText();
		
		if(linktext.equals("")==true) {
			nowblankcountnumber= blankcount+1;
			                  
		}else{
			
		}
		
		
		
			System.out.println(linktext);
			
			
			
		}
		
		System.out.println(nowblankcountnumber);
	
	System.out.println(blankcount);
		
	   List<WebElement> checkboxs=  driver.findElements(By.xpath("//input[@name='selected_id']"));
	 int allcheckbox=  checkboxs.size();
	   for(int i=0;i<=allcheckbox-1;i++){
		   checkboxs.get(i).click();
		   
			
	   }
		}
		   
	   
	
	

}
