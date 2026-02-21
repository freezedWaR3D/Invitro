package steps;

import Pages.AnalizesResultsPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;

import static org.junit.jupiter.api.Assertions.*;

public class AnalizesResultsSteps {

private final AnalizesResultsPage analizesResultsPage = new AnalizesResultsPage();



    @Дано("Пользователь переходит на страницу «Результаты анализов» {string}")
    public void пользовательПереходитНаCтраницуРезультатыАнализов(String url) {
        Selenide.open(url);
    }

    @Когда("Пользователь нажимает «Найти результаты» без заполнения полей")
    public void пользовательНажимаетНайтиРезультатыБезЗаполненияПолей() {
        analizesResultsPage.submitEmptyForm();
    }

    @Тогда("Поля выделены красным цветом")
    public void поляВыделеныКраснымЦветом() {
        assertTrue(analizesResultsPage.fieldsIsRed(),
                "Не все поля выделены красным цветом");

    }


    @Тогда("Отображается предупреждение «Поля Код ИНЗ Дата рождения Фамилия обязательны для заполнения»")
    public void отображаетсяПредупреждение() {
        String actualMessage = analizesResultsPage.getErrorMessage();
        assertEquals("Поля Код ИНЗДата рожденияФамилия обязательны для заполнения", actualMessage,
                    "Текст сообщения об ошибке не соответствует ожидаемому. Получено: '" + actualMessage + "'");

        assertTrue(analizesResultsPage.isErrorMessageVisible(),
                    "Сообщение об ошибке не отображается");
        }


    @Когда("Пользователь заполняет поле «Код ИНЗ» значением {string}")
    public void пользовательЗаполняетПолеКодИнз(String код) {
        analizesResultsPage.fillInzCode(код);
    }


    @Когда("Пользователь заполняет поле «Дата рождения» значением {string}")
    public void пользовательЗаполняетПолеДатаРождения(String дата) {
        analizesResultsPage.fillBirthDate(дата);
    }

    @Когда("Пользователь заполняет поле «Фамилия» значением {string}")
    public void пользовательЗаполняетПолеФамилия(String имя) {
        analizesResultsPage.fillLastName(имя);
    }

    @Тогда("Предупреждение отсутствует")
    public void предупреждениеОтсутствует() {
        assertTrue(analizesResultsPage.isErrorMessageVisible(),
                "Сообщение об ошибке всё ещё отображается");
    }

    @Тогда("Поля не выделены красным цветом")
    public void поляНеВыделеныКраснымЦветом() {
        assertTrue(analizesResultsPage.fieldsIsRed(),
                "Поля всё ещё выделены красным цветом");
    }




































}
