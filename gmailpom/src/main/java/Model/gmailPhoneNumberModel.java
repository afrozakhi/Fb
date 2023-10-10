package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailPhoneNumberModel extends gmailPassWordModel {

	public gmailPhoneNumberModel(WebDriver u) {
		super(u);
		
	}
	public WebElement getPhoneNumber() throws InterruptedException    {
		 Thread.sleep(3000);
			WebElement s1=driver.findElement(By.xpath("//input[@jsname='YPqjbf']"));
		    return s1;
		}
	public WebElement getNext3()    {
		 
			WebElement s1=driver.findElement(By.xpath("//span[text()='Next']"));
		    return s1;
		}
	

}
