package homeworks.homework_15;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    // click on Register
    // enter First name
    // enter Last Name
    // Enter Email
    // Enter Password
    // Enter Password again
    // click on Registration button
    // verify Sign out button is displayed

    @Test
    public void newUserRegistrationPositiveTest() {

        driver.findElement(By.className("ico-register")).click();

        driver.findElement(By.xpath("//label[@for='gender-female']")).click();

        click(By.id("FirstName"));
        type(By.id("FirstName"), "Sarah");

        click(By.id("LastName"));
        type(By.id("LastName"), "Connor");

        click(By.id("Email"));
        type(By.id("Email"), "sarah27@gmail.com");

        click(By.id("Password"));
        type(By.id("Password"), "Qa12345!");

        click(By.id("ConfirmPassword"));
        type(By.id("ConfirmPassword"), "Qa12345!");

        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));

    }


}
