package Pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class RadiologyPage {

private ElementsCollection allMenuItems = $$x("//li[contains(@class,'side-bar-second__items')] | //li[@class='side-bar-third__items']");
    //$$x("//li[contains(@class, 'side-bar-second__items') or contains(@class, 'side-bar-third__items')]");

private SelenideElement citySelector = $x("//div[@id='city']");

private SelenideElement selectOther = $x("//a[@href= '#selectBasketCity']/span");

private SelenideElement searchCity = $x("//input[@id='select-basket-city-input']");

private SelenideElement omsk = $x("//b[text()='Омск']");









public void collectAllElementExeptMrt() {

    ElementsCollection filteredItems = allMenuItems.filterBy(not(text("МРТ тела")));
    filteredItems.forEach(item -> {
        item.click();
        //Selenide.back();
    });
}


    public void collectAllElementExeptMrtCollect() {

        allMenuItems.forEach(item -> {
            if (!item.getText().contains("МРТ тела")) {
                item.click();

            }
        });
    }

    public void changeCity(String город) {
        citySelector.click();
        selectOther.click();
        searchCity.sendKeys(город);
        $x("(//b[contains(text(),'" + город + "')])[1]").click();
    }

































}
