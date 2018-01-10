package pageOdjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageObjectForRegistration {
    WebDriver driver;
    public String username = "testemail154@yopmail.com";
    public String password = "zPau7ZXr";
    public static WebElement element=null;
    public static WebElement Registration(WebDriver driver){
        element = driver.findElement(By.cssSelector(".grv_register_open.register"));
        return element;
    }
    public static WebElement Next1 (WebDriver driver){
        element = driver.findElement(By.cssSelector(".next_btn.first"));
        return element;
    }
    public static WebElement Surname (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_familyName"));
        return element;
    }
    public static WebElement Name (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_givenName"));
        return element;
    }
    public static WebElement MiddleName (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_middleName"));
        return element;
    }
    public void  Email (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_email"));
        element.sendKeys(username);
    }
    public static WebElement  Email_Validation (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_email"));
        return element;
    }
    public static WebElement Next2 (WebDriver driver){
        element = driver.findElement(By.cssSelector(".next_btn.second"));
        return element;
    }
    public static WebElement Primary_Address (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_municipality"));
        return element;
    }
    public static WebElement State (WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='capture_traditionalRegistration_primaryAddress_administrativeArea']/option[2]"));
        return element;
    }
    public static WebElement Next3 (WebDriver driver){
        element = driver.findElement(By.cssSelector(".next_btn.third"));
        return element;
    }
    public static WebElement Specialty (WebDriver driver){
        element = driver.findElement(By.xpath(".//*[@id='capture_traditionalRegistration_designation_specialty']/option[2] "));
        return element;
    }
    public static WebElement Gender (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_form_item_gender_Мужской_0"));
        return element;
    }
    public static WebElement Next4 (WebDriver driver){
        element = driver.findElement(By.cssSelector(".next_btn.fourth"));
        return element;
    }
    public static WebElement Phone_Number (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_phoneNumber_mobile"));
        return element;
    }
    public static WebElement Work_Place (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_workplace"));
        return element;
    }
    public static WebElement Street_Name(WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_streetOnly1"));
        return element;
    }
    public static WebElement House_Number(WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_primaryAddress_numberOnly1"));
        return element;
    }
    public static WebElement Next5(WebDriver driver){
        element = driver.findElement(By.cssSelector(".next_btn.fifth"));
        return element;
    }
    public static WebElement Password (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_traditionalRegistration_password"));
        return element;
    }
    public static WebElement Password_Confirm (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_traditionalRegistration_passwordConfirm"));
        return element;
    }
    public static WebElement CheckBox (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_acknowledgement_professional"));
        return element;
    }
    public static WebElement Create_Account_Button (WebDriver driver){
        element = driver.findElement(By.cssSelector("#capture_traditionalRegistration_createAccountButton"));
        return element;
    }
    public static WebElement Start_Quiz(WebDriver driver){
        element = driver.findElement(By.cssSelector(".quiz-start-link"));
        return element;
    }
    public static WebElement ViaGra (WebDriver driver){
        element=driver.findElement(By.xpath("//*[text()='Виагра']"));
        return element;
    }
    public static WebElement Quiz_Next_Btn (WebDriver driver){
        element = driver.findElement(By.cssSelector("#edit-next"));
        return element;
    }
    public static WebElement Uchet (WebDriver driver){
        element = driver.findElement(By.xpath("//*[text()='Предметно-количественный учет']"));
        return element;
    }
    public static WebElement Dni (WebDriver driver){
        element = driver.findElement(By.xpath("//*[text()='Нейролептики и транквилизаторы']"));
        return element;
    }
    @FindBy (css =".capture_modal_open.login")
    @CacheLookup
    public WebElement Login;
    @FindBy (id = "capture_signIn_traditionalSignIn_emailAddress")
    @CacheLookup
    public WebElement Login_Email;
    @FindBy (id = "capture_signIn_traditionalSignIn_password")
    @CacheLookup
    public WebElement Login_Password;
    @FindBy (id = "capture_signIn_traditionalSignIn_signInButton")
    @CacheLookup
    public WebElement SignIn;


    public void Login_Action (){
        Login.click();
        Login_Email.sendKeys(username);
        Login_Password.sendKeys(password);
        SignIn.click();
    }

    @FindBy(css = ".quiz-start-link")
    public WebElement quizBtn;
    @FindBy(css = ".grv_register_open.register")
    public WebElement registrationLink;
    @FindBy(id = "edit-next")
    public WebElement quizNext;
    @FindBy(css = "#capture_traditionalRegistration_form_item_email > div.capture_tip_error")
    public WebElement erroeEmail;









}
