import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class EmailValidationTest {

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


    @Test (dataProvider = "getData")
     public void checkEmailValidationField(String email){

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".grv_register_open.register")));
        WebElement Registration = driver.findElement(By.cssSelector(".grv_register_open.register"));
        Registration.click();
        WebElement Next1 = driver.findElement(By.cssSelector(".next_btn.first"));
        Next1.click();

        WebElement Email = driver.findElement(By.cssSelector("#capture_traditionalRegistration_email"));
        Email.sendKeys(email);
        WebElement MiddleName = driver.findElement(By.cssSelector("#capture_traditionalRegistration_middleName"));
        MiddleName.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(By.cssSelector("#capture_traditionalRegistration_form_item_email > div.capture_tip_error"),"Адрес электронной почты: неверный формат"));

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

}


