package maven2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class m3 {
	@Test
	public void t3()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\All Coruses\\Java Testing\\Jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	     ob.get("https://jqueryui.com/datepicker/");
	     
	     ob.switchTo().frame(0);
	     ob.findElementById("datepicker").click();
	     for (int i=0;i<2;i=i+1)
	     {
	    	 ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]").click();
	    	 
	     }
	     ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a").click();
	}

}
