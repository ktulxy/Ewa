import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Osago {
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
        Thread.sleep(1000);

        WebElement tiptrans = driver.findElement(By.xpath("//div[@id='autoCategory']/div/div/div"));// тип тз
        tiptrans.click();
        Actions tiptz = new Actions(driver);
        tiptz.sendKeys(Keys.ARROW_DOWN).build().perform();
        tiptz.sendKeys(Keys.ARROW_DOWN).build().perform();
        tiptz.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@id='registrationPlace']/div/div/div")).click();//misto reestratsii
        Thread.sleep(1000);
        Actions misto = new Actions(driver);
        misto.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);


        driver.findElement(By.xpath("//div[@id='registrationType']/div/div/div")).click();//Tip Reestratsii
        Actions tipReestr = new Actions(driver);
        tipReestr.sendKeys(Keys.ENTER).build().perform();

//Dani straxyvalnika

        WebElement inn = driver.findElement(By.xpath("//div[@id='customerCode']/div/div/input"));//INN
        inn.sendKeys("3478763498");

        driver.findElement(By.xpath("//div[@id='customerBirthDate']/div/div/input")).click(); //date rogdenia

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


        WebElement kimvidan = driver.findElement(By.xpath("//div[3]/div/div/div[3]/div/div/div/div/div/div/div/div/div/div/input")); //kim vudan doc
        kimvidan.sendKeys("Деснянським РУ ГУ");
        Thread.sleep(2000);
        Actions vidan = new Actions(driver);
        vidan.sendKeys(Keys.ARROW_DOWN).build().perform();
        vidan.sendKeys(Keys.ENTER).build().perform();

//Dani Avto

        WebElement numberAvto = driver.findElement(By.xpath("//div[@id='stateNumber']/div/div/input"));  //numberAvto
        numberAvto.sendKeys("AA0560TB");

        WebElement vin = driver.findElement(By.xpath("//div[@id='bodyNumber']/div/div/input"));  //Vin
        vin.sendKeys("WDF12376456789098");

        WebElement model = driver.findElement(By.xpath("//div[@id='autoModel']/div/div/input"));  //model
        model.sendKeys("308");
        Thread.sleep(2000);
        model.sendKeys(Keys.ARROW_DOWN);
        model.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//div[@id='autoYear']/div/div/input"));  //year
        year.sendKeys("2008");

        WebElement adressDostavki = driver.findElement(By.xpath("//div[7]/div/div/div/div/input")); //Адрес сдоставки
        adressDostavki.sendKeys("Гонолулу, квартира 25");

        WebElement engine = driver.findElement(By.xpath("//div[@id='engineVolume']/div/div/input")); //engine
        engine.sendKeys("1555");






//Podpisat dogovor

        driver.findElement(By.xpath("//div[@id='buttonSign2']/div/div")).click();   // Podpisat







    }

    @AfterClass
    public static void end() throws InterruptedException {
        Thread.sleep(10000);
         driver.close();

    }
}
