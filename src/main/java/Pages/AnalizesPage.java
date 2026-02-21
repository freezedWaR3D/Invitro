package Pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class AnalizesPage {

    private SelenideElement price = $x("(//div[contains(text(),'360')])[1]");

    private SelenideElement name = $x("//a[contains(text(),'Глюкоза (в крови) (Glucose)')]");

    private SelenideElement addButton = $x("//a[@data-product-article='16']");

    private SelenideElement cart = $x("(//a[@href='https://lk3.invitro.ru/cart'])[2]");

    private SelenideElement adsClose = $x("//div[@class='popmechanic-close']");

    public void addToCart(){
        addButton.click();
    }

    public void clickOnCart(){
        cart.click();
    }

    public String getProductName() {
        return name.getText();
    }

    public String getProductPrice() {
        return price.getText();
    }

    public void clickAdsClose(){
        adsClose.shouldBe(visible, Duration.ofSeconds(10));
        adsClose.click();
    }































}
