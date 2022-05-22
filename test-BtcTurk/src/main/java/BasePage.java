import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement find(By by){
        return driver.findElement(by);
    }

    public void click(By by){
        find(by).click();
    }

    public void type (By by,String text){
        find(by).sendKeys(text);
    }

    public boolean isDisplayed(By by){
        return find(by).isDisplayed();
    }

}
