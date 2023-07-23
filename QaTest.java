package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Assert;

public class QaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\athir\\OneDrive\\Desktop\\Selenium\\Chromedriver114.0.5735.199\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
	    driver.manage().window().maximize();
	    String expected="hashtag-ca.com/careers/apply?jobCode=QAE001";
	    String actual =driver.getTitle();
	    if(expected.contentEquals(actual))
	    {
	    	System.out.println("Title verification is passed");
	    	
	    
	    }
	    else 
	    {
	    	
	    	System.out.println("Title verification is failed");


	    }
         Thread.sleep(4000);
         WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
	     Thread.sleep(1000);
         name.sendKeys("Athira");	
         
         WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
	     Thread.sleep(1000);
         email.sendKeys("Athira@gmail.com");	
         
         WebElement phone = driver.findElement(By.xpath("//input[@name='phone']"));
	     Thread.sleep(1000);
         phone.sendKeys("000908786");
         
         new Actions(driver)
         .scrollByAmount(0, 200)
         .perform();
         
         WebElement describe = driver.findElement(By.xpath("//textarea[@name='description']"));
	     Thread.sleep(1000);
         describe.sendKeys("eager to grow");
	     Thread.sleep(1000);
	    
	     
	     WebElement resume = driver.findElement(By.xpath("//input[@name='resume']"));

	     resume.sendKeys("C:/Users/athir/OneDrive/Documents/RESUMEATHIRA.pdf");
         
         new Actions(driver)
         .scrollByAmount(0, 200)
         .perform();
         
         driver.findElement(By.xpath("//button[text()='APPLY NOW']")).click();
	     Thread.sleep(4000);

	     
	     
	     
	     String t = "Thank you for your interest";

	     List<WebElement> l= driver.findElements(By.xpath("//*[contains(text(),'Thank you for yo')]"));
	      // verify list size
	      if ( l.size() > 0){
	         System.out.println("Text: " + t + " is present. ");
	      } else {
	         System.out.println("Text: " + t + " is not present. ");
	      }
		     Thread.sleep(4000);

         
	      String t1 = "We will get back to you soon.";

		    List<WebElement> l1= driver.findElements(By.xpath("//*[contains(text(),'We will get back to')]"));
		      // verify list size
		     if ( l1.size() > 0){
		         System.out.println("Text: " + t1 + " is present. ");
		     } else {
		         System.out.println("Text: " + t1 + " is not present. ");
		     }
		     
		     Thread.sleep(4000);

		    String t2 = "Hashtag Systems Inc, an international Software development and outsourcing company with its headquarters in Sunnyvale, California and development centers in California & Kochi.";

			 List<WebElement> l2= driver.findElements(By.xpath("//*[contains(text(),'Hashtag Systems Inc, an international Software development and ')]"));
			      // verify list size
			    if ( l2.size() > 0){
			         System.out.println("Text: " + t2 + " is present. ");
			     } else {
			         System.out.println("Text: " + t2 + " is not present. ");
			     }
		      
			     Thread.sleep(4000);
			     
			     
			     
			  String t3 = "Copyright © 2021 Hashtag Systems Inc. All Rights Reserved.";

		        List<WebElement> l3= driver.findElements(By.xpath("//*[contains(text(),'Copyright © 2021 Hashtag Systems In')]"));
				      // verify list size
				  if ( l3.size() > 0){
				         System.out.println("Text: " + t3 + " is present. ");
				  } else {
				         System.out.println("Text: " + t3 + " is not present. ");
				  }
			      
				     Thread.sleep(4000);    


	     driver.findElement(By.xpath("//a[@href='/services']")).click();


	     Thread.sleep(4000);


	     driver.findElement(By.xpath("//a[@href='/shopify-experts']")).click();
	     Thread.sleep(4000);


	     driver.findElement(By.xpath("//a[@href='/blogs']")).click();
	     
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@href='/careers']")).click();
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@href='/casestudies']")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//a[@href='/about-us']")).click();	     
	     Thread.sleep(4000);
	     driver.findElement(By.xpath("//a[@href='/contact-us']")).click();	  
	     Thread.sleep(1000);
	         
	     List<WebElement> I=driver.findElements(By.tagName("a"));
	     System.out.println("total no of links = " +I.size());



	}

}
