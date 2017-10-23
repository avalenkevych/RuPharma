import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

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
    public void CheckForgotPassword(){
        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        WebElement ForgotPsw = driver.findElement(By.cssSelector("#capture_signIn_userInformationForm > div.capture_form_item2 > a.grv-ru-ru"));
        ForgotPsw.click();
        WebElement Email = driver.findElement(By.cssSelector("#capture_forgotPassword_traditionalSignIn_emailAddress"));
        Email.sendKeys("testemail141@yopmail.com");
        WebElement SentButton = driver.findElement(By.cssSelector("#capture_forgotPassword_forgotPassword_sendButton"));
        SentButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(By.cssSelector("#forgotPasswordSuccess > div > p.grv-ru-ru"), "На адрес Вашей электронной почты была выслана ссылка с временным паролем."));


    }
}
