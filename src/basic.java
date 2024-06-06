import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basic extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = capabilities();
		
		/* 
		 * 1. Xpath
		 * 		//tagname[@attrubute='value']
		 * 
		 * 		<div clssname="" id=""> </>
		 */
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		
		/* 
		 * 2. id dan index
		 * 
		 */
		driver.findElementById("android:id/checkbox").click();
		
		driver.findElementByXPath("//android.widget.LinearLayout[2]").click();
		
		/* 
		 * 3. classname
		 */
		
		driver.findElementByClassName("android.widget.EditText").sendKeys("password");
		
		// classname with index 
		
		driver.findElementsByClassName("android.widget.Button").get(1).click();




	}

}