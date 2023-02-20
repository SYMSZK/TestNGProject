package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {
    //Page Objelerini bu sınıfta buluruz

    //her bir pages sııfı constructor ile baslamalidir
    //1.constructor
    public OpenSourcePage(){
        //PageFactory selenıumdan gelen ve bu sayfa elementlerini baslangı degeri vermek icin kullanilir
        //bu sekilde sayfa objeleri cagrıldıgında null pointer exception alınmaz
        //PageFactory.initElements() elementlere deger ver demek iki beraberken

        PageFactory.initElements(Driver.getDriver(),this);

    }
    // PAGE OBJELERINI OLUSTUR
    //GELENEKSEL YOL İLE WEBELEMENTI BULMA YOLU== public Webelement username = Driver.getDriver().findElement(By.name("username"));
    @FindBy(name = "username")
    public WebElement username;

    @FindBy(xpath = "//input[@name = 'password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitButton;

}
