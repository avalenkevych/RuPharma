import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageOdjects.POF_EditProfile;
import pageOdjects.PageObjectForRegistration;
import pageOdjects.Waiters;

import java.util.concurrent.TimeUnit;

public class AccountDelationTest {

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
    public void checkAccountDeletion(){
        PageObjectForRegistration UserLogin = PageFactory.initElements(driver, PageObjectForRegistration.class);
        POF_EditProfile EditProfile = PageFactory.initElements(driver,POF_EditProfile.class);
        Waiters wait = new Waiters(driver);
        //wait for presence login link
        wait.loginLinkWaiter(UserLogin.Login);
        UserLogin.Login_Action();
        //wait for successful login and displayed username
        wait.successfullLoginWaiter(EditProfile.username_link);
        EditProfile.username_link.click();
        EditProfile.ChangeData_Btn.click();
        EditProfile.Delete_Btn.click();
        // wait for delete account button
        wait.confirmDeleteAccount(EditProfile.confirmDeleteAccountBtn);
        EditProfile.confirmDeleteAccountBtn.click();
        // wait for confirmation message of account deletion
        wait.confirmMessageWaiter(EditProfile.confirmMessage);

    }
}
