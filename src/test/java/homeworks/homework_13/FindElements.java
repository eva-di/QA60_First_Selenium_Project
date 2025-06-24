package homeworks.homework_13;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElements {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElement() {
        driver.findElement(By.tagName("h2"));
        driver.findElement(By.id("topcartlink"));
        driver.findElement(By.className("nivo-imageLink"));

        WebElement link = driver.findElement(By.linkText("View all"));
        System.out.println(link.getText());

        WebElement link2 = driver.findElement(By.partialLinkText("cart"));
        System.out.println(link2.getText());

        driver.findElements(By.cssSelector("#ui-id-1"));
        List<WebElement> imgs = driver.findElements(By.cssSelector("img"));
        System.out.println(imgs.size());

        driver.findElement(By.cssSelector("[type='submit']"));

        WebElement link3 = driver.findElement(By.cssSelector("[href*='downloads']"));
        System.out.println(link3.getText());

        WebElement link4 = driver.findElement(By.cssSelector("[href^='/recently']"));
        System.out.println(link4.getText());

        WebElement link5 = driver.findElement(By.cssSelector("[href$='cards']"));
        System.out.println(link5.getText());

    }

}
