package Metods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Sasha on 01.03.2017.
 */
public class Edit {
    public void editlab (WebDriver driver) {
        driver.findElement(By.className("plans-icons-edit")).click();
        driver.findElement(By.id("git_lab_setting_branch")).clear();
        driver.findElement(By.id("git_lab_setting_branch")).sendKeys("EasyQAopaopaopa");
        driver.findElement(By.name("commit")).click();

    }


}
