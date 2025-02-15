package testPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void setUp ()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
    }
}
