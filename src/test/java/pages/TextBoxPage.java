package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TextBoxPage {

    public @FindBy(id = "userName")
    WebElement Fullname;
    public @FindBy(id = "userEmail")
    WebElement Email;
    public @FindBy(id = "currentAddress")
    WebElement CurrentAddress;
    public @FindBy(id = "permanentAddress")
    WebElement PermanentAddress;
    public @FindBy(id = "submit")
    WebElement Submit;
    public @FindBy(id = "mb-1")
    List<WebElement> Output;

    public TextBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //--------------------------------

    public void insertFullName(String fullname) {
        Fullname.clear();
        Fullname.sendKeys(fullname);
    }

    public void insertEmail(String email) {
        Email.sendKeys(email);
    }

    public void insertCurrentAddress(String currentAddress) {
        CurrentAddress.sendKeys(currentAddress);
    }

    public void insertPermanentAddress(String permanentAddress) {
        PermanentAddress.sendKeys(permanentAddress);
    }

    public String outputText(int i) {
        return Output.get(i).getText();
    }

    public void clickOnSubmit() {
        Submit.click();
    }
}

