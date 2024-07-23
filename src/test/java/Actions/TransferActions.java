package Actions;

import WebElements.TransferElements;
import org.openqa.selenium.WebDriver;

public class TransferActions {

    private TransferElements elements;

    public TransferActions(WebDriver driver){
        this.elements = new TransferElements(driver);
    }

    public void transferButton(){
        elements.transferButton().click();
    }

    public String showForm(){
        return elements.showForm().getText();
    }

    public void setAmount(String amount){
        elements.setAmount().sendKeys(amount);
    }

    public void fromAccount(String account){
        elements.fromAccount().sendKeys(account);
    }

    public void toAccount(String account){
        elements.toAccount().sendKeys(account);
    }

}
