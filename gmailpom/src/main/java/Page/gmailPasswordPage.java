package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailPassWordModel;

public class gmailPasswordPage extends gmailPassWordModel {

	public gmailPasswordPage(WebDriver k) {
		super(k);
	
	}
	public void typePassWord(String j) throws InterruptedException  {
		WebElement t1= getPassword() ;
           t1.sendKeys(j);		
	}
	public void typeConfirmPassWord(String l)   {
		WebElement t1= getConfirmPassword() ;
           t1.sendKeys(l);		
	}
	public void typeNext2()   {
		WebElement t3= getNext2() ;
           t3.click();		
	}

}
