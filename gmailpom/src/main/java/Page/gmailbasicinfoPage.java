package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Model.gmailBasicinfo;

public class gmailbasicinfoPage  extends gmailBasicinfo{

	public gmailbasicinfoPage(WebDriver u) {
		super(u);
		
	}
	public void typeMonth(String b) throws InterruptedException  {
		WebElement f=getMonth();
		Select sel=new Select(f);
        sel.selectByVisibleText(b);
}
	
	public void typeDay(String d)  {
		WebElement g=getDay();
		g.sendKeys(d);
	}
	
	public void typeYear(String e )  {
		WebElement f1=getYear();
		f1.sendKeys(e);
		
	}
	public void typeGender(String c)  {
		WebElement f2=getGender();
		Select sel=new Select(f2);
        sel.selectByVisibleText(c);
}
	
	public void typeNextButton()  {
		WebElement f3=getNextButton();
		f3.click();
		
	}

	}
	

