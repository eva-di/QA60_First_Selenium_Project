package com.ait.qa60;

import com.demo_web_shop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest() {

        app.getUser().clickOnLoginLink();
        app.getUser().fillLoginForm(new User().setEmail("sarah27@gmail.com").setPassword("Qa12345!"));
        app.getUser().clickOnRememberMeCheckBox();
        app.getUser().clickOnLoginButton();

        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }

}

