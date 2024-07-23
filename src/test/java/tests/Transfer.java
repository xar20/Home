package tests;

import Actions.LoginActions;
import Actions.OverviewActions;
import Actions.TransferActions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utile.BaseTest;

public class Transfer extends BaseTest {

    private OverviewActions overview = null;
    private LoginActions login = null;
    private TransferActions transfer = null;

    @Test
    public void transferPage() {
        initTest("Transfer Page");

        login = new LoginActions(driver);
        overview = new OverviewActions(driver);
        transfer = new TransferActions(driver);

        String usernameValid = configLoader.getProperty("usernameValid");
        String passwordValid = configLoader.getProperty("passwordValid");
        String overviewaccount = configLoader.getProperty("overviewaccount");
        String TransferFunds = configLoader.getProperty("TransferFunds");
        String amount = configLoader.getProperty("amount");
        String fromAccount = configLoader.getProperty("fromAccount");
        String toAccount = configLoader.getProperty("toAccount");

        login.username(usernameValid);
        login.password(passwordValid);

        login.clickLoginButton();

        Assert.assertTrue(overview.getAccountOverview().contains(overviewaccount));

        transfer.transferButton();

        Assert.assertTrue(transfer.showForm().contains(TransferFunds));

        transfer.setAmount(amount);
        transfer.fromAccount(fromAccount);
        transfer.toAccount(toAccount);

        Assert.assertTrue(transfer.showForm().contains(TransferFunds));
    }
}
