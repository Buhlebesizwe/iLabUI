package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
    public WebDriver driver;

    public WebDriver WebdriverManager() throws InterruptedException, IOException {
        if(driver == null) {
            FileInputStream fileInputStream = new FileInputStream("src/test/java/resources/globalProperties.properties");
            Properties prop = new Properties();
            prop.load(fileInputStream);
            String url = prop.getProperty("iLab");

            System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
        }
        Thread.sleep(2000);
        return driver;
    }
}
