import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
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
        /*Login login;
        login = new Login();
        login.logIn();*/

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
        Thread.sleep(5000);

        WebElement date = driver.findElement(By.xpath("//div[3]/div/div/div/div[2]/div/div/div/div/div/div/div/input"));//Choose days
        date.click();
        date.sendKeys("4");
        Thread.sleep(2000);

        WebElement birth = driver.findElement(By.xpath("//div[@id='birthDate']/div/div/input")); //den rogdenia
        Actions birt = new Actions(driver);
        birt.click().build().perform();
        birth.sendKeys("15.06.1986");
        driver.findElement(By.xpath("//fieldset[3]/div/div/fieldset/div/div/div/div/div/div/div/div/input")).click();
        Thread.sleep(2000);

        WebElement krainaChoose = driver.findElement(By.xpath("//fieldset[3]/div/div/div[4]/div/div/div/div/div/input"));//kraina poizdki
        Thread.sleep(2000);
        krainaChoose.click();
        Thread.sleep(1000);
        Actions kraina = new Actions(driver);
        Thread.sleep(1000);
        kraina.sendKeys(Keys.ARROW_DOWN).build().perform();
        kraina.sendKeys(Keys.ARROW_DOWN).build().perform();
        kraina.sendKeys(Keys.ENTER).build().perform();

        driver.findElement(By.xpath("//div[6]/div/div/div/div/div/div")).click();
        Actions meta = new Actions(driver);
        meta.sendKeys(Keys.ENTER).build().perform();



        driver.findElement(By.xpath("//fieldset[3]/div/div/fieldset/div/div/div/div/div/div/div/div/div")).click();//symmamc
        Actions mcsymma = new Actions(driver);
        mcsymma.sendKeys(Keys.ENTER).build().perform();

//Dani straxyvalnika

        WebElement inn = driver.findElement(By.xpath("//input[@id='customerCode-input']")); //INN
        inn.click();
        inn.sendKeys("3876785673");

        driver.findElement(By.xpath("//div[@id='customerBirthDate']/div/div/input")).click();

        WebElement familia = driver.findElement(By.xpath("//div[@id='customerNameLast']/div/input")); //familia
        familia.sendKeys("Testov");

        WebElement name = driver.findElement(By.xpath("//div[@id='customerNameFirst']/div/input")); //name
        name.sendKeys("Test");

        WebElement otchestvo = driver.findElement(By.xpath("//div[@id='customerNameMiddle']/div/input")); //otchestvo
        otchestvo.sendKeys("Testovich");

        WebElement adress = driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/div/div/div/input")); //adress
        adress.sendKeys("Kiev Balzaka str 61");

        WebElement tel = driver.findElement(By.xpath("//div[@id='customerPhone']/div/input")); //telefon
        tel.sendKeys("098-662-48-68");

        WebElement email = driver.findElement(By.xpath("//div[@id='customerEmail']/div/input")); //email
        email.sendKeys("omudritsky@ingo.ua");


        driver.findElement(By.xpath("//div[@id='customerDocumentType']/div/div/div")).click();//doc osobi
        Thread.sleep(1000);
        Actions doc = new Actions(driver);
        doc.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);


        WebElement seria = driver.findElement(By.xpath("//div[@id='customerDocumentSeries']/div/input")); //seria doc
        seria.sendKeys("ПП");

        WebElement nomer = driver.findElement(By.xpath("//div[@id='customerDocumentNumber']/div/input")); //nomer doc
        nomer.sendKeys("123456");


        WebElement dataVidachi = driver.findElement(By.xpath("//div[@id='customerDocumentDate']/div/div/input")); //date vidachi doc
        Thread.sleep(1000);
        dataVidachi.sendKeys("01.01.2010");



 //Zastraxovana Osoba

        WebElement innZast = driver.findElement(By.xpath("//input[@id='code-input']")); //inn zastr
        Actions innZ = new Actions(driver);
        innZ.click();
        innZast.sendKeys("3456786540");

        WebElement famZastr = driver.findElement(By.xpath("//input[@id='nameLast-input']")); //famZastr
        Actions famZ = new Actions(driver);
        famZ.click();
        famZastr.sendKeys("Zastraxovan");


        WebElement imaZastr = driver.findElement(By.xpath("//input[@id='nameFirst-input']")); //imaZastr
        imaZastr.click();
        imaZastr.sendKeys("Zastrax");

        WebElement otchZastr = driver.findElement(By.xpath("//input[@id='nameMiddle-input']")); //otchZastr
        otchZastr.click();
        otchZastr.sendKeys("Zastraxovan");

        WebElement adresZastr = driver.findElement(By.xpath("//fieldset[7]/div/div/div[4]/div/div/div/div/div/div/div/input")); //adresZastr
        adresZastr.click();
        adresZastr.sendKeys("Selo Troechina");

        WebElement serZastr = driver.findElement(By.xpath("//input[@id='documentSeries-input']"));   //serZastr
        serZastr.click();
        serZastr.sendKeys("OK");

        WebElement numZastr = driver.findElement(By.xpath("//input[@id='documentNumber-input']"));   //numZastr
        numZastr.click();
        numZastr.sendKeys("345666");

        driver.findElement(By.xpath("//div[@id='buttonSave2']/div/div")).click();




    }






    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();

    }
}

