package Pages;

import com.codeborne.selenide.SelenideElement;


import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class CartPage {

    private SelenideElement nameInCart = $x("//button[text()='Глюкоза (в крови) (Glucose)']");

    private SelenideElement priceInCart = $x("//span[contains(text(),'360')]");


    public String getProductNameInCart() {
        return nameInCart.getText();
    }

    public String getProductPriceInCart() {
        priceInCart.shouldBe(visible, Duration.ofSeconds(10));
        return priceInCart.getText();
    }






















}
