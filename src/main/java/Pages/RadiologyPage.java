package Pages;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$x;


public class RadiologyPage {

    private SelenideElement allMrt = $x("(//a[text()='МРТ'])[1]");

    private SelenideElement mrtGolovy = $x("(//a[text()= 'МРТ головы'])[1]");

    private SelenideElement mrtOrganov= $x("(//a[text()= 'МРТ внутренних органов'])[1]");

    private SelenideElement mrttkanej = $x ("(//a[text()= 'МРТ мягких тканей'])[1]");

    private SelenideElement mrtBeremen = $x("(//a[text()= 'МРТ при беременности'])[1]");

    private SelenideElement mrtNervi = $x ("(//a[text()= 'МРТ периферической нервной системы'])[1]");

    private SelenideElement mrtZhelez = $x ("(//a[text()='МРТ молочных желез'])[1]");

    //private SelenideElement mrtTela = $x ("(//a[text()= 'МРТ тела'])[1]");

    private SelenideElement mrtPozvonok = $x ("(//a[text()= 'МРТ позвоночника'])[1]");

    private SelenideElement mrtSustav = $x ("(//a[text()= 'МРТ суставов'])[1]");

    private SelenideElement mrtContrast = $x ("(//a[text()= 'МРТ с контрастом'])[1]");

    private SelenideElement mrtDopuslugi = $x ("(//a[text()= 'Дополнительные услуги'])[1]");

    private SelenideElement xray = $x ("(//a[text()= 'Рентген'])[1]");

    private SelenideElement densito = $x ("(//a[text()= 'Денситометрия'])[1]");

    private SelenideElement mamograf = $x ("(//a[text()= 'Маммография'])[1]");

    private SelenideElement biopsiya = $x ("(//a[text()= 'Биопсия'])[1]");

    private SelenideElement ginekolog = $x ("(//a[text()= 'Эстетическая гинекология'])[1]");

    private SelenideElement otorinolarin = $x ("(//a[text()= 'Оториноларингология'])[1]");

    private SelenideElement urologiya = $x ("(//a[text()= 'Урология'])[1]");

    private SelenideElement surger = $x ("(//a[text()='Хирургия'])[1]");

    private SelenideElement gsg = $x ("(//a[text()= 'ГСГ'])[1]");

    private SelenideElement endoscop = $x ("(//a[text()= 'Эндоскопия'])[1]");

    private SelenideElement koloprokt = $x ("(//a[text()= 'Колопроктология'])[1]");

    private SelenideElement uzi = $x ("(//a[text()= 'УЗИ'])[1]");

    private SelenideElement echokardio = $x ("(//a[text()= 'Эхокардиография'])[1]");

    private SelenideElement plazmo = $x ("(//a[text()= 'Плазмотерапия'])[1]");

    private SelenideElement dermatovener = $x ("(//a[text()= 'Дерматовенерология'])[1]");

    private SelenideElement vakcina = $x ("(//a[text()= 'Вакцинация'])[1]");

    private SelenideElement inekcii = $x ("(//a[text()= 'Инъекции'])[1]");

    private SelenideElement phisio = $x ("(//a[text()= 'Физиотерапия'])[1]");

    private SelenideElement massage = $x ("(//a[text()= 'Медицинский массаж'])[1]");

    private SelenideElement flebolog = $x ("(//a[text()= 'Флебология'])[1]");

    private SelenideElement somnolog = $x ("(//a[text()= 'Сомнология'])[1]");

    private SelenideElement other = $x ("(//a[text()= 'Прочие услуги'])[1]");

    //private ElementsCollection allMenuItems = $$x("//li[contains(@class,'side-bar-second__items')] | //li[@class='side-bar-third__items']");
    //$$x("//li[contains(@class, 'side-bar-second__items') or contains(@class, 'side-bar-third__items')]");

private SelenideElement citySelector = $x("//div[@id='city']");

private SelenideElement selectOther = $x("//a[@href= '#selectBasketCity']/span");

private SelenideElement searchCity = $x("//input[@id='select-basket-city-input']");










public void collectAllElementExeptMrtCollect() {

    List<SelenideElement> allMenuItems = List.of(allMrt, mrtGolovy, mrtOrganov, mrttkanej, mrtBeremen, mrtNervi, mrtZhelez,
            mrtPozvonok, mrtSustav, mrtContrast, mrtDopuslugi, xray, densito, mamograf, biopsiya, ginekolog, otorinolarin,
            urologiya, surger, gsg, endoscop, koloprokt, uzi, echokardio, plazmo, dermatovener, vakcina, inekcii, phisio, massage,
            flebolog, somnolog, other);

    allMenuItems.stream()
            .filter(item -> !item.getText().contains("МРТ тела"))
            .collect(Collectors.toList());


    for (WebElement item : allMenuItems) {
        item.click();
        //Selenide.back();
    }
}


    public void collectAllElementExeptMrtClick() {

        List<SelenideElement> allMenuItems = List.of(allMrt, mrtGolovy, mrtOrganov, mrttkanej, mrtBeremen, mrtNervi, mrtZhelez,
                mrtPozvonok, mrtSustav, mrtContrast, mrtDopuslugi, xray, densito, mamograf, biopsiya, ginekolog, otorinolarin,
                urologiya, surger, gsg, endoscop, koloprokt, uzi, echokardio, plazmo, dermatovener, vakcina, inekcii, phisio, massage,
                flebolog, somnolog, other);

        for (SelenideElement item : allMenuItems) {
            if (!item.getText().contains("МРТ тела")) {
                item.click();
            }
        }
    }

    public void changeCity(String город) {
        citySelector.click();
        selectOther.click();
        searchCity.sendKeys(город);
        $x("(//b[contains(text(),'" + город + "')])[1]").click();
    }

































}
