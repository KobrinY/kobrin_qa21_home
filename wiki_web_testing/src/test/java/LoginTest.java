import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    @Test
    public void loginTest(){
        driver.get("https://en.wikipedia.org/wiki/Main_Page");
        click(By.id("pt-login"));

        click(By.id("wpName1"));
        driver.findElement(By.id("wpName1")).clear();
        driver.findElement(By.id("wpName1")).sendKeys("AnTuTu");

        click(By.id("wpPassword1"));
        driver.findElement(By.id("wpPassword1")).clear();
        driver.findElement(By.id("wpPassword1")).sendKeys("12345678");

        click(By.id("wpLoginAttempt"));


    }

    public void click(By locator) {

        driver.findElement(locator).click();
    }


}