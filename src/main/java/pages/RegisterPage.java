package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {

    private static final By selectorEmailInput = By.xpath("//input[@id='email']");
    private static final By selectorPasswordInput = By.xpath("//input[@id='password']");
    private static final By selectorRepeatPasswordInput = By.xpath("//input[@id='repeat_password']");
    private static final By selectorFirstNameInput = By.xpath("//input[@id='first_name']");
    private static final By selectorLastNameInput = By.xpath("//input[@id='last_name']");
    private static final By selectorStudentNoInput = By.xpath("//input[@id='student_no']");
    private static final By selectorDormitoryInput = By.xpath("//input[@id='dormitory']");
    private static final By selectorRoomInput = By.xpath("//input[@id='room']");

    private static final By selectorSubmitButton = By.xpath("//button[@type='submit']");

    public void enterEmail(String email){
        getDriver().findElement(selectorEmailInput).sendKeys(email);
    }

    public void enterPassword(String password){
        getDriver().findElement(selectorPasswordInput).sendKeys(password);
    }

    public void enterRepeatPassword(String repeatPassword){
        getDriver().findElement(selectorRepeatPasswordInput).sendKeys(repeatPassword);
    }

    public void enterFirstName(String firstName){
        getDriver().findElement(selectorFirstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        getDriver().findElement(selectorLastNameInput).sendKeys(lastName);
    }

    public void enterStudentNo(String studentNo){
        getDriver().findElement(selectorStudentNoInput).sendKeys(studentNo);
    }

    public void enterDormitory(String dormitory){
        getDriver().findElement(selectorDormitoryInput).sendKeys(dormitory);
    }

    public void enterRoom(String room){
        getDriver().findElement(selectorRoomInput).sendKeys(room);
    }

    public void clickSubmitButton(){
        getDriver().findElement(selectorSubmitButton).click();
    }
}
