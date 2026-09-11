package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class DeleteTodoTests {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    void shouldDeleteTodo() {
        int statusCode = given()
                .when()
                .delete(BASE_URL + "/todos/1")
                .statusCode();

        assertEquals(200, statusCode);
    }
}
