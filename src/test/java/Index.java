import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void cssLocators(){
       WebElement element = wd.findElement(By.tagName("button"));
        List<WebElement> list = wd.findElements(By.tagName("a"));
        WebElement element2 = wd.findElement(By.tagName("ul"));
        WebElement element3 =wd.findElement(By.tagName("li"));
        List<WebElement> list1 = wd.findElements(By.tagName("hr"));
        WebElement element4 = wd.findElement(By.tagName("table"));

    }
    @AfterClass
    public void stop(){
        wd.close();
    }
}
