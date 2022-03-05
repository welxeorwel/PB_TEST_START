import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PhoneBookTests {
    WebDriver wd;
    @BeforeMethod
    public void openSite (){
    wd = new ChromeDriver();
    wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
    wd.manage().window().maximize();

    }
    @Test
    public void phoneBookstart(){

    //WebElement element = wd.findElement(By.linkText("HOME"));
    //element.click();
    //WebElement element1 = wd.findElement(By.partialLinkText("AB"));
    //element1.click();


    }
    @Test
    public void home(){
        wd = new ChromeDriver();
        wd.navigate().to(" https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        // wd.findElement(By.tagName());

        WebElement el1 = wd.findElement(By.tagName("body"));
        WebElement el2 = wd.findElement(By.tagName("div"));
        WebElement el3 = wd.findElement(By.tagName("h1"));
        WebElement el7 = wd.findElement(By.tagName("a"));
        WebElement el4 = wd.findElement(By.tagName("input"));
        WebElement el5 = wd.findElement(By.tagName("br"));
        WebElement el6 = wd.findElement(By.tagName("button"));


        // wd.findElement(By.id());
        WebElement el8 = wd.findElement(By.id("root"));
        // By.className
        WebElement el9 = wd.findElement(By.className("container"));
        WebElement el10 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el11 = wd.findElement(By.className("active"));
        WebElement el12 = wd.findElement(By.className("login_login__3EHKB"));


        // byLinkText /// HOME,ABOUT,LOGIN,FVMLFBM,EEE,22R,DFG,GHH,FGHH,THH
        WebElement el13 = wd.findElement(By.linkText("HOME"));
        WebElement el14 = wd.findElement(By.linkText("ABOUT"));
        WebElement el15 = wd.findElement(By.linkText("LOGIN"));
        WebElement el16 = wd.findElement(By.partialLinkText("HO"));

    }


    @Test
    public void cssLocatorTest(){
        wd = new ChromeDriver();
        wd.navigate().to(" https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

        wd.findElement(By.cssSelector(""));
        // by tag name
        wd.findElement(By.cssSelector("div"));
        wd.findElement(By.cssSelector("a"));
        // by class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));
        // by id
        wd.findElement(By.cssSelector("#root"));
        // атрибут
        wd.findElement(By.cssSelector("[placeholder]"));
        wd.findElement(By.cssSelector("[placeholder='Password']"));
        wd.findElement(By.cssSelector("[placeholder *='ss']"));
        wd.findElement(By.cssSelector("[placeholder ^='Pa']"));
        wd.findElement(By.cssSelector("[placeholder $='rd']"));

    }
    @AfterMethod
    public void close(){

    }

}
