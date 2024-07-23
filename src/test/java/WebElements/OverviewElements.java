package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewElements {

    private WebDriver driver = null;

    public OverviewElements(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement accountOverview()
    {
        return driver.findElement(By.cssSelector("#showOverview"));
    }

    public WebElement logoutButton()
    {
        return driver.findElement(By.cssSelector("#leftPanel>ul>li:nth-child(8)>a"));
    }



}
