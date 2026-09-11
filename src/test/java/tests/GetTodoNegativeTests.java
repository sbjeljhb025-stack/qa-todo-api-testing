package tests;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetTodoNegativeTests {

    private static final String BASE_URL =
            "https://jsonplaceholder.typicode.com";

    @Test
    void shouldHandleNonExistentTodo() {

        int statusCode =
                given()
                        .when()
                        .get(BASE_URL + "/todos/9999")
                        .statusCode();

        // JSONPlaceholder returns 404 for IDs outside the dataset (todos only go up to 200).
        assertEquals(404, statusCode);
    }
}
