import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import pageOdjects.PageObjectForRegistration;
import pageOdjects.POF_EditProfile;
import org.openqa.selenium.support.PageFactory;


public class EditProfileTest {

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
    public void checkEditProfile() throws InterruptedException {

        POF_EditProfile EditProfile = PageFactory.initElements(driver,POF_EditProfile.class);
        PageObjectForRegistration UserLogin = PageFactory.initElements(driver,PageObjectForRegistration.class);
        UserLogin.Login_Action("testemail142@yopmail.com","zPau7ZXr");
        WebDriverWait wait3 = new WebDriverWait(driver,10);
        wait3.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".capture_modal_open.login")));
        WebDriverWait wait4 = new WebDriverWait(driver,10);
        wait4.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress")));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EditProfile.username_link.click();
        EditProfile.Photo.click();
        driver.findElement(By.cssSelector("#edit-image-file-upload")).click();
        WebElement frame = driver.switchTo().activeElement();
        frame.sendKeys("D:\\AutomationJava\\RuPharna\\src\\test\\logo.jpg");
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#image-popup > div"),"Ваше фото изменено"));
        driver.findElement(By.xpath(".//*[text()=\"Ok, спасибо\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        EditProfile.ChangeData_Btn.click();
        EditProfile.Update_Name_Action("Name Updated");
        EditProfile.Update_Surname_Action("Surname Updated");
        EditProfile.Update_MidName_Action("MiddleName Updated");
        EditProfile.Update_Address_Action("Санкт-Петербург");
        EditProfile.Update_Phone_Action("+79997654321");
        EditProfile.Update_Work_Action("МГУ");
        EditProfile.Update_Street_Action("ул. Ломоносова 85");
        EditProfile.Checkbox.click();
        EditProfile.Save_Btn.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 5);
        wait1.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[text()=\"Ваш профиль был сохранен.\"]"), "Ваш профиль был сохранен"));

    }
}
