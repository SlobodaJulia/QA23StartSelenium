import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeClass
    public void Setup(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/pc/Downloads/21.index.html");
    }

    @Test
    public void Tabletest(){
        WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));
        Assert.assertEquals(canada.getText(), "Canada");
    }


    @Test
    public void cssLocators(){
       //by tag
        WebElement element = wd.findElement(By.tagName("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        WebElement element2 = wd.findElement(By.tagName("ul"));
        WebElement element3 =wd.findElement(By.tagName("li"));
        List<WebElement> list1 = wd.findElements(By.tagName("hr"));
        WebElement element4 = wd.findElement(By.tagName("table"));
        WebElement el1 = wd.findElement(By.cssSelector("a"));

        //by class
        WebElement element5 = wd.findElement(By.className("contaner"));
        WebElement element6 = wd.findElement(By.cssSelector(".contaner"));
        List<WebElement> list2 = wd.findElements(By.className("nav-item"));
        List<WebElement> list3 = wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement element7 = wd.findElement(By.id("nav"));
        WebElement element8 = wd.findElement(By.cssSelector("#nav"));

        //by attributes

        WebElement element9 = wd.findElement(By.cssSelector("[href='#item3']"));
        //WebElement element91 = wd.findElement(By.("[href='#item3']"));


        //by name

        WebElement element10= wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement element11 = wd.findElement(By.cssSelector("[name='surename']"));

        WebElement element12 = wd.findElement(By.cssSelector("[placeholder ^='Type']"));
       // WebElement element13 = wd.findElement(By.cssSelector("[placeholder $= 'name']"));






    }
    @AfterClass
    public void stop(){
        wd.close();
    }
}
