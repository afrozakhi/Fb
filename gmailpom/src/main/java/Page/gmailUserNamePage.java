package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailUserNameModel;

public class gmailUserNamePage extends gmailUserNameModel {

	public gmailUserNamePage(WebDriver n) {
		super(n);
		
	}
	public void typeUserName(String p ) throws InterruptedException  {
		WebElement t1=getUserName() ;
           t1.sendKeys(p);		
	}

	public void typeNext1()  {
		WebElement t2=getNext1();
		t2.click();
		
	}

}
