import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollDemo extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        // Klik pada elemen dengan teks 'Views'
        driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

        // Scroll hingga elemen dengan teks 'WebView3' terlihat
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));");
    }
}
