package Tests;

import Metods.GitHub;
import Metods.Integration;
import Metods.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * Created by Sasha on 24.02.2017.
 */
public class NegativeCreatePlugin extends BaseTest {


    @Test
    public void failcreateHub() throws InterruptedException {
        LoginPage login = new LoginPage();
        login.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration hubplus = new Integration();
        hubplus.addIntegration(driver);
        GitHub failHubplus = new GitHub();
        failHubplus.failHub(driver);
        driver.findElement(By.className("info-block-error")).isDisplayed();
    }
}
