package maven3;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
  
public class screenshots {

	@Test
	public void t4() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\All Coruses\\Java Testing\\Jar\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver ob=new ChromeDriver();
	     ob.get("https://jqueryui.com/droppable/");
	     File f1 = ob.getScreenshotAs(OutputType.FILE);
	     //copy, paste => fileutiles => Apache dir studio common io
	     FileUtils.copyFile(f1, new File("D:\\Java Eclipcse\\maven\\Screenshots\\before.png"));
	     
	     ob.switchTo().frame(0);
	     Actions ac=new Actions(ob);
	     WebElement ele1 = ob.findElementById("draggable");
	     
	     WebElement ele2 = ob.findElementById("droppable");
	     ac.dragAndDrop(ele1, ele2).build().perform();
	     
	}
}
