package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ElementsPage extends BasePage {

    public WebDriver driver;
    public List<WebElement> listOfElements;
    WebElement textBox;
    WebElement checkBox;
    WebElement radioButton;
    WebElement webTables;
    WebElement buttons;
    WebElement links;
    WebElement brokenLinks;

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> listOfElements() {
        return driver.findElements(By.className("pr-1"));
    }

//-----------------

    //public WebElement getTextBox() {
    //return driver.findElement(By.);
    //}

    public WebElement getCheckBox() {
        return checkBox;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public WebElement getWebTables() {
        return webTables;
    }

    public WebElement getButtons() {
        return buttons;
    }

    public WebElement getLinks() {
        return links;
    }

    public WebElement getBrokenLinks() {
        return brokenLinks;
    }

    public void clickOnTextBox() {

        /*for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Text Box")) {
                listOfElements().get(j).click();
                break;
            }*/
    }


    public void clickOnCheckBox() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Check Box")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnRadioButton() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Radio Button")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnWebTables() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Web Tables")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnButtons() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Buttons")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnLinks() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Links")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnBrokenLinks() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Broken Links - Images")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnUploadAndDownload() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Upload and Download")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }

    public void clickOnDynamicPProperties() {
        for (int j = 0; j < listOfElements().size(); j++) {
            if (listOfElements().get(j).getText().equals("Dynamic Properties")) {
                listOfElements().get(j).click();
                break;
            }
        }
    }
}