package Actions;

import WebElements.OverviewElements;
import org.openqa.selenium.WebDriver;

public class OverviewActions {

    private OverviewElements element = null;

    public OverviewActions(WebDriver driver)
    {
        element = new OverviewElements(driver);
    }

    public String getAccountOverview()
    {
        return element.accountOverview().getText();
    }

    public void logoutButton(){
        element.logoutButton().click();
    }


}
