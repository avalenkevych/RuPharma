import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AccountDelationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://pfizerweb:AlwaysBeingGood6@pfpfda247rustg.prod.acquia-sites.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void checkAccountDeletion(){
        WebDriverWait wait3 = new WebDriverWait(driver,10);
        wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".capture_modal_open.login")));
        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement email = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress"));

        email.sendKeys("testemail140@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password"));
        password.sendKeys("zPau7ZXr");
        WebElement SingIn = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton"));
        SingIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.cssSelector("#block-system-user-menu > div > ul > li > a > span.username"));
        username.click();
        WebElement changedata = driver.findElement(By.cssSelector("#mini-panel-private_cabinet > div > div > div.inside.panels-flexible-row-inside.panels-flexible-row-new-main-row-inside.panels-flexible-row-inside-first.clearfix > div > div > div.name-update-data > a"));
        changedata.click();

        WebElement delete_button = driver.findElement(By.cssSelector("#delete-account-link-wrapper > a"));
        delete_button.click();
        WebDriverWait wait_delete_button = new WebDriverWait(driver,20);
        wait_delete_button.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-submit")));
        driver.findElement(By.cssSelector("#edit-submit")).click();
        WebDriverWait deletion_message = new WebDriverWait(driver,20);
        deletion_message.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@class=\"messages status\"]\t"),"Ваша учётная запись была успешно удалена!"));

    }
}
