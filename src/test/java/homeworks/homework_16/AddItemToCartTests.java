package homeworks.homework_16;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {
    
    @BeforeMethod
    public void preCondition() {
        clickOnLoginLink();
        fillLoginForm();
        clickOnLoginButton();
    }

    @Test
    public void addItemToCartPositiveTest() {
        clickOnItemLink();
        enterQuantityOfItem();
        clickOnAddToCartButton();
        Assert.assertTrue(isElementPresent(By.xpath("//div[@id='bar-notification']//p[contains(., " +
                "'The product has been added to your') and contains(., 'shopping cart')]")));
    }



}
