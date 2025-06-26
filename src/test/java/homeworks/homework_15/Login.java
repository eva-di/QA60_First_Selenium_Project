package homeworks.homework_15;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase {

    @Test
    public void loginPositiveTest() {

        click(By.className("ico-login"));

        click(By.id("Email"));
        type(By.id("Email"), "sarah27@gmail.com");

        click(By.id("Password"));
        type(By.id("Password"), "Qa12345!");

        click(By.id("RememberMe"));

        click(By.xpath("//input[@class='button-1 login-button']"));

        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));

    }
}

