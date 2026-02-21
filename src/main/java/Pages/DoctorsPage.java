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


public void clickToCheckbox(){
    checkbox.click();
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
