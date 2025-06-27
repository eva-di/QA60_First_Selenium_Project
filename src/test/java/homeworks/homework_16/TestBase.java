package homeworks.homework_16;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        driver.quit();
    }

    public void click(By locator) {
        driver.findElement(locator).click();

    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public boolean isElementPresent(By locator) {
        return driver.findElements(locator).size()>0;
    }

    public void clickOnLoginButton() {
        click(By.xpath("//input[@class='button-1 login-button']"));
    }

    public void fillLoginForm() {
        click(By.id("Email"));
        type(By.id("Email"), "sarah27@gmail.com");
        click(By.id("Password"));
        type(By.id("Password"), "Qa12345!");
    }

    public void clickOnLoginLink() {
        click(By.className("ico-login"));
    }

    public void clickOnRememberMeCheckBox() {
        click(By.id("RememberMe"));
    }

    public void clickOnAddToCartButton() {
        click(By.cssSelector("[id='add-to-cart-button-31']"));
    }

    public void enterQuantityOfItem() {
        click(By.cssSelector("[id='addtocart_31_EnteredQuantity']"));
        type(By.cssSelector("[id='addtocart_31_EnteredQuantity']"), "1");
    }

    public void clickOnItemLink() {
        click(By.linkText("14.1-inch Laptop"));
    }

}
