package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import Page.gmailCreateAccountPage;
import Page.gmailEnterCodePage;
import Page.gmailPasswordPage;
import Page.gmailPhoneNumberPage;
import Page.gmailUserNamePage;
import Page.gmailbasicinfoPage;

public class gmailBaseTest {
		static WebDriver driver;
		static gmailCreateAccountPage hp1;
		static gmailbasicinfoPage bp;
		static gmailUserNamePage up;
		static gmailPasswordPage up1;
		static gmailPhoneNumberPage gp;
		static gmailEnterCodePage ep;
		
		@BeforeSuite
		public void setup() {
			System.setProperty("webdriver.chrome.driver","Driver/chromedriver64.exe");
			driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signup");
			
		}
		
      
         public void getGmailAccountPage() {
   	      hp1=new gmailCreateAccountPage(driver);
        }
         
         public void getGmailbasicPage() {
      	      bp=new gmailbasicinfoPage(driver);
           }
         
         public void getUsernamePage() {
     	      up=new gmailUserNamePage(driver);
          }
         public void getPasswordPage() {
    	      up1=new gmailPasswordPage(driver);
         }
         
         
  
           public void getPhonePage() {
                  gp=new gmailPhoneNumberPage(driver);
}

           public void getEnterCode() {
               ep=new gmailEnterCodePage(driver);
}
}
