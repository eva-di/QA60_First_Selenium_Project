package homeworks.homework_16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        clickOnLoginLink();
        fillLoginForm();
        clickOnRememberMeCheckBox();
        clickOnLoginButton();

        Assert.assertTrue(isElementPresent(By.xpath("//a[.='Log out']")));

    }

}

