package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUpload {
	public static void fli() {
WebDriver	driver=	new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("http://localhost:8887/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");

WebElement password=	driver.findElement(By.name("user_password"));
password.sendKeys("321");
By  sum =By.id("submitButton");
WebElement cm	=driver.findElement(sum);
cm.click();

driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//img[@title='Import Leads']")).click();
driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\DELL\\Downloads\\Leads.csv");
	}

}
