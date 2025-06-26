package com_ait_qa60;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // инициализируем хромдрайвер, система активизирует драйвер в папке тулз через переменную в path
        driver.get("https://ilcarro.web.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void findElementByTag() {
        // find element by tagName
        // "h1" - локатор <h1>
        WebElement element = driver.findElement(By.tagName("h1")); // alt Enter (вызвать introduce local variable)
        System.out.println(element.getText()); // Find your car now!

        WebElement element1 = driver.findElement(By.tagName("a")); // "a111" NoSuchElementException: no such element: Unable to locate element: {"method":"tag name","selector":"a111"}
        System.out.println(element1.getText());

        // find list of elements by tag name
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }
    @Test
    public void findElementByLocators() {
        // by id
        driver.findElement(By.id("city"));
        // by  class name
        driver.findElement(By.className("header"));
        //by LinkText
        driver.findElement(By.linkText("Let the car work"));
        // by partialLinkText
        driver.findElement(By.partialLinkText("car"));
    }

    @Test
    public void findByCssSelector() {
        // id -> css selector (#)
        driver.findElement(By.cssSelector("#city"));
        // by class name -> css (.)
        driver.findElement(By.cssSelector(".header"));
        //find element by tag name -> ==css
        driver.findElement(By.cssSelector("h1"));
        // [attr='value']
        driver.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));

        // contains -> * (ищи везде) по частичному совпадению
        driver.findElement(By.cssSelector("[href*='login']"));
        // start -> ^
        driver.findElement(By.cssSelector("[href^='/log']"));
        // end on -> $
        driver.findElement(By.cssSelector("[href$='search']"));
        // tag + id
        driver.findElements(By.cssSelector("input#city"));
        // tag + class
        driver.findElement(By.cssSelector("div.search-card"));
        // tag + id + [attr='value']
        driver.findElement(By.cssSelector("input#city[type='text']"));
    }

    // // *[@attr='value']
    @Test
    public void findElementByXpath() {
        //id->xpath => //*[@id='value']
        driver.findElement(By.xpath("//input[@id='city']"));
        //driver.findElement(By.id("#city"));
        driver.findElement(By.xpath("//*[@id='city']"));
        // by class name -> xpath //*[@class='value']
        // driver.findElement(By.className("header"));
        driver.findElement(By.xpath("//div[@class='header']"));
        //contains -> //*[contains(.,'PartialText')]
        driver.findElement(By.xpath("//h2[contains(.,'Yalla')]"));
        // equal -> //*[text()='FullText']
        driver.findElement(By.xpath("//h2[text()='Type your data and hit Yalla!']"));
        // то же самое, но короче
        driver.findElement(By.xpath("//h2[.='Type your data and hit Yalla!']"));
        // start-with -> //*[starts-with(@attr, 'StartText')]
        driver.findElement(By.xpath("//label[starts-with(@for,'ci')]"));
        //move up
        driver.findElement(By.xpath("//a[@class='navigation-link']/.."));
        //parent
        driver.findElement(By.xpath("//h1/parent::*"));

        driver.findElement(By.xpath("//h1/parent::div"));

        driver.findElement(By.xpath("//h1/.."));
        // ancestor
        driver.findElement(By.xpath("//h1/ancestor::*")); // all
        driver.findElement(By.xpath("//h1/ancestor::div")); // 2 options
        // following-sibling
        driver.findElement(By.xpath("//h1/ancestor::div[1]")); // one option
        driver.findElement(By.xpath("//h1/following-sibling::form"));
        // preceding-sibling
        driver.findElement(By.xpath("//h2/preceding-sibling::*"));






    }
}
