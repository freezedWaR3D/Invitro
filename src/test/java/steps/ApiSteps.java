package steps;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.То;
import io.cucumber.java.ru.Тогда;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

public class ApiSteps {

    private Response response;
    private String baseUrl = "https://www.invitro.ru/local/ajax/current-city.php?CODE=bajmak";

    @Дано("Выполняется запрос к API current-city с параметром CODE={string}")
    public void выполняетсяЗапрос(String код) {
        response = given()
                .queryParam("?CODE=", код)
                .when()
                .get(baseUrl)
                .then()
                .extract().response();
    }

    @Тогда("Код ответа HTTP равен {int}")
    public void кодОтветаРавен(int город) {
        assertEquals(город, response.getStatusCode(),
                "HTTP статус код должен быть " + город);
    }

    @И("В теле ответа содержится информация о городе с кодом {string}")
    public void  вТелеОтветаСодержитсяИнформацияОГороде(String город) {
        String body = response.getBody().asString();
        assertTrue(body.contains(город),
                "Тело ответа должно содержать '" + город + "', но было: " + body);
    }




}
