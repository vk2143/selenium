package selenium;

import java.awt.color.CMMException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://localhost:8887/"); 
		By byusername=	By.name("user_name");
		WebElement CM	 =driver.findElement(byusername);
		CM.sendKeys("admin");
		By vc= By.name("user_password");
		WebElement  zx =  driver.findElement(vc);
		zx.sendKeys("321");


		By be=	By.id("submitButton");
		WebElement  ax=  driver.findElement(be);

		ax.click();
		
		
	  //WebElement	 vk= driver.findElement(By.xpath("  (//a[text()='Organizations'])[1] "));
	//	vk.click(); 
	//String qq=	driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).getText();
	// System.out.println(qq);
		

		By vivek=  By.linkText("Leads");
		WebElement rahul= driver.findElement(vivek);
		rahul.click();


		By creatleadbuttion=  By.xpath("//img[@title='Create Lead...']");
	WebElement ram= driver.findElement(creatleadbuttion);
	ram.click();
Thread.sleep(3000);
	WebElement a1= driver.findElement( By.xpath("//input[@name='firstname']"));
	a1.sendKeys("ram_jii");


		WebElement b1= driver.findElement(By.xpath("//input[@name='lastname']"));
		b1.sendKeys("yadav");
		
	Point	p =b1.getLocation();
  int lastnamex  = p.getX();
  int lastnamey   =   p.getY();
  System.out.println("x-"+lastnamex);
  System.out.println("y-"+lastnamex);
		WebElement c1= driver.findElement(By.xpath("//input[@name='company']"));
	c1.sendKeys("vh life science pvt let");


	WebElement c2= driver.findElement(By.xpath("//input[@id='designation']"));
		c2.sendKeys("indian");


	WebElement c3= driver.findElement(By.xpath("//select[@name='leadsource']"));
	c3.sendKeys("other");


WebElement   c4  = driver.findElement(By.xpath("//select[@name='industry']"));
	c4.sendKeys("banking");


		WebElement   c5 = driver.findElement(By.xpath("//input[@name='annualrevenue']"));
		c5.sendKeys("2000");


	WebElement   c7 = driver.findElement(By.xpath("//input[@id='noofemployees']"));
	c7.clear();
	c7.sendKeys("7");


		WebElement   c8 = driver.findElement(By.xpath("//input[@id='secondaryemail']"));
		c8.sendKeys("vy@gmail.com");



	WebElement   c9 = driver.findElement(By.xpath("//input[@id='phone']"));
	c9.sendKeys("3456");

	WebElement   moblie = driver.findElement(By.xpath("//input[@id='mobile']"));
	moblie.sendKeys("Readmi");

		WebElement   fax = driver.findElement(By.xpath("//input[@id='fax']"));
		fax.sendKeys("xyz");


	WebElement   email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("vwe@emial.com");

		WebElement a11=driver.findElement(By.xpath("//input[@name='website']"));
		a11.sendKeys("hardwere");


	WebElement  cd	=driver.findElement(By.xpath("//textarea[@name='lane']"));
	cd.sendKeys("ramnagar");



		By aman =By.xpath("//input[@id='code']");
		WebElement cmda    =      driver.findElement(aman);

		cmda.sendKeys("221406");


		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("india");
			
		WebElement viek =  driver.findElement(By.xpath("//input[@id='pobox']")) ;
		viek.clear();
	viek.sendKeys("vv2121");


	WebElement city =  driver.findElement(By.xpath("//input[@id='city']")) ;
	city.clear();
		city.sendKeys("banaras");
	WebElement state =  driver.findElement(By.xpath("//input[@id='state']")) ;
    state.clear();
		state.sendKeys("up");

	WebElement stte =  driver.findElement(By.xpath("//textarea[@cols='90']")) ;
		stte.clear();
		stte.sendKeys("up");

		WebElement save =  driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])")) ;

		save.click();
		
	
	WebElement ave =  driver.findElement(By.xpath("//input[@title='Edit [Alt+E]']")) ;

	  String zz=          ave.getAttribute("value");
	System.out.println(zz);
	
	boolean editButtion = ave.isEnabled();
		System.out.println( editButtion );
		
  boolean   mkbuttion=           ave.isDisplayed();
		System.out.println(mkbuttion);
		
	
	
		
		WebElement	 vk= driver.findElement(By.xpath(" // img[@title='Leads Settings']"));
			vk.click(); 
		
	String cm=	  driver.findElement(By.xpath("(//td[@class='settingsTabList'] [1])")).getText();  
   System.out.println(cm);


 //String     rk=    driver.findElement(By.xpath("(//a[text()='Layout Editor']")).getAttribute("class");    
 //System.out.println(rk);//

//
//
	}
}
		

					
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

