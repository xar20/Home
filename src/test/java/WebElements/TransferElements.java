package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransferElements {

    private WebDriver driver = null;
    public TransferElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement transferButton()
    {
        return driver.findElement(By.cssSelector("#leftPanel>ul>li:nth-child(3)>a"));
    }

    public WebElement showForm()
    {
        return driver.findElement(By.cssSelector("#showForm"));
    }

    public WebElement setAmount()
    {
        return driver.findElement(By.cssSelector("#amount"));
    }

    public WebElement fromAccount()
    {
        return driver.findElement(By.cssSelector("#fromAccountId"));
    }

    public WebElement toAccount()
    {
        return driver.findElement(By.cssSelector("#toAccountId"));
    }

}
