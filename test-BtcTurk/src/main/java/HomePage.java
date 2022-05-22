import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By loginButtonLocator= new By.ByCssSelector("a[class=\"btn btn-login\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickToLoginButton() {
        click(loginButtonLocator);
    }

}
