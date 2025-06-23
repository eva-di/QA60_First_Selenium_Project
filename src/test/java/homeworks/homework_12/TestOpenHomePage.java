package homeworks.homework_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOpenHomePage {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void testOpenHomePage() {
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
       // System.out.println("Open");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
