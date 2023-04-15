package web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTwo {
    public static void main(String[] args) {
        // 1 set your path by dependency.
        WebDriverManager.chromedriver().setup();
        // 2 instance
        WebDriver driver= new ChromeDriver();
        //3 to get url
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

         String actualtitle=driver.getTitle();
         String expactedtitle = "nopCommerce demo store";
         if (actualtitle.equals(expactedtitle)){
             System.out.println("Page is correct");
         }
         else {
             System.out.println("Page is incorrect");
         }
         driver.close();


    }
}
