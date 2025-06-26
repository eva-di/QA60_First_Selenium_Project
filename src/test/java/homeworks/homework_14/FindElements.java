package homeworks.homework_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Arrays;
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

    @Test
    public void findElementByXpath() {
        WebElement element = driver.findElement(By.xpath("//p[contains(.,'Tricentis')]"));
        System.out.println("Test 1: " + element.getText());

        WebElement element2 = driver.findElement(By.xpath("//input[@class='button-2 vote-poll-button']"));
        System.out.println("Test 2: " + element2.getAccessibleName());

        WebElement element3 = driver.findElement(By.xpath("//strong[.='Featured products']"));
        System.out.println("Test 3:" + element3.getText());

        WebElement element4 = driver.findElement(By.xpath("//div[starts-with(@id, 'newsletter-sub')]"));
        System.out.println("Test 4: " + element4.getText());

        List<WebElement> elements = driver.findElements(By.xpath("//ul/parent::*"));
        System.out.println("Test 5: " + elements.size());
        

        driver.findElement(By.xpath("//form/ancestor::div[1]"));
        driver.findElement(By.xpath("//ul/following-sibling::div[1]"));
        driver.findElement(By.xpath("//ul/preceding-sibling::ul"));
        driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']/.."));
        driver.findElement(By.xpath("//img/ancestor::*[1]"));

//      WebElement element5 = driver.findElement(By.xpath("//h1/ancestor::div[1]")); // SelectorHub находит, в Java падает...





    }

}
