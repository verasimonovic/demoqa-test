package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebTablesPage extends BasePage {
    public WebTablesPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    @FindBy(id = "searchBox")
    public WebElement searchBox;

    @FindBy(id = "mr-2")
    public List<WebElement> EditButton;

    @FindBy(xpath = "//*[@id=\"delete-record-1\"]/svg/path")
    public WebElement DeleteButton;

    @FindBy(id = "firstName")
    public WebElement FirstName;

    @FindBy(id = "lastName")
    public WebElement LastName;

    @FindBy(id = "age")
    public WebElement Age;

    @FindBy(id = "userEmail")
    public WebElement Email;

    @FindBy(id = "salary")
    public WebElement Salary;

    @FindBy(id = "department")
    public WebElement Department;

    @FindBy(id = "submit")
    public WebElement SubmitButton;

    //-------------------------------

    public void clickOnAddButton() {
        addButton.click();
    }

    public void clickOnDeleteButton() {
        DeleteButton.click();
    }

    public void clickOnEdit(int i) {
        EditButton.get(i).click();
    }

    public void inputFirstName(String firstname) {
        FirstName.clear();
        FirstName.sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        LastName.clear();
        LastName.sendKeys(lastname);
    }

    public void inputEmail(String email) {
        Email.clear();
        Email.sendKeys(email);
    }

    public void inputAge(int age) {
        Age.clear();
        Age.sendKeys(String.valueOf(age));
    }

    public void inputSalary(int salary) {
        Salary.clear();
        Salary.sendKeys(String.valueOf(salary));
    }

    public void inputDepartment(String department) {
        Department.clear();
        Department.sendKeys(department);
    }

    public void clickOnSubmit() {
        SubmitButton.click();
    }


}


