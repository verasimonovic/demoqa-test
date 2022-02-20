package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RadioButtonPage {

    public WebDriver driver;

    public @FindBy(id = "yesRadio")
    WebElement YesButton;
    public @FindBy(id = "impressiveRadio")
    WebElement ImpressiveButton;
    public @FindBy(id = "noRadio")
    WebElement NoButton;
    public @FindBy(className = "mb-3")
    List<WebElement> Notifications;
    public @FindBy(className = "text-success")
    WebElement Notification;

    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //-----------------------------

    public void clickYesButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", YesButton);
    }

    public void clickImpressiveButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", ImpressiveButton);
    }

    public void clickNoButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", NoButton);
    }

    public String notificationText() {
        return Notification.getText();
    }

    public String notificationsText(int i) {
        return Notifications.get(i).getText();
    }

}
