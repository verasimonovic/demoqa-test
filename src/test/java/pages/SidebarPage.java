package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SidebarPage {

    public @FindBy(id = "item-0")
    WebElement TextBox;
    public @FindBy(id = "item-1")
    WebElement CheckBox;
    public @FindBy(id = "item-2")
    WebElement RadioButton;
    public @FindBy(id = "item-3")
    WebElement WebTables;
    public @FindBy(id = "item-4")
    WebElement Buttons;
    public @FindBy(id = "item-5")
    WebElement Links;
    public @FindBy(id = "item-6")
    WebElement BrokenLinks;
    public @FindBy(id = "item-7")
    WebElement UploadAndDownload;
    public @FindBy(id = "item-8")
    WebElement DynamicProperties;

    public SidebarPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //--------------------------------------

    public void clickOnTextBox() {
        TextBox.click();
    }

    public void clickOnCheckBox() {
        CheckBox.click();
    }

    public void clickOnRadioButton() {
        RadioButton.click();
    }

    public void clickOnWebTables() {
        WebTables.click();
    }

    public void clickOnButtons() {
        Buttons.click();
    }

    public void clickOnLinks() {
        Links.click();
    }

    public void clickOnBrokenLinks() {
        BrokenLinks.click();
    }

    public void clickOnUploadAndDownload() {
        UploadAndDownload.click();
    }

    public void clickOnDynamicProperties() {
        DynamicProperties.click();
    }
}
