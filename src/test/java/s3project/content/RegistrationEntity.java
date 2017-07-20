package s3project.content;

import lombok.Builder;
import lombok.Data;

/**
 * Created by KarkowsT on 2017-07-09.
 */
@Data
@Builder
public class RegistrationEntity {
    private String lastName;
    private String firstName;
    private String company;
    private String jobTitle;
    private String email;
    private String password;
    private String confirmPassword;
    private String address;
    private String streetAddress;
    private String stateAddress;
    private String cityAddress;
    private String postCode;
    private String country;
    private String phone;
    private String validationMessage = "There was a problem with your submission. Errors have been highlighted below.";
}
