package homeworks.homework_16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {

        click(By.className("ico-register"));
        click(By.xpath("//label[@for='gender-female']"));
        click(By.id("FirstName"));
        type(By.id("FirstName"), "Sarah");
        click(By.id("LastName"));
        type(By.id("LastName"), "Connor");
        fillLoginForm();
        click(By.id("ConfirmPassword"));
        type(By.id("ConfirmPassword"), "Qa12345!");
        click(By.id("register-button"));

        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));

    }


}
