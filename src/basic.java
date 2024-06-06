import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		/* 
		 * 1. About dan Profile
		 * 		
		 */
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"About\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Back\"]").click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Profile\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Back\"]").click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]").click();
		
		
		/* 
		 * 2. Add Data
		 * 
		 */
		driver.findElementByXPath("//android.widget.TextView[@text=\"Add Data\"]").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Name\"]").click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]").sendKeys("Dhaifina Alifa Putri");
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Nim\"]").click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]").sendKeys("2108107010018");
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Description\"]").click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]").sendKeys("Computer Science Major");

		driver.findElementByXPath("//android.widget.TextView[@text=\"Submit\"]").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]"))).click();
		
		
		/* 
		 * 3. Delete Data
		 */
		
		
		driver.findElementByXPath("//android.widget.TextView[@text=\"Delete Data\"]").click();
        
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Delete All Data\"]"))).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@text=\"Confirm\"]"))).click();
		
		driver.findElementByXPath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button").click();

		driver.findElementByXPath("//android.widget.TextView[@text=\"Back\"]").click();
		
		driver.quit();
	}

}