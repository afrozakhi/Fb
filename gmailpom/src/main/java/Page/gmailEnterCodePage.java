package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Model.gmailEnterCodeModel;

public class gmailEnterCodePage extends gmailEnterCodeModel {

	public gmailEnterCodePage(WebDriver u) {
		super(u);
	
	}
	public String checkEnter() throws InterruptedException     {
		WebElement t1= getEnterCode() ;
		String s=t1.getText();
		return s;
		
           		
	}

}
