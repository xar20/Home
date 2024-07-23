package tests;

import Actions.LoginActions;
import Actions.OverviewActions;
import Actions.SimpleActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class Overview extends BaseTest {

    private SimpleActions index = null;
    private OverviewActions overview = null;
    private LoginActions login = null;

    @Test
    public void overviewPage(){
        initTest("Overview Page");
        index = new SimpleActions(driver);
        login = new LoginActions(driver);
        overview = new OverviewActions(driver);

        String usernameValid = configLoader.getProperty("usernameValid");
        String passwordValid = configLoader.getProperty("passwordValid");
        String overviewaccount = configLoader.getProperty("overviewaccount");
        String CustomerLogin = configLoader.getProperty("CustomerLogin");

        login.username(usernameValid);
        login.password(passwordValid);

        login.clickLoginButton();

        Assert.assertTrue(overview.getAccountOverview().contains(overviewaccount));

        overview.logoutButton();

        Assert.assertTrue(index.getCustomerLoginText().equalsIgnoreCase(CustomerLogin));
    }

}
