package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sasha on 09.02.2017.
 */
public class BaseTest {
        public WebDriver driver;
        public String baseUrl = "http://qa_dashboard.test.thinkmobiles.com:8085";

        @BeforeMethod
        public void SetUp() {
            System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(baseUrl);
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        }

        @AfterMethod
        public void tearDown() throws Exception {
            driver.close();
        }

}
