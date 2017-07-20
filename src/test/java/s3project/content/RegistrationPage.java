package s3project.content;

import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;
import s3project.configuration.DriverFactory;

/**
 * Created by KarkowsT on 2017-07-09.
 */
@Component
public class RegistrationPage {


    public RegistrationPage(){
        PageFactory.initElements(this.getDriver(), this);
    }

    protected WebDriver getDriver() {
        return DriverFactory.getInstance().getDriver();
    }

    @FindBy(className = "validation_error")
    private WebElement labValidationMessage;

    @FindBy(id = "input_2_1_3")
    private WebElement txtFirstName;

    @FindBy(id = "input_2_1_6")
    private WebElement txtLastName;

    @FindBy(id = "input_2_2")
    private WebElement txtCompany;

    @FindBy(id = "input_2_3")
    private WebElement txtJobTitle;

    @FindBy(id = "input_2_4")
    private WebElement txtEmail;

    @FindBy(id = "input_2_5")
    private WebElement txtPassword;

    @FindBy(id = "input_2_5_2")
    private WebElement txtConfirmPassword;

    @FindBy(id = "input_2_6_1")
    private WebElement txtStreetAddress;

    @FindBy(id = "input_2_6_4")
    private WebElement txtStateAddress;

    @FindBy(id = "input_2_6_3")
    private WebElement txtCityAddress;

    @FindBy(id = "input_2_6_5")
    private WebElement txtPostCodeAddress;

    @FindBy(id = "input_2_6_6")
    private WebElement selCountryAddress;

    @FindBy(id = "input_2_7")
    private WebElement txtPhone;

    @FindBy(id = "gform_submit_button_2")
    private WebElement btnRegister;

    @FindBy(className = "validation_error")
    private WebElement etErrorMessage;

    public void openRegistrationPage(){
        this.getDriver().get("https://www.s3group.com/register/?came_from_url=http://www.s3group.com/");
    }

    public void setFirstName(String firstName){
        this.txtFirstName.clear();
        this.txtFirstName.sendKeys(firstName);

    }

    public void setLastName(String lastName){
        this.txtLastName.clear();
        this.txtLastName.sendKeys(lastName);

    }

    public void setCompany(String company){
        this.txtCompany.clear();
        this.txtCompany.sendKeys(company);
    }

    public void setJobTitle(String job){
        this.txtJobTitle.clear();
        this.txtJobTitle.sendKeys(job);

    }

    public void setEmail(String email){
        this.txtEmail.clear();
        this.txtEmail.sendKeys(email);
    }

    public void setPassword(String password){
        this.txtPassword.clear();
        this.txtPassword.sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        this.txtConfirmPassword.clear();
        this.txtConfirmPassword.sendKeys(confirmPassword);
    }

    public void setStreetAddress(String streetAddress){
        this.txtStreetAddress.clear();
        this.txtStreetAddress.sendKeys(streetAddress);
    }

    public void setStateAddress(String stateAddress){
        this.txtStateAddress.clear();
        this.txtStateAddress.sendKeys(stateAddress);
    }

    public void setCityAddress(String cityAddress){
        this.txtCityAddress.clear();
        this.txtCityAddress.sendKeys(cityAddress);
    }

    public void setPostCodeAddress(String postCodeAddress){
        this.txtPostCodeAddress.clear();
        this.txtPostCodeAddress.sendKeys(postCodeAddress);
    }

    public void setCountryAddress(String countryAddress){
        new Select(this.selCountryAddress).selectByVisibleText(countryAddress);
    }

    public void setPhone(String phone){
        this.txtPhone.clear();
        this.txtPhone.sendKeys(phone);
    }

    public void clickRegister(){
        this.btnRegister.submit();
    }

    public String getValidationMessage(){

        return  this.getDriver().findElement(By.className("validation_error")).getText();

    }
}
