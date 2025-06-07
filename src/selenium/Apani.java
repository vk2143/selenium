package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apani {
	public static void main(String[] args) throws InterruptedException {
		ma();
		String co="expqwertyiuytreqwertybvsceartviewg";
		for(int i=0;i<=co.length()-1;i++) {
			char xx= 	co.charAt(i);
			System.out.println(xx);}
		WebDriver	driver=ma();


		WebElement cc=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		cc.click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[1]")).click();
		WebElement productbuttionclick=		driver.findElement(By.xpath("//table[@class='hdrTabBg']/tbody/tr/td[2]/table/tbody/tr/td[12]/a"));

		productbuttionclick.click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//table[@class='small homePageButtons']//img[@onmouseout='fnRemoveWindow();']")).click();
	}

	public static 	WebDriver ma(){



		WebDriver	driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http:localhost:8887/");
		WebElement username=	 driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("321");
		WebElement geatt=	driver.findElement(By.xpath("//input[@name='user_password']"));
		String xc=	geatt.getAttribute("value");
		System.out.println(xc);
		return driver;
	}
}
