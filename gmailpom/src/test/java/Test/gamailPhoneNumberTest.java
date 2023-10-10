package Test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Library.ExcelRead;

public class gamailPhoneNumberTest extends gmailBaseTest {
	@Test(dataProvider="gmail")
	public void gmailcreateaccounttest(String f1,String f2,String f3,String f4,String f5,String f6,String f7,String f8,String f9,String f10) throws InterruptedException   {
		
	   
	   
	   getGmailAccountPage();
	   hp1.typeFirstName(f1);
	   hp1.typeLastName(f2);
	   hp1.typeNext();
	   
	   getGmailbasicPage();
	   bp.typeMonth(f3);
	   bp.typeDay(f4);
	   bp.typeYear(f5);
	   bp.typeGender(f6);
	   bp.typeNextButton();
	   
	   getUsernamePage();
	   up.typeUserName(f7);
	   up.typeNext1();
	   getPasswordPage();
	   up1.typePassWord(f8);
	   up1.typeConfirmPassWord(f9);
	   up1.typeNext2();
	   getPhonePage();
	   gp.typePhoneNumber(f10);
	   gp.typeNext3();
	   
	   
	   
	   
	   
	}

      @DataProvider(name="gmail")
       public Object[][] getData() throws IOException{
       Object[][]t;
            String filename="data/gmail.xlsx";
            String Sheetname="Sheet3";
            ExcelRead er=new ExcelRead(filename,Sheetname);
           t=er.excelToArray();


              return t;

	
	

	

}

}



