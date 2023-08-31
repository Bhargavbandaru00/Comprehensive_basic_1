package Bhargav.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class GoogleSearchTest {

    @Test(dataProvider="data")
    @Parameters("url2")
    public void testGoogleSearch( String url2) {
        // Create a new Chrome driver.
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Banda\\eclipse\\Assignment\\Resources\\chromedriver.exe");

        // Create a new ChromeDriver instance.
        WebDriver driver = new ChromeDriver();
        driver.get(url2);

        // Verify that the Google Togo is present.
        WebElement googleLogo = driver.findElement(By.xpath("//*[@alt='Google']"));
        if (googleLogo.isDisplayed()) {
            System.out.println("The Google logo is present.");
        } else {
            System.out.println("The Google logo is not present.");
        }
        // Verify that the search text box is present.
        WebElement searchTextBox = driver.findElement(By.id("APjFqb"));
        if (searchTextBox.isDisplayed()) {
            System.out.println("The search text box is present.");
        } else {
            System.out.println("The search text box is not present.");
        }
        driver.quit();
    }

    @DataProvider(name="data")
    public Object[][] getData() {
        return new Object[][]{
            {"https://www.google.com/"},
            
        };
    }
}
