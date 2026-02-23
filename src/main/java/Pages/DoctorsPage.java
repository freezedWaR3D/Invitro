package Pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.ex.ElementNotFound;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class DoctorsPage {

private SelenideElement checkbox = $x("(//div[@class='iwg_checkbox_switch'])[2]");

private SelenideElement textChildrenMedic = $x("//span[text()='Детский врач']");

private SelenideElement checkboxActive = $x("//input[@checked='checked'] ");

private SelenideElement adsClose = $x("//button[@class='uxs-1Rt7dOrmXX uxs-15ciifp']");


public void clickToCheckbox(){
    checkbox.click();
}

public void clickAdsClose(){
    adsClose.shouldBe(visible,Duration.ofSeconds(10));
    adsClose.click();
}

public boolean checkboxIsActive() {
    try {
        checkboxActive.isSelected();
        return true;
    } catch (com.codeborne.selenide.ex.ElementNotFound e) {
        return false;
    }
}

    public boolean ChildrenMedicVisible() {
        try {
            textChildrenMedic.shouldBe(visible,Duration.ofSeconds(10));
            return true;
        } catch (com.codeborne.selenide.ex.ElementNotFound e) {
            return false;
        }
    }
































}
