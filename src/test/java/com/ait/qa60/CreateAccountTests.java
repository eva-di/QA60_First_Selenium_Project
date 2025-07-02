package com.ait.qa60;

import com.demo_web_shop.data.UserData;
import com.demo_web_shop.models.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase {

    @Test
    public void newUserRegistrationPositiveTest() {
//        int i = (int)((System.currentTimeMillis()/ 1000)%3600);


        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleRadioButton();
        app.getUser().fillRegisterForm(new User().setFirstName(UserData.NAME)
                .setLastName(UserData.LAST_NAME)
                .setEmail(UserData.EMAIL)
                .setPassword(UserData.PASSWORD)
                .setConfirmPassword(UserData.CONFIRM_PASSWORD));
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }


}
