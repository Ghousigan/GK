package maven1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class m2 {

	@Test
	public void t2()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\All Coruses\\Java Testing\\Jar\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	     ob.get("https://jqueryui.com/slider/");
	     
	     //drag and drop by
	     
	     ob.switchTo().frame(0);
	     Actions ac=new Actions(ob);
	     WebElement ele = ob.findElementById("slider");
	     ac.dragAndDropBy(ele, 40, 0).build().perform();
	}
}
