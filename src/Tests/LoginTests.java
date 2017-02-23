package Tests;

import Metods.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.io.IOException;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by Sasha on 09.02.2017.
 */
public class LoginTests extends BaseTest{

    @Test

    public void negativeLogin (){
    LoginPage loginPage = new LoginPage();
    loginPage.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1fggf995");
    WebElement errorMessage = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/form/div[1]/span"));
    assertTrue(errorMessage.getText().contains("Invalid Email or password."));

    }
    @Test

    public void positive (){
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        WebElement errorMessage = driver.findElement(By.className("username"));
        assertTrue(errorMessage.getText().contains("Sasha Yevtushenko"));
    }
    @Test

    public void emptufields (){
        LoginPage loginPage = new LoginPage();
        loginPage.login(driver, "alex.yevtushenko@thinkmobiles.com", "qwerasd1995");
        WebElement errorMessage = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div/div/div/div/div/div[2]/div[1]/form/div[2]/div[2]/label"));
        assertTrue(errorMessage.getText().contains("can't be blank"));
}
}
