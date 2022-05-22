import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class TryLogin extends BaseTest{

    HomePage homePage;
    LoginPage loginPage;

    @Test
    @Order(1)
    public void goToLoginPage(){
        homePage=new HomePage(driver);
        homePage.clickToLoginButton();
        loginPage=new LoginPage(driver);
        Assertions.assertTrue(loginPage.isOnLoginPage(),"Not on login page");
    }

    @Test
    @Order(2)
    public void login()  {
        loginPage.fillTheFormAndLogin();
        Assertions.assertTrue(loginPage.isAlertDisplay(),"alarm is not displayable");
    }

}
