package test;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class TestPage extends BasePage {

    MainPage mainPage;
    ElementsPage elementsPage;
    SidebarPage sidebarPage;
    TextBoxPage textBoxPage;
    RadioButtonPage radioButtonPage;
    WebTablesPage webTablesPage;

    @BeforeMethod
    public void setUpPage() {
        mainPage = new MainPage();
        elementsPage = new ElementsPage(driver);
        sidebarPage = new SidebarPage(driver);
        textBoxPage = new TextBoxPage(driver);
        radioButtonPage = new RadioButtonPage(driver);
        webTablesPage = new WebTablesPage();

        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    public void goToElements() {
        scrollIntoView(mainPage.Cards.get(0));
        mainPage.clickOnElementsButton();
    }


    @Test(priority = 10)
    public void userCanClickOnElements() throws InterruptedException {
        goToElements();

        Thread.sleep(2000);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 1, 1);
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test(priority = 20)
    public void userCanClickOnForms() throws InterruptedException {
        mainPage.clickOnFormsButton();
        Thread.sleep(2000);

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 3, 1);
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test(priority = 30)
    public void userCanClickOnAlerts() {
        mainPage.clickOnAlertsButton();

        String actualURL = driver.getCurrentUrl();
        String expectedURL = excelReader.getStringData("URL", 4, 1);
        Assert.assertEquals(actualURL, expectedURL);
    }


    @Test(priority = 40)
    public void userCanFillTextboxes() throws InterruptedException {
        String validFullName = excelReader.getStringData("Textbox", 1, 0);
        String validEmail = excelReader.getStringData("Textbox", 1, 1);
        String currentAddress = excelReader.getStringData("Textbox", 1, 2);
        String permanentAddress = excelReader.getStringData("Textbox", 1, 3);

        mainPage.clickOnElementsButton();
        sidebarPage.clickOnTextBox();
        textBoxPage.insertFullName(validFullName);
        textBoxPage.insertEmail(validEmail);
        textBoxPage.insertCurrentAddress(currentAddress);
        textBoxPage.insertPermanentAddress(permanentAddress);
        scrollIntoView(textBoxPage.Submit);
        textBoxPage.clickOnSubmit();
    }

    @Test(priority = 50)
    public void clickOnRadioButton() throws InterruptedException {
        mainPage.clickOnElementsButton();
        sidebarPage.clickOnRadioButton();

        radioButtonPage.clickYesButton();
        Assert.assertEquals("Yes", radioButtonPage.notificationText());

        radioButtonPage.clickImpressiveButton();
        Assert.assertEquals("Impressive", radioButtonPage.notificationText());
    }


    @Test(priority = 60)
    public void userCanAddDataToTable() {
        mainPage.clickOnElementsButton();
        sidebarPage.clickOnWebTables();

        for (int i = 1; i <= excelReader.getLastRowNumber(); i++) {
            String firstName = excelReader.getStringData("Users", i, 0);
            String lastName = excelReader.getStringData("Users", i, 1);
            int age = excelReader.getIntegerData("Users", i, 2);
            String email = excelReader.getStringData("Users", i, 3);
            int salary = excelReader.getIntegerData("Users", i, 4);
            String department = excelReader.getStringData("Users", i, 5);

            waitVisibility(webTablesPage.addButton);
            webTablesPage.clickOnAddButton();
            webTablesPage.inputFirstName(firstName);
            webTablesPage.inputLastName(lastName);
            webTablesPage.inputEmail(email);
            webTablesPage.inputAge(age);
            webTablesPage.inputSalary(salary);
            webTablesPage.inputDepartment(department);
            webTablesPage.clickOnSubmit();

            int j = 0;
            //Assert.assertEquals(firstName;


        }
    }
}