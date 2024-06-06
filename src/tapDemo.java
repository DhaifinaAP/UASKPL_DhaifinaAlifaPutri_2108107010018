import java.net.MalformedURLException;
import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions; 
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions; 
import static java.time.Duration.ofSeconds;

public class tapDemo extends base {

    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();
        
        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        TouchAction t = new TouchAction(driver);
        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']"); 
        
        // Tap
        t.tap(tapOptions().withElement(element(expandList))).perform();
        
        driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
        
        // Long press
        WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
        
        t.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
    }
}
