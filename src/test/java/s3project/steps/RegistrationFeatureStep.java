package s3project.steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import s3project.configuration.DriverFactory;
import s3project.configuration.TestApplication;
import s3project.content.RegistrationController;
import s3project.content.RegistrationEntity;
import s3project.content.RegistrationEntityFactory;


/**
 * Created by KarkowsT on 2017-07-09.
 */
@ContextConfiguration(classes = TestApplication.class)
public class RegistrationFeatureStep {
    @Autowired
    private RegistrationController registrationController;

    @Given("^registration form$")
    public void registrationForm(){
        registrationController.goToRegistrationPage();

    }

    @When("^user push form with wrong data - (.*)$")
    public void userPushFormWithWrongData(String testCase){
        registrationController.pushRegistartionForm(
                new RegistrationEntityFactory().registrationEntity(testCase)
        );

    }

    @Then("^page presents validation message - (.*)$")
    public void pagePresentsValidationMessage(String testCase){
        registrationController.checkValidationMessage(testCase);

    }




}
