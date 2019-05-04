package step_definitions;

import cucumber.api.java.en.When;
import pages.RegisterPage;

public class Register {

    private RegisterPage registerPage;

    public Register(){
        this.registerPage = new RegisterPage();
    }

    @When("^Enter at Register Page in \"([^\"]*)\" value \"([^\"]*)\"$")
    public void enter_in_value(String fieldName, String value) {
        switch (fieldName){
            case "Email address":
                registerPage.enterEmail(value);
                break;
            case "Password":
                registerPage.enterPassword(value);
                break;
            case "Repeat password":
                registerPage.enterRepeatPassword(value);
                break;
            case "First name":
                registerPage.enterFirstName(value);
                break;
            case "Last name":
                registerPage.enterLastName(value);
                break;
            case "Student No":
                registerPage.enterStudentNo(value);
                break;
            case "Dormitory":
                registerPage.enterDormitory(value);
                break;
            case "Room":
                registerPage.enterRoom(value);
                break;

             default:
                 throw new IllegalArgumentException("There is no field like " + fieldName);
        }
    }

    @When("^Click at Register Page \"([^\"]*)\" Button$")
    public void click_Button(String buttonName) {
        switch (buttonName){
            case "Submit":
                registerPage.clickSubmitButton();
                break;

            default:
                throw new IllegalArgumentException("There is no button like " + buttonName);
        }
    }

}
