package Actions;

import WebElements.LoginElements;
import org.openqa.selenium.WebDriver;

public class LoginActions {

    private LoginElements element;

    public LoginActions(WebDriver driver){
        this.element = new LoginElements(driver);
    }

    public void clickLoginButton(){
        element.loginButton().click();
    }

    public String errorUsername(){
        return element.errorUsername().getText();
    }

    public void username(String username)
    {
        element.username().sendKeys(username);
    }

    public void password(String password)
    {
        element.password().sendKeys(password);
    }

    public String internalError(){
        return element.internalError().getText();
    }
}
