package Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class gmailCreateAcountModel  extends gmailBaseModel {
	public gmailCreateAcountModel(WebDriver u) {
		super(u);

	}
	public WebElement getFirstName()  {
		//Thread.sleep(4000);
		WebElement s =driver.findElement(By.xpath("//input[@name='firstName']"));
        return s;
	}
	public WebElement getLastName(){

		WebElement s1 =driver.findElement(By.xpath("//input[@name='lastName']"));
        return s1;
	}
	public WebElement getNext(){

		WebElement s2 =driver.findElement(By.xpath("//span[@jsname='V67aGc']"));
        return s2;
	}


}
