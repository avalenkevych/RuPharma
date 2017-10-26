package pageOdjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POF_ForgotPsw {
    @FindBy(css = "#capture_signIn_userInformationForm > div.capture_form_item2 > a.grv-ru-ru")
    public WebElement forgotPswLink;
    @FindBy(id = "capture_forgotPassword_traditionalSignIn_emailAddress")
    public WebElement forgotEmail;
    @FindBy(id = "capture_forgotPassword_forgotPassword_sendButton")
    public WebElement forgotSentBtn;
    @FindBy(css = "#forgotPasswordSuccess > div > p.grv-ru-ru")
    public WebElement forgotConfMessage;
    @FindBy(css = "#capture_signIn_form_item_traditionalSignIn_emailAddress > div.capture_tip_error")
    public WebElement emailError;
    @FindBy(xpath = ".//*[text()=\"Необходимо ввести пароль\"]")
    public WebElement passwordError;
}
