package tests;
//CreateTodoTests
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class CreateTodoTests {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

    @Test
    void shouldCreateTodo() {
        String requestBody = """
                {
                    "userId": 1,
                    "title": "Learn API Testing",
                    "completed": false
                }
                """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(BASE_URL + "/todos");

        assertEquals(201, response.statusCode());
        assertEquals("Learn API Testing", response.jsonPath().getString("title"));
        assertFalse(response.jsonPath().getBoolean("completed"));
        assertNotNull(response.jsonPath().get("id"));
    }

    @Test
    void shouldCreateCompletedTodo() {
        String requestBody = """
                {
                    "userId": 2,
                    "title": "Complete QA project",
                    "completed": true
                }
                """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post(BASE_URL + "/todos");

        assertEquals(201, response.statusCode());
        assertEquals("Complete QA project", response.jsonPath().getString("title"));
        assertTrue(response.jsonPath().getBoolean("completed"));
    }
}
