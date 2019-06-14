package UIFramework.Stanford.MA.Helper.wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	private WebDriver driver;
	
	
	public WaitHelper(WebDriver driver) {
	
		this.driver = driver;
	}


	public void setImplicitWait(long timeout,TimeUnit unit) 
	{
		driver.manage().timeouts().implicitlyWait(timeout,unit);
		System.out.println("Implicit wait set to :"+ timeout);
	}
	
	private WebDriverWait getWait(int TimeOutinSecond, int pollinginEverySecond) 
	{
		WebDriverWait wait= new WebDriverWait(driver,TimeOutinSecond);
		wait.pollingEvery(pollinginEverySecond, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;
	}
	
	public void waitForElementVisiblewithPollingTime(WebElement element,int TimeOutinSecond, int pollinginEverySecond) 
	{
		System.out.println("Waiting for "+element.toString()+" for "+TimeOutinSecond+" sec ");
		WebDriverWait wait= getWait(pollinginEverySecond, pollinginEverySecond);
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println();
		
	}

}
