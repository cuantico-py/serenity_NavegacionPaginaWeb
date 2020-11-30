// driver agregado v87

package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverChrome {

    private WebDriver chrome;

    public WebDriver setupDriver() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();
        return chrome;

    }

    public void closeDriver() {
        chrome.close();

    }


}
