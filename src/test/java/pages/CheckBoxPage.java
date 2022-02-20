package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CheckBoxPage {

    public @FindBy(css = ".rct-collapse.rct-collapse-btn")
    List<WebElement> CollapseButton;
    public @FindBy(css = ".rct-icon.rct-icon-uncheck")
    List<WebElement> UncheckedCheckbox;
    public @FindBy(css = ".rct-icon.rct-icon-check")
    List<WebElement> CheckedCheckbox;
    public @FindBy(className = "text-success")
    WebElement ResultMessage;

    public CheckBoxPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

//--------------------------------------------------------


    public void clickOnCollapseButton(int i) {
        CollapseButton.get(i).click();
    }

    public int getUncheckedCheckbox(int i) {
        return UncheckedCheckbox.size();
    }

    public int getCheckedCheckbox(int i) {
        return CheckedCheckbox.size();
    }

    public void clickOnUnchecked(int i) {
        UncheckedCheckbox.get(i).click();
    }

    public String getResultMessage() {
        return ResultMessage.getText();
    }
}