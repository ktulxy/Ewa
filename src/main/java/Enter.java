import com.google.common.annotations.VisibleForTesting;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Enter {

    public static WebDriver driver;

    @BeforeClass
    public static void comeIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://clone.ewa.ua/#/home");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='email']/div/input")).sendKeys("45076@ewa.ua");
        driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys("A1122334455qwerty1867");
        driver.findElement(By.xpath("//div[@id='btnOK']/div/div")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='id-menu-contracts']/a/i")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div")).click();


        //driver.findElement(By.xpath("//div/div/span")).click();
        //driver.findElement(By.xpath("//div[@id='tariff']/div/div/div")).click();
    }

    @Test
    public void makeOsago() throws InterruptedException {
        driver.findElement(By.xpath("//div/div/span")).click(); //нажатие на вападающий список продуктов осаго.туризм...
        Thread.sleep(2000);
        WebElement product = driver.findElement(By.xpath("//div[@id='tariff']/div/div/div"));// вападающий список продуктов осаго
        product.click();
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();


    }

    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();

    }

}
