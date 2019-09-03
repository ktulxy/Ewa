import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class TurmedOptimal {
    public static WebDriver driver;
    @BeforeClass
    public static void comeIn() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://clone.ewa.ua/#/home");
        Thread.sleep(3000);
        //Login login;
        //login = new Login();
        //login.logIn();
        driver.findElement(By.xpath("//div[@id='email']/div/input")).sendKeys("45076@ewa.ua");
        driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys("A1122334455qwerty1867");
        driver.findElement(By.xpath("//div[@id='btnOK']/div/div")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//li[@id='id-menu-contracts']/a/i")).click();
        driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div")).click();
}

    @Test
    public void makeTurOpt() throws InterruptedException {

        driver.findElement(By.xpath("//div[5]/div/span")).click();//нажатие на вападающий список продуктов осаго.туризм...
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='tariff']/div/div/div")).click();
        Actions action = new Actions(driver);
        Thread.sleep(1000);
        action.sendKeys(Keys.ENTER).build().perform();
      //  action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//fieldset[3]/div/div/div[4]/div/div/div/div/div/div")).click();//kraina poizdki
        Thread.sleep(1000);
        Actions kraina = new Actions(driver);
        Thread.sleep(1000);
        kraina.sendKeys(Keys.ARROW_DOWN).build().perform();
        kraina.sendKeys(Keys.ARROW_DOWN).build().perform();
        kraina.sendKeys(Keys.ENTER).build().perform();



    }

    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(10000);
        driver.close();

    }
}

