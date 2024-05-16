package SeleniumDemo;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class DeleteCookies {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.infosys.com/");
        driver.manage().window().maximize();
        Cookie cookie = new Cookie("Company", "Rauf");
        driver.manage().addCookie(cookie);
        Set<Cookie> allCookies2 = driver.manage().getCookies();
        System.out.println("Before Deleting Cookies");
        for (Cookie c : allCookies2) {
            System.out.println(c);
        }
        System.out.println("____----------------------------------");
        System.out.println("After Deleting Of Cookies");
        /*driver.manage().deleteCookie(cookie);*/
        driver.manage().deleteCookieNamed("Company");
        Set<Cookie> allCookies3 = driver.manage().getCookies();
        System.out.println("Before Deleting Cookies");
        for (Cookie c : allCookies3) {
            System.out.println(c);

            System.out.println("Good Morning");


        }
    }
}
