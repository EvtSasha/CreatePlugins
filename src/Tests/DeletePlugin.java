package Tests;

import Metods.DeletePlagin;
import Metods.GitLub;
import Metods.Integration;
import Metods.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by Sasha on 07.03.2017.
 */
public class DeletePlugin extends BaseTest {

    @Test
    public void deleteplagins() throws InterruptedException {
        LoginPage loginplus = new LoginPage();
        loginplus.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        Integration integration = new Integration();
        integration.addIntegration(driver);
        GitLub gitLub = new GitLub();
        gitLub.addlub(driver);
        driver.get(baseUrl + "/projects/SashaTest_TestProject/integrations");
        driver.findElement(By.linkText("Plugin Integrations")).click();
        Thread.sleep(2000);
        DeletePlagin delete = new DeletePlagin();
        delete.deleteplugin(driver);

    }
}
