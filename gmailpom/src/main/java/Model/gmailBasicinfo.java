package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailBasicinfo extends gmailCreateAcountModel {

	public gmailBasicinfo(WebDriver u) {
		super(u);
		
	}
	public WebElement getMonth() throws InterruptedException{
		Thread.sleep(4000);
		WebElement m =driver.findElement(By.xpath("//select[@aria-labelledby='month-label']"));
		
        return m;
	}
	public WebElement getDay()  {
	 
		WebElement d =driver.findElement(By.xpath("//input[@name='day']"));
		
        return d;
	}
	
	public WebElement getYear()   {
      WebElement s1=driver.findElement(By.xpath("//input[@aria-label='Year']"));
	   return s1;
		}
	
	
	public WebElement getGender()   {
		WebElement s2=driver.findElement(By.xpath("//select[@aria-labelledby='gender-label']"));
	    return s2;
		
        
	}
	public WebElement getNextButton()   {
		WebElement s3=driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
	    return s3;
		
        
	}
	
	
	

}