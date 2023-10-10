package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailCreateAcountModel;

public class gmailCreateAccountPage extends gmailCreateAcountModel{

	public gmailCreateAccountPage(WebDriver j) {
		super(j);
	}
	public void typeFirstName(String b)  {
		WebElement f=getFirstName();
		f.sendKeys(b);
	}
	
	public void typeLastName( String a){
		WebElement l =getLastName();
		l.sendKeys(a);
	}

	public void typeNext() {
		WebElement n=getNext();
		n.click();
	}
}
