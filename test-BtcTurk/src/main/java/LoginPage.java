import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    By forgotPasswordLocator=new By.ByCssSelector("li.col-md-4");
    By usernameLocator=new By.ById("Username");
    By passwordLocator= new By.ById("Password");
    By btnLoginLocator= new By.ById("btn-login");
    By alertLocator= new By.ByCssSelector("div[role=\"alert\"]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnLoginPage() {
        return isDisplayed(forgotPasswordLocator);
    }

    public void fillTheFormAndLogin() {
        typeUsername();
        typePassword();
        clickloginButton();
    }
    private void typeUsername(){
        type(usernameLocator,"sinangulseren@gmail.com");
    }

    private void typePassword(){
        type(passwordLocator,"123456789");
    }

    private void clickloginButton(){
        click(btnLoginLocator);
    }

    public boolean isAlertDisplay() {
        return isDisplayed(alertLocator);
    }
}
