import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class RegistrationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://pfizerweb:AlwaysBeingGood6@pfpfda247rustg.prod.acquia-sites.com/");
    }

    @AfterMethod
    public void tearDown(){
    driver.close();
    }

    @Test
    public void checkSignIn() throws InterruptedException {

        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        WebElement email = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress"));
        email.sendKeys("testemail137@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password"));
        password.sendKeys("zPau7ZXr");
        WebElement SingIn = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton"));
        SingIn.click();

        WebDriverWait QuizButton = new WebDriverWait(driver,10);
        QuizButton.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".quiz-start-link")));

        WebElement StarQuiz = driver.findElement(By.cssSelector(".quiz-start-link"));
        StarQuiz.click();


        if (driver.getPageSource().contains("Виагра")) {
            WebElement ViaGra = driver.findElement(By.xpath("//*[text()='Виагра']"));
            ViaGra.click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#edit-next")).click();



        } else if (driver.getPageSource().contains("Предметно-количественный учет")) {
            WebElement Uchet1 = driver.findElement(By.xpath("//*[text()='Предметно-количественный учет']"));
            Uchet1.click();

            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#edit-next")).click();
        } else {
            WebElement Dni = driver.findElement(By.xpath("//*[text()='15 дней']"));
            Dni.click();
            driver.findElement(By.cssSelector("#edit-next")).click();
            Thread.sleep(5000);
        }



        if (driver.getPageSource().contains("Предметно-количественный учет")) {
            WebElement Uchet1 = driver.findElement(By.xpath("//*[text()='Предметно-количественный учет']"));
            Uchet1.click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#edit-next")).click();

        }

        else if (driver.getPageSource().contains("Виагра")) {
            WebElement ViaGra = driver.findElement(By.xpath("//*[text()='Виагра']"));
            ViaGra.click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#edit-next")).click();
        } else {
            WebElement Dni = driver.findElement(By.xpath("//*[text()='15 дней']"));
            Dni.click();
            Thread.sleep(5000);
            driver.findElement(By.cssSelector("#edit-next")).click();
        }


        if (driver.getPageSource().contains("Предметно-количественный учет")) {
            WebElement Uchet1 = driver.findElement(By.xpath("//*[text()='Предметно-количественный учет']"));
            Uchet1.click();


        } else if (driver.getPageSource().contains("Виагра")) {
            WebElement ViaGra = driver.findElement(By.xpath("//*[text()='Виагра']"));
            ViaGra.click();


        } else {
            WebElement Dni = driver.findElement(By.xpath("//*[text()='15 дней']"));
            Dni.click();
            //WebDriverWait Viagra2 = new WebDriverWait(driver,10);
            //Viagra2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#edit-next")));

        }

    }


    @Test
    public void checkRegistration() throws InterruptedException {


        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".grv_register_open.register")));
        WebElement Registration = driver.findElement(By.cssSelector(".grv_register_open.register"));
        Registration.click();
        WebElement Next1 = driver.findElement(By.cssSelector(".next_btn.first"));
        Next1.click();
        WebElement Surname = driver.findElement(By.cssSelector("#capture_traditionalRegistration_familyName"));
        Surname.sendKeys("Surname");
        WebElement Name = driver.findElement(By.cssSelector("#capture_traditionalRegistration_givenName"));
        Name.sendKeys("Name");
        WebElement MiddleName = driver.findElement(By.cssSelector("#capture_traditionalRegistration_middleName"));
        MiddleName.sendKeys("MiddleName");
        WebElement Email = driver.findElement(By.cssSelector("#capture_traditionalRegistration_email"));
        Email.sendKeys("testemail137@yopmail.com");
        WebElement Next2 = driver.findElement(By.cssSelector(".next_btn.second"));
        Next2.click();
        WebElement PrimaryAddress = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_municipality"));
        PrimaryAddress.sendKeys("Москва");
        WebElement click = driver.findElement(By.xpath(".//*[@id='capture_traditionalRegistration_primaryAddress_administrativeArea']/option[2]"));
        click.click();
        WebElement Next3 = driver.findElement(By.cssSelector(".next_btn.third"));
        Next3.click();
        WebElement Specialty = driver.findElement(By.xpath(".//*[@id='capture_traditionalRegistration_designation_specialty']/option[2] "));
        Specialty.click();
        WebElement Next4 = driver.findElement(By.cssSelector(".next_btn.fourth"));
        Next4.click();
        WebElement PhoneNumber = driver.findElement(By.cssSelector("#capture_traditionalRegistration_phoneNumber_mobile"));
        PhoneNumber.sendKeys("+79991234567");
        WebElement WorkPlace = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_workplace"));
        WorkPlace.sendKeys("ГКБ им. С.П.Ботника");
        WebElement StreetName = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_streetName1"));
        StreetName.sendKeys("ул. Ломоносова 45");
        WebElement Next5 = driver.findElement(By.cssSelector(".next_btn.fifth"));
        Next5.click();
        WebElement Password = driver.findElement(By.cssSelector("#capture_traditionalRegistration_traditionalRegistration_password"));
        Password.sendKeys("zPau7ZXr");
        WebElement PasswordConfirm = driver.findElement(By.cssSelector("#capture_traditionalRegistration_traditionalRegistration_passwordConfirm"));
        PasswordConfirm.sendKeys("zPau7ZXr");
        WebElement CheckBox = driver.findElement(By.cssSelector("#capture_traditionalRegistration_acknowledgement_professional"));
        CheckBox.click();
        WebElement createAccount = driver.findElement(By.cssSelector("#capture_traditionalRegistration_createAccountButton"));
        createAccount.click();



    }
}
