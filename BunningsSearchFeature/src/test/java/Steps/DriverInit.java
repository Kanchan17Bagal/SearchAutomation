package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class DriverInit {
    private static Properties properties = null;

    static {
        try {
            properties = new Properties();
            properties.load(DriverInit.class.getClassLoader().getResourceAsStream("application.properties"));
            System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome.path"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        if ("chrome".equals(getProperty("browser"))) {
            driver = new ChromeDriver();
        }
        return driver;
    }


    public static String getProperty(String key) {
        return properties == null ? null : properties.getProperty(key, "");
    }
}
