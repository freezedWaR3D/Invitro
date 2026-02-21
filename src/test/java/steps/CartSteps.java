package steps;

import Pages.AnalizesPage;
import Pages.CartPage;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartSteps {

    private final AnalizesPage analizesPage = new AnalizesPage();
    private final CartPage cartPage = new CartPage();
    private String price;


    @Дано("Пользователь открывает страницу анализов {string}")
    public void пользователь_открывает_страницу_анализов(String url) {
        Selenide.open(url);
    }

    @Когда("Пользователь запоминает цену продукта 'Глюкоза в крови'")
    public void пользовательЗапоминаетЦенуПродуктаГлюкозаВКрови(){
        analizesPage.clickAdsClose();
        price = analizesPage.getProductPrice();

    }
    @Когда("Пользователь добавляет продукт 'Глюкоза в крови' в корзину")
    public void пользовательДобавляетПродукт(){
        analizesPage.addToCart();


    }
    @Когда("Пользователь переходит в корзину")
    public void пользовательПереходитВКорзину(){
    analizesPage.clickOnCart();
    }

    @Тогда("Цена продукта в корзине совпадает с ценой в каталоге")
    public void ценаПродуктаВКорзинеСовпадаетСЦенойВКаталоге(){
    assertEquals(price,cartPage.getProductPriceInCart(), "Цена продукта не совпадает");

    }







































}
