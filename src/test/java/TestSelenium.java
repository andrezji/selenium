import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestSelenium {

    WebDriver driver;

    String login;
    String password;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/agumula/configuration_files/chrome_web_driver/chromedriver");
        driver = new ChromeDriver();
        login = "";
        password = "";
    }

    @Test
    public void firstTest() throws InterruptedException {

        driver.get("https://github.com/login?");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        WebElement loginField = driver.findElement(By.id("login_field"));
        loginField.sendKeys(login);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        WebElement button = driver.findElement(By.name("commit"));
        button.click();

    }

    @After
    public void clear() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
