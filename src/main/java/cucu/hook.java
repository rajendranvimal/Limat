package cucu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hook {
	public static String URL="https://www.nykka.com";
    public static WebDriver driver;
    public static Actions act;
    @BeforeTest
    public void main() {
    	WebDriverManager.chromedriver().setup();
    	driver=new ChromeDriver();
    	act=new Actions(driver);
    	driver.manage().window().maximize();
    	driver.get(URL);
    }
    @AfterTest
    public void end() {
    	driver.quit();
    }
}
