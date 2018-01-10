package pageOdjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.xml.sax.Locator;

public class POF_EditProfile {
    public WebDriver driver;
    @FindBy(how = How.CSS, using = "#block-system-user-menu > div > ul > li > a > span.username")
    public WebElement username_link;
    @FindBy(how = How.XPATH,using = ".//*[@class=\"field field-name-field-profile-image field-type-image jquery-once-1-processed\"]//img\t")
    public WebElement Photo;
    @FindBy(css = "#mini-panel-private_cabinet > div > div > div.inside.panels-flexible-row-inside.panels-flexible-row-new-main-row-inside.panels-flexible-row-inside-first.clearfix > div > div > div.name-update-data > a")
    public WebElement ChangeData_Btn;
    @FindBy(css ="#capture_editProfile_givenName")
    public WebElement Name_Upd ;
    @FindBy(css="#capture_editProfile_familyName")
    public WebElement Surname_Upd;
    @FindBy(css="#capture_editProfile_middleName")
    public WebElement MiddleName_Upd;
    @FindBy(id="capture_editProfile_primaryAddress_municipality")
    public WebElement PrimaryAddress_Upd;
    @FindBy(id="capture_editProfile_phoneNumber_mobile")
    public WebElement Phone_Upd;
    @FindBy(id="capture_editProfile_primaryAddress_workplace")
    public WebElement Work_Upd;
    @FindBy(id="capture_editProfile_primaryAddress_streetName1")
    public WebElement Street_Upd;
    @FindBy(id="capture_editProfile_emailPermission_subscribed_true_0")
    public WebElement Checkbox;
    @FindBy(id="capture_editProfile_saveButton")
    public WebElement Save_Btn;
    @FindBy(css="#delete-account-link-wrapper > a")
    public WebElement Delete_Btn;
    @FindBy(id="edit-submit")
    public WebElement confirmDeleteAccountBtn;
    @FindBy(xpath = ".//*[@class=\"messages status\"]\t")
    public WebElement confirmMessage;
    @FindBy(css="#image-popup > div")
    public WebElement imageUploadMessage;
    @FindBy (xpath = ".//*[text()=\"Ok, спасибо\"]")
    public WebElement imageUploadConfirm;
    @FindBy(xpath = ".//*[text()=\"Ваш профиль был сохранен.\"]")
    public WebElement saveAccountMessage;


    public void Update_Name_Action (String sName){
        Name_Upd.clear();
        Name_Upd.sendKeys(sName);
        Assert.assertEquals(Name_Upd.getAttribute("value"), "Name updated");
    }
    public void Update_Surname_Action (String sSurname){
        Surname_Upd.clear();
        Surname_Upd.sendKeys(sSurname);
        Assert.assertEquals(Surname_Upd.getAttribute("value"), "Surname updated");
    }
    public void Update_MidName_Action (String sMidName){
        MiddleName_Upd.clear();
        MiddleName_Upd.sendKeys(sMidName);
        Assert.assertEquals(MiddleName_Upd.getAttribute("value"), "Middlename updated");
    }
    public void Update_Address_Action (String sAddress){
        PrimaryAddress_Upd.clear();
        PrimaryAddress_Upd.sendKeys(sAddress);
        Assert.assertEquals(PrimaryAddress_Upd.getAttribute("value"), "Санкт-петербург");
    }
    public void Update_Phone_Action (String sPhone){
        Phone_Upd.clear();
        Phone_Upd.sendKeys(sPhone);
        Assert.assertEquals(Phone_Upd.getAttribute("value"), "+79997654321");
    }
    public void Update_Work_Action (String sWork){
        Work_Upd.clear();
        Work_Upd.sendKeys(sWork);
            Assert.assertEquals(Work_Upd.getAttribute("value"), "МГУ");
    }
    public void Update_Street_Action (String sStreet){
        Street_Upd.clear();
        Street_Upd.sendKeys(sStreet);
        Assert.assertEquals(Street_Upd.getAttribute("value"), "ул. Ломоносова 85");
    }



    /*public void Upload_Image_Action(String sImage){
        uploadImageBtn.click();

        uploadImageBtn.sendKeys(sImage);
    }*/







}
