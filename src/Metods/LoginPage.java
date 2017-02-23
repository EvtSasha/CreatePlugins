package Metods;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sasha on 09.02.2017.
 */
public class LoginPage {



        public void login(WebDriver driver, String email, String password){
                driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
                driver.findElement(By.id("user_email")).click();
                driver.findElement(By.id("user_email")).sendKeys(email);
                driver.findElement(By.id("user_password")).click();
                driver.findElement(By.id("user_password")).sendKeys(password);
                driver.findElement(By.name("commit")).click();
                driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        }


}


