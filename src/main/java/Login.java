import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Login {
    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public static WebDriver driver;

    public WebDriver open(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(3000);
        return driver;
    }

    public WebDriver logIn(String login, String pass)  {
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='email']/div/input")).isDisplayed());
        driver.findElement(By.xpath("//div[@id='email']/div/input")).sendKeys(login);
        driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys(pass);
        driver.findElement(By.xpath("//div[@id='btnOK']/div/div")).click();
        return driver;
    }
}
