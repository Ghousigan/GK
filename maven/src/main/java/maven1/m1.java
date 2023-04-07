package maven1;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class m1 {
	@Test
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\\\All Coruses\\\\Java Testing\\\\Jar\\\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");

}
}