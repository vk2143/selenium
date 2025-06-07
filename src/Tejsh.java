import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tejsh {

	public static void main(String[] args) {

		WebDriver	 driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8887/");
		JavascriptExecutor	 js=(JavascriptExecutor)driver;
		WebElement we1=	 driver.findElement(By.xpath("//input[@name='user_name']"));
		js.executeScript("arguments[0].value='admin';", we1);
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("321");
		WebElement cl=	driver.findElement(By.xpath("//input[@id='submitButton']"));
		js.executeScript("arguments[0] .click()",cl);
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();

		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		List<WebElement>  all=  driver.findElements(By.xpath("//td[@align='right']"));
		System.out.println(all.size());

		for(int i=0;i<=31;i++) {
			WebElement texprint=	all.get(i);
			String w= texprint.getText();
			System.out.println(w);
     WebElement getAttribut=      driver.findElement(By.xpath("//input[@name='lastname']"));
    String Attributvalue=  getAttribut.getAttribute("name");
    System.out.println(Attributvalue);
		}
	}

}
