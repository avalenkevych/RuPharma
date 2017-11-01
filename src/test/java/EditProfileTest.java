import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
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
import pageOdjects.Waiters;


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
        Waiters wait = new Waiters(driver);
        // wait for presence login link
        wait.loginLinkWaiter(UserLogin.Login);
        Thread.sleep(2000);
        UserLogin.Login_Action();
        //wait for successful login and displayed username
        wait.successfullLoginWaiter(EditProfile.username_link);
        EditProfile.username_link.click();
        EditProfile.Photo.click();
        driver.findElement(By.cssSelector("#edit-image-file-upload")).click();
        WebElement frame = driver.switchTo().activeElement();
        frame.sendKeys("D:\\AutomationJava\\RuPharna\\src\\test\\logo.jpg");
        //wait for image upload message
        wait.confirmMessageOfImageUploadWaiter(EditProfile.imageUploadMessage);
        EditProfile.imageUploadConfirm.click();

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
        wait.saveAccountWaiter(EditProfile.saveAccountMessage);
    }
}
