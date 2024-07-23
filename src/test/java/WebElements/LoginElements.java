package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElements {

    private WebDriver driver = null;
    public LoginElements(WebDriver driver){
        this.driver = driver;
    }

    public WebElement loginButton()
    {
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button']"));
        return loginButton;
    }

    public WebElement errorUsername(){
        return driver.findElement(By.className("error"));
    }

    public WebElement username(){
        return driver.findElement(By.name("username"));
    }

    public WebElement password(){
        return driver.findElement(By.name("password"));
    }

    public WebElement internalError(){
        return driver.findElement(By.className("error"));
    }
}
