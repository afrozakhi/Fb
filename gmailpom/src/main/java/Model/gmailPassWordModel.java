package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailPassWordModel extends gmailUserNameModel {

	public gmailPassWordModel(WebDriver u) {
		super(u);
	
	}
	public WebElement getPassword() throws InterruptedException    {
	 Thread.sleep(3000);
		WebElement s1=driver.findElement(By.xpath("//input[@name='Passwd']"));
	    return s1;
	}
	public WebElement getConfirmPassword()    {
		 
			WebElement s2=driver.findElement(By.xpath("//input[@aria-label='Confirm']"));
		    return s2;
		}
	public WebElement getNext2()    {
		 
		WebElement s3=driver.findElement(By.xpath("//span[text()='Next']"));
	    return s3;
	}


}
