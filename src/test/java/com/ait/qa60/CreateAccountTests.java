package com.ait.qa60;

import com.demo_web_shop.data.UserData;
import com.demo_web_shop.models.User;
import com.demo_web_shop.utils.DataProviders;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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

    @Test(dataProvider = "createNewAccount", dataProviderClass = DataProviders.class)
    public void newUserRegistrationPositiveTest(String firstName, String lastName,
                                                String email, String password,
                                                String confirmPassword) {
//        int i = (int)((System.currentTimeMillis()/ 1000)%3600);


        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleRadioButton();
        app.getUser().fillRegisterForm(new User().setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setConfirmPassword(confirmPassword));
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }

    @Test(dataProvider = "createNewUserWithScv", dataProviderClass = DataProviders.class)
    public void newUserRegistrationPositiveTest(User user) {
//        int i = (int)((System.currentTimeMillis()/ 1000)%3600);


        app.getUser().clickOnRegisterLink();
        app.getUser().clickOnFemaleRadioButton();
        app.getUser().fillRegisterForm(user);
        app.getUser().clickOnRegisterButton();

        Assert.assertTrue(app.getUser().isLogOutLinkPresent());

    }
    @AfterMethod
    public void postCondition() {
        app.getUser().clickOnLogOutLink();
    }


}
