import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageOdjects.POF_ForgotPsw;
import pageOdjects.PageObjectForRegistration;
import pageOdjects.Waiters;

public class ForgotPasswordTest {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://webguard:Looking4AnAnswer@pfpfda247rudev.prod.acquia-sites.com/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void CheckForgotPassword() throws InterruptedException {
        PageObjectForRegistration Login = PageFactory.initElements(driver,PageObjectForRegistration.class);
        POF_ForgotPsw ForgotPsw = PageFactory.initElements(driver,POF_ForgotPsw.class);
        Waiters wait = new Waiters(driver);
        Login.Login.click();
        Thread.sleep(2000);
        ForgotPsw.forgotPswLink.click();
        ForgotPsw.forgotEmail.sendKeys("testemail154@yopmail.com");
        ForgotPsw.forgotSentBtn.click();
        wait.forgotConfirmMessageWaiter(ForgotPsw.forgotConfMessage);

    }
}
