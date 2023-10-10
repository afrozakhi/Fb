package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailEnterCodeModel extends gmailPhoneNumberModel {

	public gmailEnterCodeModel(WebDriver u) {
		super(u);
	
	}
	public WebElement getEnterCode() throws InterruptedException    {
		 Thread.sleep(3000);
			WebElement s1=driver.findElement(By.xpath("//span[text()='Enter the code']"));
		    return s1;
		}

	
	

}
