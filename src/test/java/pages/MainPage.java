package pages;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage extends BasePage {

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public @FindBy(css = ".card.mt-4.top-card")
    List<WebElement> Cards;

    //-----------------------------------------

    public void clickOnElementsButton() {
        Cards.get(0).click();
    }

    public void clickOnFormsButton() {
        Cards.get(1).click();
    }

    public void clickOnAlertsButton() {
        Cards.get(2).click();
    }

    public void clickOnWidgetsButton() {
        Cards.get(3).click();
    }

    public void clickOnInteractionsButton() {
        Cards.get(4).click();
    }

    public void clickOnBookStoreButton() {
        Cards.get(5).click();
    }
}


  /*public WebDriver driver;
  public List<WebElement> listOfCards;

  public MainPage(WebDriver driver) {
    this.driver = driver;
  }

  public List<WebElement> listOfCards() {
    return driver.findElements(By.cssSelector(".card.mt-4.top-card"));
  }

  public WebElement findElementByName(String name) {
    for (int j = 0; j < listOfCards().size(); j++) {
      if (listOfCards().get(j).getText().equals(name)) {
        return listOfCards().get(j);
      }
    }
    return null;
  }

  //--------------------------------------

  public void clickOnElements() {
    for (int j = 0; j < listOfCards().size(); j++) {
      if (listOfCards().get(j).getText().equals("Elements")) {
        listOfCards().get(j).click();
        break;
      }
    }
  }
*/