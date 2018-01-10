import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageOdjects.PageObjectForRegistration;
import pageOdjects.Waiters;


public class RegistrationTest {

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
    public void checkSignIn() throws InterruptedException {

        PageObjectForRegistration UserLogin = PageFactory.initElements(driver,PageObjectForRegistration.class);
        Waiters wait = new Waiters(driver);
        // wait for presence login link
        wait.loginLinkWaiter(UserLogin.Login);
        Thread.sleep(2000);
        UserLogin.Login_Action();
        Thread.sleep(8000);
        //wait.quizWaiter(UserLogin.quizBtn);
        //PageObjectForRegistration.Start_Quiz(driver).click();

        if (driver.getPageSource().contains("Виагра")) {

            PageObjectForRegistration.ViaGra(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();

        }
        else if (driver.getPageSource().contains("Предметно-количественный учет")) {

            PageObjectForRegistration.Uchet(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else {
            PageObjectForRegistration.Dni(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        Thread.sleep(1000);

        if (driver.getPageSource().contains("Виагра")) {
            PageObjectForRegistration.ViaGra(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else if (driver.getPageSource().contains("Предметно-количественный учет")) {
            PageObjectForRegistration.Uchet(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else {
            PageObjectForRegistration.Dni(driver).click();
            wait.nextBtnWaiter(UserLogin.quizNext);
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }

        Thread.sleep(1000);
        if (driver.getPageSource().contains("Предметно-количественный учет")) {
            PageObjectForRegistration.Uchet(driver).click();

        } else if (driver.getPageSource().contains("Виагра")) {
            PageObjectForRegistration.ViaGra(driver).click();
        }
        else {
            PageObjectForRegistration.Dni(driver).click();
        }
        Thread.sleep(2000);
    }


    @Test
    public  void checkRegistration() throws InterruptedException {

        Waiters wait = new Waiters(driver);
        PageObjectForRegistration RegisterUser = PageFactory.initElements(driver,PageObjectForRegistration.class);
        wait.registrationLinkWaiter(RegisterUser.registrationLink);
        PageObjectForRegistration.Registration(driver).click();
        Thread.sleep(2000);
        PageObjectForRegistration.Next1(driver).click();
        PageObjectForRegistration.Surname(driver).sendKeys("Surname");
        PageObjectForRegistration.Name(driver).sendKeys("Name");
        PageObjectForRegistration.MiddleName(driver).sendKeys("MiddleName");
        RegisterUser.Email(driver);
        PageObjectForRegistration.Next2(driver).click();
        PageObjectForRegistration.Primary_Address(driver).sendKeys("Москва");
        PageObjectForRegistration.State(driver).click();
        PageObjectForRegistration.Next3(driver).click();
        PageObjectForRegistration.Specialty(driver).click();
        PageObjectForRegistration.Gender(driver).click();
        PageObjectForRegistration.Next4(driver).click();
        PageObjectForRegistration.Phone_Number(driver).sendKeys("+79991234567");
        PageObjectForRegistration.Work_Place(driver).sendKeys("ГКБ им. С.П.Ботника");
        PageObjectForRegistration.Street_Name(driver).sendKeys("ул.Ломоносова");
        PageObjectForRegistration.House_Number(driver).sendKeys("45");

        PageObjectForRegistration.Next5(driver).click();
        PageObjectForRegistration.Next5(driver).click();

        PageObjectForRegistration.Password(driver).sendKeys("zPau7ZXr");
        PageObjectForRegistration.Password_Confirm(driver).sendKeys("zPau7ZXr");
        PageObjectForRegistration.CheckBox(driver).click();
        PageObjectForRegistration.Create_Account_Button(driver).click();
        Thread.sleep(2000);

    }
}
