package io.leche43.greetings;

import io.quarkus.test.junit.QuarkusTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("hello"));
    }

    @Test
    public void testGreetingEndpoint() {
        String random = RandomStringUtils.random(10);
        given().pathParam("name", random)
                .when()
                .get("/hello/greeting/{name}")
                .then()
                .statusCode(200)
                .body(is("hello " + random + "\n"));
    }

}