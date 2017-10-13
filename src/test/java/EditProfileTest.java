import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class EditProfileTest {

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
    public void checkEditProfile() throws InterruptedException {
        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        WebElement email = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress"));
        email.sendKeys("testemail137@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password"));
        password.sendKeys("zPau7ZXr");
        WebElement SingIn = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton"));
        SingIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.cssSelector("#block-system-user-menu > div > ul > li > a > span.username"));
        username.click();


        WebElement photo = driver.findElement(By.xpath(".//*[@class=\"field field-name-field-profile-image field-type-image jquery-once-1-processed\"]//img\t"));
        photo.click();
        driver.findElement(By.cssSelector("#edit-image-file-upload")).click();
        WebElement frame = driver.switchTo().activeElement();
        frame.sendKeys("D:\\AutomationJava\\RuPharna-master\\src\\test\\logo.jpg");


        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#image-popup > div"),"Ваше фото изменено"));
        driver.findElement(By.xpath(".//html/body/div[6]/div[3]/div/button")).click();








        WebElement changedata = driver.findElement(By.cssSelector("#mini-panel-private_cabinet > div > div > div.inside.panels-flexible-row-inside.panels-flexible-row-new-main-row-inside.panels-flexible-row-inside-first.clearfix > div > div > div.name-update-data > a"));
        changedata.click();

        WebElement name_upd = driver.findElement(By.cssSelector("#capture_editProfile_givenName"));
        name_upd.clear();
        name_upd.sendKeys("Name Updated");

        WebElement surname_upd = driver.findElement(By.cssSelector("#capture_editProfile_familyName"));
        surname_upd.clear();
        surname_upd.sendKeys("Surname Updated");

        WebElement middlename_upd = driver.findElement(By.cssSelector("#capture_editProfile_middleName"));
        middlename_upd.clear();
        middlename_upd.sendKeys("MiddleName Updated");

        WebElement PrimaryAddress_upd = driver.findElement(By.cssSelector("#capture_editProfile_primaryAddress_municipality"));
        PrimaryAddress_upd.clear();
        PrimaryAddress_upd.sendKeys("Санкт-Петербург");

       // WebElement click = driver.findElement(By.xpath(".//*[@id='select2-capture_editProfile_primaryAddress_administrativeArea-container']"));
        //click.clear();
        //click.click();
        //WebElement Specialty = driver.findElement(By.xpath(".//*[@id='select2-capture_editProfile_designation_specialty-container']"));
        //Specialty.click();

        WebElement PhoneNumber_upd = driver.findElement(By.cssSelector("#capture_editProfile_phoneNumber_mobile"));
        PhoneNumber_upd.clear();
        PhoneNumber_upd.sendKeys("+79997654321");
        WebElement WorkPlace_upd = driver.findElement(By.cssSelector("#capture_editProfile_primaryAddress_workplace"));
        WorkPlace_upd.clear();
        WorkPlace_upd.sendKeys("МГУ");
        WebElement StreetName_upd = driver.findElement(By.cssSelector("#capture_editProfile_primaryAddress_streetName1"));
        StreetName_upd.clear();
        StreetName_upd.sendKeys("ул. Ломоносова 85");

        WebElement checkbox = driver.findElement(By.cssSelector("#capture_editProfile_emailPermission_subscribed_true_0"));
        checkbox.click();

        WebElement save_btn = driver.findElement(By.cssSelector("#capture_editProfile_saveButton"));
        save_btn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, 5);
        wait1.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[text()=\"Ваш профиль был сохранен.\"]"), "Ваш профиль был сохранен"));

        Thread.sleep(10000);

    }
    @Test
    public void aaa() throws InterruptedException {
        WebElement Login = driver.findElement(By.cssSelector(".capture_modal_open.login"));
        Login.click();
        WebElement email = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_emailAddress"));
        email.sendKeys("testemail139@yopmail.com");
        WebElement password = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_password"));
        password.sendKeys("zPau7ZXr");
        WebElement SingIn = driver.findElement(By.cssSelector("#capture_signIn_traditionalSignIn_signInButton"));
        SingIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.cssSelector("#block-system-user-menu > div > ul > li > a > span.username"));
        username.click();
        WebElement photo = driver.findElement(By.xpath(".//*[@class=\"field field-name-field-profile-image field-type-image jquery-once-1-processed\"]//img\t"));
        photo.click();
        driver.findElement(By.cssSelector("#edit-image-file-upload")).click();
        WebElement frame = driver.switchTo().activeElement();
        frame.sendKeys("D:\\AutomationJava\\RuPharna-master\\src\\test\\logo.jpg");


        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("#image-popup > div"),"Ваше фото изменено"));
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/button/span"));


        //Thread.sleep(10000);
    }
}
