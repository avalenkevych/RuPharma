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
        driver.get("https://pfizerweb:AlwaysBeingGood6@pfpfda247rudev.prod.acquia-sites.com/");
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
        UserLogin.Login_Action("testemail142@yopmail.com","zPau7ZXr");
        wait.quizWaiter(PageObjectForRegistration.Start_Quiz(driver));

        //WebDriverWait QuizButton = new WebDriverWait(driver,10);
        //QuizButton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".quiz-start-link")));
        PageObjectForRegistration.Start_Quiz(driver).click();

        if (driver.getPageSource().contains("Виагра")) {

            PageObjectForRegistration.ViaGra(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();

        }
        else if (driver.getPageSource().contains("Предметно-количественный учет")) {

            PageObjectForRegistration.Uchet(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else {
            PageObjectForRegistration.Dni(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        Thread.sleep(1000);

        if (driver.getPageSource().contains("Виагра")) {
            PageObjectForRegistration.ViaGra(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else if (driver.getPageSource().contains("Предметно-количественный учет")) {
            PageObjectForRegistration.Uchet(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
            PageObjectForRegistration.Quiz_Next_Btn(driver).click();
        }
        else {
            PageObjectForRegistration.Dni(driver).click();
            WebDriverWait wait3 = new WebDriverWait(driver,10);
            wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));
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

        //Waiters wait = new Waiters(driver);
        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".grv_register_open.register")));
        PageObjectForRegistration.Registration(driver).click();
        PageObjectForRegistration.Next1(driver).click();
        PageObjectForRegistration.Surname(driver).sendKeys("Surname");
        PageObjectForRegistration.Name(driver).sendKeys("Name");
        PageObjectForRegistration.MiddleName(driver).sendKeys("MiddleName");
        PageObjectForRegistration.Email(driver).sendKeys("testemail142@yopmail.com");
        PageObjectForRegistration.Next2(driver).click();
        PageObjectForRegistration.Primary_Address(driver).sendKeys("Москва");
        PageObjectForRegistration.State(driver).click();
        PageObjectForRegistration.Next3(driver).click();
        PageObjectForRegistration.Specialty(driver).click();
        PageObjectForRegistration.Next4(driver).click();
        PageObjectForRegistration.Phone_Number(driver).sendKeys("+79991234567");
        PageObjectForRegistration.Work_Place(driver).sendKeys("ГКБ им. С.П.Ботника");
        PageObjectForRegistration.Street_Name(driver).sendKeys("ул. Ломоносова 45");
        PageObjectForRegistration.Next5(driver).click();
        PageObjectForRegistration.Password(driver).sendKeys("zPau7ZXr");
        PageObjectForRegistration.Password_Confirm(driver).sendKeys("zPau7ZXr");
        PageObjectForRegistration.CheckBox(driver).click();
        PageObjectForRegistration.Create_Account_Button(driver).click();
        Thread.sleep(4000);



    }
}
