import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;


    @Test
    public void Homework() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/welxeor/Downloads/index.html");
        wd.manage().window().maximize();
        //Items
        WebElement element1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement element2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement element3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement element4 = wd.findElement(By.cssSelector("[href='#item4']"));
        //Fills
        WebElement inputFill1 = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputFill2 = wd.findElement(By.cssSelector("[name='surename']"));
        //Button
        WebElement button = wd.findElement(By.cssSelector("div.container .btn"));

        //Europe
        WebElement tableEl1 = wd.findElement(By.cssSelector("tr:first-child td:nth-child(1)"));
        WebElement tableEl2 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(1)"));
        WebElement tableEl3 = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(1)"));
        WebElement tableEl4 = wd.findElement(By.cssSelector("tr:last-child td:nth-child(1)"));
        //Asia
        WebElement tableEl5 = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement tableEl6 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement tableEl7 = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement tableEl8 = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        //America
        WebElement tableEl9 = wd.findElement(By.cssSelector("tr:first-child td:nth-child(3)"));
        WebElement tableEl10 = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(3)"));
        WebElement tableEl11 = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(3)"));
        WebElement tableEl12 = wd.findElement(By.cssSelector("tr:last-child td:nth-child(3)"));

        WebElement alert = wd.findElement(By.cssSelector("#alert"));
    }
    @AfterMethod
    public void close(){
        wd.close();
    }
}
