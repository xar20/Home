import Actions.LoginActions;
import Actions.SimpleActions;
import org.testng.annotations.Test;
import utile.BaseTest;

public class SimpleTest extends BaseTest {

    private LoginActions login = null;


    @Test
    public void  firstTest(){

        initTest("Init Test");
        driver.get("https://parabank.parasoft.com/parabank/index.htm");

        login = new LoginActions(driver);
//        login.clickLoginButton();
    }

}
