import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TableTest {
    WebDriver wd;

    @Test
    public void xPassTests() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/welxeor/Downloads/index.html");
        wd.manage().window().maximize();
        //Items
        WebElement item1 = wd.findElement(By.xpath("//a[@href ='#item1']"));
        String item1Text = item1.getText();
        Assert.assertEquals(item1Text, "Item 1");
        WebElement item2 = wd.findElement(By.xpath("//a[@href ='#item2']"));
        Assert.assertEquals(item2.getText(), "Item 2");
        WebElement item3 = wd.findElement(By.xpath("//a[@href ='#item3']"));
        Assert.assertEquals(item3.getText(), "Item 3");
        WebElement item4 = wd.findElement(By.xpath("//a[@href ='#item4']"));
        Assert.assertEquals(item4.getText(), "Item 4");
        //Fills
        WebElement fill1 = wd.findElement(By.xpath("//*[@placeholder = 'Type your name']"));
        WebElement fill2 = wd.findElement(By.xpath("//*[@placeholder = 'Type your surename']"));

        //Table

        //Europe
        WebElement tableEL1 = wd.findElement(By.xpath("//*[text() = 'Europe']"));
        Assert.assertEquals(tableEL1.getText(), "Europe");
        WebElement tableEL2 = wd.findElement(By.xpath("//*[text() = 'Ukraine']"));
        Assert.assertEquals(tableEL2.getText(), "Ukraine");
        WebElement tableEL3 = wd.findElement(By.xpath("//*[text() = 'Germany']"));
        Assert.assertEquals(tableEL3.getText(), "Germany");
        WebElement tableEL4 = wd.findElement(By.xpath("//*[text() = 'Poland']"));
        Assert.assertEquals(tableEL4.getText(), "Poland");
        //Asia
        WebElement tableEL5 = wd.findElement(By.xpath("//*[text() = 'Asia']"));
        Assert.assertEquals(tableEL5.getText(), "Asia");
        WebElement tableEL6 = wd.findElement(By.xpath("//*[text() = 'Israel']"));
        Assert.assertEquals(tableEL6.getText(), "Israel");
        WebElement tableEL7 = wd.findElement(By.xpath("//*[text() = 'Russia']"));
        Assert.assertEquals(tableEL7.getText(), "Russia");
        WebElement tableEL8 = wd.findElement(By.xpath("//*[text() = 'Chine']"));
        Assert.assertEquals(tableEL8.getText(), "Chine");
        //America
        WebElement tableEL9 = wd.findElement(By.xpath("//*[text() = 'America']"));
        Assert.assertEquals(tableEL9.getText(), "America");
        WebElement tableEL10 = wd.findElement(By.xpath("//*[text() = 'USA']"));
        Assert.assertEquals(tableEL10.getText(), "USA");
        WebElement tableEL11 = wd.findElement(By.xpath("//*[text() = 'Canada']"));
        Assert.assertEquals(tableEL11.getText(), "Canada");
        WebElement tableEL12 = wd.findElement(By.xpath("//*[text() = 'Mexico']"));
        Assert.assertEquals(tableEL12.getText(), "Mexico");

        //Alert tests
        item1.click();
        WebElement message = wd.findElement(By.xpath("//p[@class='message']"));
        Assert.assertEquals(message.getText(), "Clicked by Item 1");
        item2.click();
        Assert.assertEquals(message.getText(), "Clicked by Item 2");
        item3.click();
        Assert.assertEquals(message.getText(), "Clicked by Item 3");
        item4.click();
        Assert.assertEquals(message.getText(), "Clicked by Item 4");
        //Button
        WebElement button = wd.findElement(By.xpath("//*[@class ='btn']"));
        button.click();
        Assert.assertEquals(message.getText(),"NoName NoSurename");
    }

    @Test
    public void cssTests() {
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
    public void close() {
        wd.close();
    }
}
