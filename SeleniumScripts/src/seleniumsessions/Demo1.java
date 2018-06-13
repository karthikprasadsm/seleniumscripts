package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.google.com");
        driver.close();
        
        
        System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("http://www.google.com");
        driver1.close();
        System.out.println("Ashok Kumar");
        
	}

}
