package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailPhoneNumberModel;

public class gmailPhoneNumberPage extends gmailPhoneNumberModel {

	public gmailPhoneNumberPage(WebDriver u) {
		super(u);
	
	}
	public void typePhoneNumber(String j) throws InterruptedException  {
		WebElement t1= getPhoneNumber() ;
           t1.sendKeys(j);		
	}
	public void typeNext3()  {
		WebElement t1= getNext3() ;
           t1.click();		
	}


}
