package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailUserNameModel extends gmailBasicinfo {

	public gmailUserNameModel(WebDriver u) {
		super(u);
	
	}
	public WebElement getUserName() throws InterruptedException   {
		Thread.sleep(3000);
		WebElement s1=driver.findElement(By.xpath("//input[@name='Username']"));
	    return s1;
	}
	public WebElement getNext1(){

		WebElement s2 =driver.findElement(By.xpath("//span[text()='Next']"));
        return s2;
	}
        

}
