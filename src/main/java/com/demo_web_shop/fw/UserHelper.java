package com.demo_web_shop.fw;

import com.demo_web_shop.models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends BaseHelper {
    public UserHelper(WebDriver driver) {
        super(driver);
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
    }

    public void fillLoginForm(User user) {
        click(By.id("Email"));
        type(By.id("Email"), user.getEmail());
        click(By.id("Password"));
        type(By.id("Password"), user.getPassword());
    }

    public void clickOnLoginLink() {
        click(By.xpath("//a[@class='ico-login']"));
    }

    public void clickOnRememberMeCheckBox() {
        click(By.id("RememberMe"));
    }

    public boolean isLogOutLinkPresent() {
        return isElementPresent(By.xpath("//a[.='Log out']"));
    }


    public void clickOnRegisterButton() {
        click(By.id("register-button"));
    }

    public void clickOnFemaleRadioButton() {
        click(By.xpath("//label[@for='gender-female']"));
    }

    public void clickOnRegisterLink() {
        click(By.className("ico-register"));
    }

    public void fillRegisterForm(User user) {
        click(By.id("FirstName"));
        type(By.id("FirstName"), user.getFirstName());
        click(By.id("LastName"));
        type(By.id("LastName"), user.getLastName());
        click(By.id("Email"));
        type(By.id("Email"), user.getEmail());
        click(By.id("Password"));
        type(By.id("Password"), user.getPassword());
        click(By.id("ConfirmPassword"));
        type(By.id("ConfirmPassword"), user.getConfirmPassword());
    }

    public void clickOnLogOutLink() {
        click(By.xpath("//a[.='Log out']"));

    }
    public boolean isLoginLinkPresent() {
        return isElementPresent(By.xpath("//a[.='Log out']"));

    }


}
