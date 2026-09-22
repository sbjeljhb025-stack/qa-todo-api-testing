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
        Response response = given()
                .when()
                .get(BASE_URL + "/todos/9999");

        // JSONPlaceholder returns 404 Not Found for a non-existent Todo.
        assertEquals(404, response.statusCode());
    }
}
