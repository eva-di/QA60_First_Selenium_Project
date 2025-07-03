package com.ait.qa60;

import com.demo_web_shop.data.ProductData;
import com.demo_web_shop.data.UserData;
import com.demo_web_shop.models.Product;
import com.demo_web_shop.models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase {

//   SoftAssert softAssert = new SoftAssert();


    @BeforeMethod
    public void preCondition(){

            app.getUser().clickOnLoginLink();
            app.getUser().fillLoginForm(new User().setEmail(UserData.LOGIN).setPassword(UserData.PASSWORD));
            app.getUser().clickOnLoginButton();
    }

    @Test
    public void addItemToCartPositiveTest() {
        app.getProduct().clickOnSecondItemLink();
        app.getProduct().enterQuantityOfItem(new Product().setQuantity(ProductData.QUANTITY));
        app.getProduct().clickOnAddToCartButton();
        app.getProduct().clickOnShoppingCartLink();
//        softAssert.assertTrue(isElementPresent(By.xpath("//div[@id='bar-notification']//p[contains(., " +
//                "'The product has been added to your') and contains(., 'shopping cart')]")));
        Assert.assertTrue(app.getProduct().isSecondItemInShoppingCart());

    }


}
