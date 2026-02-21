package Pages;

import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class AnalizesResultsPage {

private SelenideElement inzCodeField = $x("//input[@name='orderNumber']");

private SelenideElement birthDateField = $x("//input[@name='birthday']");

private SelenideElement lastNameField = $x("//input[@name='lastName']");

private SelenideElement errorMessage = $x("//div[@class = 'UnauthResultsPage_error__m2C-2']");

private SelenideElement redLightAll = $x("//input[contains(@class, 'Input_error')]");

private SelenideElement redLightInz = $x("(//input[contains(@class, 'Input_error')])[1]");

private SelenideElement redLightDate = $x("(//input[contains(@class, 'Input_error')])[2]");

private SelenideElement redLightName = $x("(//input[contains(@class, 'Input_error')])[3]");

private SelenideElement findResultsButton = $x("//button[text()='Найти результаты']");


    public void submitEmptyForm() {
        findResultsButton.click();
    }

    public boolean fieldsIsRed() {
        try {
            redLightAll.shouldBe(visible);
            return true;
        } catch (com.codeborne.selenide.ex.ElementNotFound e) {
            return false;
        }
    }

    public boolean isErrorMessageVisible() {
        try {
            errorMessage.shouldBe(visible);
            return true;
        } catch (com.codeborne.selenide.ex.ElementNotFound e) {
            return false;
        }
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }

    public void fillInzCode(String код) {
        inzCodeField.sendKeys(код);
    }

    public void fillBirthDate(String дата) {
        birthDateField.sendKeys(дата);
    }

    public void fillLastName(String имя) {
        lastNameField.sendKeys(имя);
    }



























}
