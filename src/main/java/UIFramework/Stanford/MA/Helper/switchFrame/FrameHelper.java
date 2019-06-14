package UIFramework.Stanford.MA.Helper.switchFrame;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FrameHelper {
	private WebDriver driver;
	
//initialise the constructor	
public FrameHelper(WebDriver driver) {
	
		this.driver = driver;
	}
//swith to frame based on index
public void switchFrame(int index) 
{
driver.switchTo().frame(index);
System.out.println("Swithed to frame "+index);
}
//switch to frame by name	
public void switchFrame(String name) 
{
driver.switchTo().frame(name);
System.out.println("Swithed to frame "+name);
}
//switch to frame by webelemnt	
public void switchFrame(WebElement element) 
{
driver.switchTo().frame(element);
System.out.println("Swithed to frame "+element.toString());
}

}
