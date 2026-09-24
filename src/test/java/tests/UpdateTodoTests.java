package tests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;
//class UpdateTodoTests
class UpdateTodoTests {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    void shouldUpdateTodo() {
        String requestBody = """
                {
                    "id": 1,
                    "userId": 1,
                    "title": "Updated QA Task",
                    "completed": true
                }
                """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put(BASE_URL + "/todos/1");

        assertEquals(200, response.statusCode());
        assertEquals(1, response.jsonPath().getInt("id"));
        assertEquals(1, response.jsonPath().getInt("userId"));
        assertEquals("Updated QA Task", response.jsonPath().getString("title"));
        assertTrue(response.jsonPath().getBoolean("completed"));
    }
}
