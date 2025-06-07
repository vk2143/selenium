package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hardwork {
	
	public static void main (String[]arjs)	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://Flipkart.com");
		
		 String cc=driver.findElement(By.xpath("//span[text()='Grocery']")).getTagName();
		 
		System.out.println(cc);
		driver.findElement(By.xpath("(//img[@src='https://static-assets-web.flixcart.com/www/linchpin/batman-returns/images/fk-default-image-75ff340b.png?q=90'])[1]")).click();
	}
	}


