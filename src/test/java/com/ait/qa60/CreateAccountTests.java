package com.ait.qa60;

import com.demo_web_shop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test(enabled = false)
    public void newUserRegistrationPositiveTest() {

        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleRadioButton();
        app.getUser().fillRegisterForm(new User().setFirstName("Sarah")
                .setLastName("Connor")
                .setEmail("sarah27@gmail.com")
                .setPassword("Qa12345!")
                .setConfirmPassword("Qa12345!"));
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }


}
