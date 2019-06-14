package UIFramework.Stanford.MA.Helper.window;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowHelper {
	private WebDriver driver;

	public WindowHelper(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public void switchToParentWindow() {
		System.out.println("switching to Parent window");
		driver.switchTo().defaultContent();
	}

	public void switchToWindow(int index)

	{
		System.out.println("switching to child window");
		Set<String> Windows = driver.getWindowHandles();
		int i = 1;
		for (String window : Windows) {
			if (i == index) {
				driver.switchTo().window(window);
			} else {
				i++;
			}
		}
	}

	public void closeAllChildWindow() {
		Set<String> Windows = driver.getWindowHandles();
		String Parent = driver.getWindowHandle();
		for (String window : Windows) {
			if (!window.equalsIgnoreCase(Parent)) {
				driver.close();
			}

		}
		driver.switchTo().window(Parent);

	}
	
	public void navigateForward() 
	{
		driver.navigate().forward();
	}
	public void navigateBackward() 
	{
		driver.navigate().back();
	}
}
