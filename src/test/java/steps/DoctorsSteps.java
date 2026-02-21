package steps;

import Pages.DoctorsPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DoctorsSteps {

    private final DoctorsPage doctorsPage = new DoctorsPage();

    @Дано("Пользователь открывает страницу врачей {string}")
    public void пользовательОткрываетСтраницуВрачей(String url) {
        Selenide.open(url);
    }

    @Когда("Пользователь активирует чекбокс 'Показать детских врачей'")
    public void пользовательАктивируетЧекбокс() {
        doctorsPage.clickToCheckbox();
    }

    @Тогда("Во всех карточках врачей есть отметка 'Детский врач'")
    public void воВсехКарточкахВрачейЕстьОтметка() {
        assertTrue(doctorsPage.ChildrenMedicVisible());
    }

    @Когда("Пользователь обновляет страницу")
    public void пользовательОбновляетСтраницу() {
        Selenide.refresh();
    }

    @Тогда("Чекбокс 'Показать детских врачей' активен")
    public void чекбоксАктивен() {
        assertTrue(doctorsPage.checkboxIsActive());
    }

    @И("Во всех карточках врачей все еще есть отметка 'Детский врач'")
    public void воВсехКарточкахВрачейВсеЕщеЕстьОтметка() {
        assertTrue(doctorsPage.ChildrenMedicVisible());
    }

















}
