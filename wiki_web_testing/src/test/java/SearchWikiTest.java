import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchWikiTest {
    WebDriver driver;

@Test
public void OpenWiki(){
    driver = new ChromeDriver();
    driver.get("https://www.wikipedia.org");
    driver.findElement(By.name("search")).click();
    }
}
