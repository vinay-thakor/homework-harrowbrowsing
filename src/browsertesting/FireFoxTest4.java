package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxTest4 {
    public static void main(String[] args) {
        String Urlvin2 = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Urlvin2);
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}



