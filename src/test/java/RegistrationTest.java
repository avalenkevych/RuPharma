import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.xml.soap.Text;
import java.util.concurrent.TimeUnit;


public class RegistrationTest {

    @Test
    public void checkRegistration() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://pfizerweb:AlwaysBeingGood6@pfpfda247rustg.prod.acquia-sites.com/");

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
        Email.sendKeys("testemail127@yopmail.com");
        WebElement Next2 = driver.findElement(By.cssSelector(".next_btn.second"));
        Next2.click();
        WebElement PrimaryAddress = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_municipality"));
        PrimaryAddress.sendKeys("Москва");
        //WebElement list = driver.findElement(By.cssSelector("#select2-capture_traditionalRegistration_primaryAddress_administrativeArea-container"));
        //list.click();
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
        Thread.sleep(5000);
        WebElement Next6 = driver.findElement(By.cssSelector(".capture_btn.capture_primary.grv-ru-ru.next_btn"));
        Next6.click();
       // WebElement Answer1 = driver.findElement(By.cssSelector("#edit-question-741-answer-user-answer-126--2"));
       // Answer1.click();
        //WebElement Next7 = driver.findElement(By.cssSelector("#edit-next"));
        //Next7.click();

        driver.close();









    }
    @Test
    public void checkLoginTesting() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://pfizerweb:AlwaysBeingGood6@pfpfda247rustg.prod.acquia-sites.com/");
        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        WebElement email = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress"));
        email.sendKeys("testemail127@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password"));
        password.sendKeys("zPau7ZXr");
        WebElement SingIn = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton"));
        SingIn.click();
        Thread.sleep(10000);
        WebElement StarQuiz = driver.findElement(By.cssSelector(".quiz-start-link"));
        StarQuiz.click();




    }
}