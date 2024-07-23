package tests;

import Actions.LoginActions;
import Actions.OverviewActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class Login extends BaseTest {

    private LoginActions login = null;
    private OverviewActions overview = null;

    @Test
    public void loginPage() {

        initTest("Login Page");
        login = new LoginActions(driver);
        overview = new OverviewActions(driver);

        String error = configLoader.getProperty("error");
        String username = configLoader.getProperty("username");
        String password = configLoader.getProperty("password");
        String internalerror = configLoader.getProperty("internalerror");
        String usernameValid = configLoader.getProperty("usernameValid");
        String passwordValid = configLoader.getProperty("passwordValid");
        String overviewaccount = configLoader.getProperty("overviewaccount");

        login.clickLoginButton();

        Assert.assertTrue(login.errorUsername().equalsIgnoreCase(error));

        login.username(username);
        login.password(password);

        login.clickLoginButton();

        Assert.assertTrue(login.internalError().equalsIgnoreCase(internalerror));

        login.username(usernameValid);
        login.password(passwordValid);

        login.clickLoginButton();

        Assert.assertTrue(overview.getAccountOverview().contains(overviewaccount));
    }
}
