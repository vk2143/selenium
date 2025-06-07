package selenium;


import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {

	public static void main(String[] args) {
		 ChromeDriver  driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://Flipkart.com");
	WebElement we=	 driver.findElement(By.xpath("//input[@class='Pke_EE']"));
	we.sendKeys("phone");
	we.submit();
//	WebElement sear=	 driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//		 sear.sendKeys("phone");
//		 sear.submit();
////		 
//		List<WebElement> so= driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
//		
//		 ArrayList<WebElement> pk=	new ArrayList<WebElement>();
//		System.out.println(so.size());
//	for (int i=0;i<=so.size()-1;i++) {
//		WebElement texp=	so.get(i);
//	String tpo=	texp.getText();
//	System.out.println(tpo);
//		}
//	
		
}

}
