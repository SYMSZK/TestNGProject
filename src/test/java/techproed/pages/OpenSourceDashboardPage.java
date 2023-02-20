package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourceDashboardPage {
    //1.constructor olusturdum
    public OpenSourceDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h6[.='Dashboard']")
    public WebElement dashboardHeader;

    /*
        @Findby pageobjectmadel page classlarda kullanılır elementlerin test sınıflarda kullanılmasına ızın verir
        elementleri locate etmek icin

        pagefactory dizayn icin kullanılır initelements(static method dur) ile class elementlerini instantiate etmek
        icin kullanılır

         */
}
