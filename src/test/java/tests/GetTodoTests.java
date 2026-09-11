package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class GetTodoTests {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    void shouldGetTodoSuccessfully() {
        Response response = given()
                .when()
                .get(BASE_URL + "/todos/1");

        assertEquals(200, response.statusCode());
        assertEquals(1, response.jsonPath().getInt("id"));
        assertNotNull(response.jsonPath().getString("title"));
        assertNotNull(response.jsonPath().get("completed"));
    }

    @Test
    void shouldGetAnotherTodoSuccessfully() {
        Response response = given()
                .when()
                .get(BASE_URL + "/todos/5");

        assertEquals(200, response.statusCode());
        assertEquals(5, response.jsonPath().getInt("id"));
    }

    @Test
    void shouldReturnNotFoundForNonExistentTodo() {

        int statusCode =
                given()
                        .when()
                        .get(BASE_URL + "/todos/9999")
                        .statusCode();

        // JSONPlaceholder returns 404 for IDs outside the dataset (todos only go up to 200).
        assertEquals(404, statusCode);
    }
}
