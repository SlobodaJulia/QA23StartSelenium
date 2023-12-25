import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ClassWork {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test

    public void cssLocators(){


        //by tag name
        WebElement ph1 = wd.findElement(By.cssSelector("body"));
        WebElement ph1_1 = wd.findElement(By.xpath("//body"));
        WebElement h1 = wd.findElement(By.xpath("//h1"));
        List<WebElement> ph2 = wd.findElements(By.cssSelector("script"));
        WebElement ph3 = wd.findElement(By.cssSelector("title"));
        WebElement ph3_1 = wd.findElement(By.xpath("//title"));
        WebElement ph4 = wd.findElement(By.cssSelector("html"));
        WebElement ph4_1 = wd.findElement(By.xpath("//html"));



        //by id
        WebElement ph5 = wd.findElement(By.cssSelector("#root"));
        WebElement ph5_1 = wd.findElement(By.xpath("//*[@id='root']"));


        //by class
        WebElement ph6 = wd.findElement(By.cssSelector(".container"));
        WebElement ph6_1 = wd.findElement(By.xpath("//div[@class='container']"));
        List<WebElement> ph7 = wd.findElements(By.cssSelector(".active"));
        WebElement ph8 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement ph8_1 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));
        WebElement ph9 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement ph9_1 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));


        //by attribute
        List<WebElement> ph10 = wd.findElements(By.cssSelector("[href]"));
        //WebElement ph11 = wd.findElement(By.cssSelector("[href= ”/favicon.ico”]"));
        WebElement ph12= wd.findElement(By.cssSelector("[href='/static/css/main.2e306ff7.chunk.css']"));
        WebElement ph13= wd.findElement(By.cssSelector("[href=\"/login\"]"));
        WebElement ph14= wd.findElement(By.cssSelector("[href='/home']"));
        WebElement ph15= wd.findElement(By.cssSelector("[href='/about']"));



        //start/end/contains
        WebElement ph16= wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement ph16_1= wd.findElement(By.xpath("//*[@placeholder = 'Email']"));
        WebElement ph17= wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement ph17_1= wd.findElement(By.xpath("//*[@placeholder = 'Password']"));
        WebElement ph18= wd.findElement(By.cssSelector("[name = 'login']"));
        WebElement ph18_1= wd.findElement(By.xpath("//*[@name = 'login']"));
        WebElement ph19= wd.findElement(By.cssSelector("[name = 'registration']"));
        WebElement ph19_1= wd.findElement(By.xpath("//*[@name = 'registration']"));

        //starts with
        WebElement ph16_st= wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement ph16_st1= wd.findElement(By.xpath("//*[starts-with(@placeholder,'Em')]"));
        WebElement ph17_st= wd.findElement(By.cssSelector("[placeholder^='Pas']"));
        WebElement ph17_st1= wd.findElement(By.xpath("//*[starts-with(@placeholder,'Pas')]"));
        WebElement ph18_st= wd.findElement(By.cssSelector("[name^= 'lo']"));
        WebElement ph18_st1=wd.findElement(By.xpath("//*[starts-with(@name,'lo')]"));

        //end with
        WebElement ph19_end= wd.findElement(By.cssSelector("[placeholder$='il']"));
        WebElement ph19_end1= wd.findElement(By.xpath("//*[contains(@placeholder,'il')]"));

        WebElement ph20_end= wd.findElement(By.cssSelector("[name $= 'tion']"));
        WebElement ph20_end1= wd.findElement(By.xpath("//*[contains(@name, 'ation')]"));

        //contains
        WebElement ph21_cont= wd.findElement(By.cssSelector("[name*= 'lo']"));
        WebElement ph22_cont= wd.findElement(By.cssSelector("[name*= 'ion']"));


    }

    @AfterClass

    public void stop(){
        wd.close();
    }
}
