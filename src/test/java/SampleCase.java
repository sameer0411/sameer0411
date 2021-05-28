import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleCase {

    @Test
    public void test1(){

        System.setProperty("webdriver.chrome.driver","D:\\Sameer\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.close();
    }
}
