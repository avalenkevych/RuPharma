package pageOdjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiters {
    WebDriver driver;

    public Waiters(WebDriver driver){this.driver = driver;}

    public void loginLinkWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void successfullLoginWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void confirmDeleteAccount(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void confirmMessageWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.textToBePresentInElement(elementLocator,"Ваша учётная запись была успешно удалена!"));
    }
    public void confirmMessageOfImageUploadWaiter(WebElement elementLocator) {
        WebDriverWait wait = new WebDriverWait(driver, 40);
        wait.until(ExpectedConditions.textToBePresentInElement(elementLocator,"Ваше фото изменено"));
    }
    public void saveAccountWaiter (WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.textToBePresentInElement(elementLocator, "Ваш профиль был сохранен"));
    }
    public void quizWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void registrationLinkWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void nextBtnWaiter (WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(elementLocator));
    }
    public void forgotConfirmMessageWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(elementLocator, "На адрес Вашей электронной почты была выслана ссылка с временным паролем."));
    }
    public void emailErrorWaiter(WebElement elementLocator){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBePresentInElement(elementLocator,"Адрес электронной почты: неверный формат"));
    }


}
