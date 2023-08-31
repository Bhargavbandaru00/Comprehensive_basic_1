package Bhargav.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class W3SchoolsTest {

    @Test(dataProvider="data")
    @Parameters("url")
    public void testW3Schools( String url) {
        // Set the webdriver.chrome.driver system property.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banda\\eclipse\\Assignment\\Resources\\chromedriver.exe");

        // Create a new ChromeDriver instance.
        WebDriver driver = new ChromeDriver();

        // Open the Google website.
        driver.get(url);

        // Verify that the URL of the current page is https://www.w3schools.com/
        String currentURL = driver.getCurrentUrl();
        assert currentURL.equals(url);

        // Close the browser.
        driver.quit();
    }

    @DataProvider(name="data")
    public Object[][] getData() {
        return new Object[][]{
            {"https://www.w3schools.com/"},
            {"https://www.google.com/"}
        };
    }
}
