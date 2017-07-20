package s3project.content;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by KarkowsT on 2017-07-09.
 */
@Component
public class RegistrationController {

    @Autowired
    private RegistrationPage registrationPage;

    public void goToRegistrationPage() {
        registrationPage.openRegistrationPage();
    }

    public void pushRegistartionForm(RegistrationEntity registrationEntity) {
        if(registrationEntity.getFirstName() != null) {
            registrationPage.setFirstName(registrationEntity.getFirstName());
        }
        if(registrationEntity.getLastName() != null) {
            registrationPage.setLastName(registrationEntity.getLastName());
        }
        if(registrationEntity.getCompany() != null) {
            registrationPage.setCompany(registrationEntity.getCompany());
        }
        if(registrationEntity.getJobTitle() != null) {
            registrationPage.setJobTitle(registrationEntity.getJobTitle());
        }
        if(registrationEntity.getEmail() != null) {
            registrationPage.setEmail(registrationEntity.getEmail());
        }
        if(registrationEntity.getPassword() != null) {
            registrationPage.setPassword(registrationEntity.getPassword());
        }
        if(registrationEntity.getConfirmPassword() != null) {
            registrationPage.setConfirmPassword(registrationEntity.getConfirmPassword());
        }
        if(registrationEntity.getStateAddress() != null){
            registrationPage.setStateAddress(registrationEntity.getStateAddress());
        }

        if(registrationEntity.getStreetAddress() != null) {
            registrationPage.setStreetAddress(registrationEntity.getStreetAddress());
        }
        if(registrationEntity.getCityAddress() != null) {
            registrationPage.setCityAddress(registrationEntity.getCityAddress());
        }
        if(registrationEntity.getPostCode() != null) {
            registrationPage.setPostCodeAddress(registrationEntity.getPostCode());
        }
        if(registrationEntity.getCountry()!= null) {
            registrationPage.setCountryAddress(registrationEntity.getCountry());
        }
        if(registrationEntity.getPhone() != null) {
            registrationPage.setPhone(registrationEntity.getPhone());
        }
        registrationPage.clickRegister();
    }

    public void checkValidationMessage(String testCase) {
        System.out.println(RegistrationEntity
                .builder()
                .build().getValidationMessage());
        assertThat(registrationPage.getValidationMessage()).isEqualTo(
                                                                "There was a problem with your submission. Errors have been highlighted below."

                                                            );
    }
}
