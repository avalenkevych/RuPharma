import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageOdjects.POF_EditProfile;
import pageOdjects.POF_ForgotPsw;
import pageOdjects.PageObjectForRegistration;
import pageOdjects.Waiters;

import javax.jws.soap.SOAPBinding;


public class EmailValidationTest {

    WebDriver driver;

    @BeforeMethod
        public void setUp(){
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get("https://webguard:Looking4AnAnswer@pfpfda247rudev.prod.acquia-sites.com/");

        }

    @AfterMethod
        public void tearDown(){
            driver.close();
        }


    @Test (dataProvider = "getData")
     public void checkEmailValidationField(String email) throws InterruptedException {

        Waiters wait = new Waiters(driver);
        PageObjectForRegistration RegisterUser = PageFactory.initElements(driver,PageObjectForRegistration.class);
        wait.registrationLinkWaiter(RegisterUser.registrationLink);
        Thread.sleep(2000);
        PageObjectForRegistration.Registration(driver).click();
        PageObjectForRegistration.Next1(driver).click();
        PageObjectForRegistration.Email_Validation(driver).sendKeys(email);
        PageObjectForRegistration.MiddleName(driver).click();
        wait.emailErrorWaiter(RegisterUser.erroeEmail);

    }

    @DataProvider

        public Object[] getData() throws Exception
    {
            Object[] data = new Object[3];
            data [0] = "not email@@";
            data [1] = "invalid email@";
            data [2] = "testemailyopmail.com";
            return data;
    }

    @Test
    public void checkLoginValidation() throws InterruptedException {
        POF_ForgotPsw ErrorMsg = PageFactory.initElements(driver,POF_ForgotPsw.class);
        PageObjectForRegistration UserLogin = PageFactory.initElements(driver,PageObjectForRegistration.class);
        Waiters wait = new Waiters(driver);
        // wait for presence login link
        wait.loginLinkWaiter(UserLogin.Login);
        Thread.sleep(2000);
        UserLogin.Login.click();
        UserLogin.SignIn.click();
        Assert.assertEquals(ErrorMsg.emailError.getText(), "Необходимо ввести адрес электронной почты");
        Assert.assertEquals(ErrorMsg.passwordError.getText(), "Необходимо ввести пароль");
    }
}


