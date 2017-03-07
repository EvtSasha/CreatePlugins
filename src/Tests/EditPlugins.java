package Tests;

import Metods.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Sasha on 27.02.2017.
 */
public class EditPlugins  extends BaseTest{

    @Test
    public void editlab() throws InterruptedException{
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        GitLub gitLub = new GitLub();
        gitLub.addlub(driver);
        Thread.sleep(2000);
        driver.get(baseUrl + "/projects/SashaTest_TestProject/integrations");
        driver.findElement(By.linkText("Plugin Integrations")).click();
        Thread.sleep(2000);
        Edit edit = new Edit();
        edit.editlab(driver);
        Thread.sleep(2000);
        driver.get(baseUrl + "/projects/SashaTest_TestProject/integrations");
        driver.findElement(By.linkText("Plugin Integrations")).click();
        Thread.sleep(2000);



    }



}



