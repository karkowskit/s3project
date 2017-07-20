package s3project.content;


import com.google.common.base.Objects;

/**
 * Created by KarkowsT on 2017-07-09.
 */
public class RegistrationEntityFactory {

    public RegistrationEntity registrationEntity(String testCase){
        RegistrationEntity someRegistrationEntity = this.someCorectRegistrationEntity();

        if(Objects.equal(testCase, "empty frist name")){
            someRegistrationEntity.setFirstName(null);
        }
        if(Objects.equal(testCase, "empty last name")){
            someRegistrationEntity.setLastName(null);
        }
        if(Objects.equal(testCase, "empty company")){
            someRegistrationEntity.setCompany(null);
        }
        if(Objects.equal(testCase, "empty job title")){
            someRegistrationEntity.setJobTitle(null);
        }
        if(Objects.equal(testCase, "empty email")){
            someRegistrationEntity.setEmail(null);
        }
        if(Objects.equal(testCase, "empty password")){
            someRegistrationEntity.setPassword(null);
        }
        if(Objects.equal(testCase, "empty confirm password")){
            someRegistrationEntity.setConfirmPassword(null);
        }
        if(Objects.equal(testCase, "empty street address")){
            someRegistrationEntity.setStreetAddress(null);
        }
        if(Objects.equal(testCase, "empty city address")){
            someRegistrationEntity.setCityAddress(null);
        }
        if(Objects.equal(testCase, "empty state address")){
            someRegistrationEntity.setStateAddress(null);
        }
        if(Objects.equal(testCase, "empty country address")){
            someRegistrationEntity.setCountry(null);
        }
        if(Objects.equal(testCase, "empty phone")){
            someRegistrationEntity.setPhone(null);
        }

        return someRegistrationEntity;
    }

    private RegistrationEntity someCorectRegistrationEntity(){
        return  RegistrationEntity
                .builder()
                .firstName("John")
                .lastName("Nowak")
                .company("Company")
                .jobTitle("Job title")
                .email("john.nowak@company.pl")
                .password("password")
                .confirmPassword("password")
                .streetAddress("street")
                .stateAddress("sate address")
                .cityAddress("city")
                .stateAddress("state")
                .postCode("54123")
                .country("Albania")
                .phone("643512453")
                .build();

    }
}
