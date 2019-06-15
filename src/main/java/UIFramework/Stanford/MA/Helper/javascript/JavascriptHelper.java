package UIFramework.Stanford.MA.Helper.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavascriptHelper {

	private WebDriver driver;
	
	public JavascriptHelper(WebDriver driver) {
		super();
		this.driver = driver;
	}
//Method to execute javascript
	public void executeScript(String script) 
	{
		JavascriptExecutor exe=(JavascriptExecutor)driver;
		exe.executeScript(script);
	}
}
