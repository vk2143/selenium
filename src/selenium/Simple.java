package selenium;

import java.awt.Dimension;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Simple {


	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new	ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://localhost:8887/");

		By vk=  By.name("user_name");
		WebElement rk=	driver.findElement(vk);
		rk.sendKeys("admin");

		WebElement password=	driver.findElement(By.name("user_password"));
		password.sendKeys("321");
		By  sum =By.id("submitButton");
		WebElement cm	=driver.findElement(sum);
		cm.click();


		driver.findElement(By.xpath("//a[text()='Calendar']")).click();

		System.out.println("exception occured in test case calenndare xparth");


		By  vio = By.xpath("(//td[@class='tabUnSelected'])[1]");
		WebElement	web=  driver.findElement(vio);
		web.click();

		String	 obj =driver.findElement(By.xpath("(//td[@align='center'])[2]")).getAttribute("align");
		System.out.println(obj);
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();



		WebElement seachfor =driver.findElement(By.xpath("//input[@style='width:120px']"));

		org.openqa.selenium.Dimension dim=seachfor.getSize();

		int l =dim.getHeight();
		int we  =dim.getWidth();
		System.out.println(l);
		System.out.println(we);



		WebElement leadno=	driver.findElement(By.xpath("//div[@id='basicsearchcolumns_real']/select"));

		org.openqa.selenium.Dimension	dc= leadno.getSize();
		int h=   dc.getHeight();
		int w=dc.getWidth();
		System.out.println(h);
		System.out.println(w);
		WebElement	xyz=  driver.findElement(By.xpath("(//a[@title='Leads'])"));
		String	innartex =xyz.getText();

		System.out.println(innartex);

		WebElement vishal=  driver.findElement(By.xpath("//input[@name='query_string']"));

		String cmo=	vishal.getAttribute("name"); 

		System.out.println(cmo);  

		WebElement choose=	driver.findElement(By.xpath("(//select[@id='bas_searchfield'])[1]"));

		Select sellsearch=	new Select(choose);
		sellsearch.selectByVisibleText("Last Name");
		Thread.sleep(5000);

		sellsearch.selectByVisibleText("Email");

		WebElement s1=	  sellsearch.getFirstSelectedOption();
		String cp2=s1.getText();
		System.out.println(cp2);
		WebElement vivek= driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		vivek.click();
		WebElement cp =  driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")); 



		String mky= cp.getAttribute("value");
		System.out.println(mky); 

		Actions   act= new Actions(driver);


		WebElement sendkeysactionclass= driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]"));

		act.sendKeys(sendkeysactionclass, "yadav").build().perform();


		WebElement t4b = driver.findElement(By.xpath("//input[@name='lastname']"));
		Thread.sleep(4000);
		t4b.clear();
		act.sendKeys(t4b, "tejash").build().perform();
		t4b.clear();
		Thread.sleep(5000);
		act.sendKeys(t4b, "vivk").build().perform();

		//driver.navigate().back();
System.out.println();


		driver.findElement(By.xpath("//img[@style='width:16px;height:16px']"));

		//WebElement myLeads= driver.findElement(By.xpath("//b[contains(text(),'My New Leads')]"));
		//Thread.sleep(4000);

		WebElement  top1organization=    driver.findElement(By.xpath(" //b[contains(text(), 'Top Organizations')]"));

		//act.clickAndHold(myLeads).moveToElement(top1organization) .release().build().perform();

		WebElement rightclickleads=  driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		Thread.sleep(3000);
		act.contextClick(rightclickleads).build().perform();
		Thread.sleep(2000);
		List<WebElement>  listvk= driver.findElements(By.xpath("//input"));

		int cv=  listvk.size();
		System.out.println(cv);


		driver.findElement(By.xpath("(//td[@align='center'])[2]")).click();
		// Array

		// when we are store then more then  one value we are use to array

		int[] a= {12,13,17,19};

		System.out.println(3);
		driver.navigate().forward();




	}


}
