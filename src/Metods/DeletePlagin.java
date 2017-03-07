package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 07.03.2017.
 */
public class DeletePlagin {
    public void deleteplugin (WebDriver driver){
        driver.findElement (By. className("plans-item-inner-left"));
        driver.findElement(By.className("icon-basket-icon")).click();
        driver.findElement(By.id("confirm")).click();
    }

}
