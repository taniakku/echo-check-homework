package echotest;

import org.junit.jupiter.api.Test;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class EchoTest {


    @Test
    void ShouldCheckPostInEchoPostman() {

        given()
                .baseUri("https://postman-echo.com")
                .body("body contents") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo("body contents"))
        ;

    }

}
