# Manual Test Cases

## API Under Test

**Application:** JSONPlaceholder Todo API
**Base URL:** `https://jsonplaceholder.typicode.com`

## Test Environment

* API testing can be performed using a browser, Postman, or an API client.
* No authentication is required.
* Test data uses the public Todo API.

---

## Test Cases

### TC001 — Get Existing Todo

**Test Type:** Positive / Functional

**Method:** GET

**Endpoint:** `/todos/1`

**Precondition:** The API is available.

**Test Data:** Todo ID `1`

**Steps:**

1. Send a GET request to `/todos/1`.
2. Check the HTTP response status.
3. Check the returned JSON response.

**Expected Result:**

* Response status is `200 OK`.
* Response contains a Todo object.
* Todo ID is `1`.
* The response contains `title` and `completed` fields.

---

### TC002 — Get Another Existing Todo

**Test Type:** Positive / Functional

**Method:** GET

**Endpoint:** `/todos/5`

**Precondition:** The API is available.

**Test Data:** Todo ID `5`

**Steps:**

1. Send a GET request to `/todos/5`.
2. Check the HTTP response status.
3. Check the returned JSON response.

**Expected Result:**

* Response status is `200 OK`.
* Todo ID is `5`.
* The response contains `title` and `completed` fields.

---

### TC003 — Get Non-Existent Todo

**Test Type:** Negative / Edge

**Method:** GET

**Endpoint:** `/todos/9999`

**Precondition:** The API is available.

**Test Data:** Todo ID `9999`

**Steps:**

1. Send a GET request to `/todos/9999`.
2. Check the HTTP response status.
3. Check the response body.

**Expected Result:**

* The API returns `404 Not Found`.
* The response indicates that the requested Todo does not exist.

**QA Observation:**

* The API behaviour was verified and documented as part of defect/behaviour investigation.
* This test demonstrates negative testing using a resource that does not exist.

---

### TC004 — Create a Todo

**Test Type:** Positive / Functional

**Method:** POST

**Endpoint:** `/todos`

**Precondition:** The API is available.

**Test Data:**

```json
{
  "title": "Learn API Testing",
  "completed": false,
  "userId": 1
}
```

**Steps:**

1. Send a POST request to `/todos` with the test data.
2. Check the HTTP response status.
3. Check the returned JSON response.

**Expected Result:**

* Response status is `201 Created`.
* The response contains an ID.
* The submitted title is returned.
* `completed` is returned as `false`.

---

### TC005 — Create Completed Todo

**Test Type:** Positive / Functional

**Method:** POST

**Endpoint:** `/todos`

**Precondition:** The API is available.

**Test Data:**

```json
{
  "title": "Complete QA Project",
  "completed": true,
  "userId": 1
}
```

**Steps:**

1. Send a POST request to `/todos` with the test data.
2. Check the HTTP response status.
3. Check the returned JSON response.

**Expected Result:**

* Response status is `201 Created`.
* The response contains an ID.
* The submitted title is returned.
* `completed` is returned as `true`.

---

### TC006 — Update an Existing Todo

**Test Type:** Positive / Functional

**Method:** PUT

**Endpoint:** `/todos/1`

**Precondition:** The API is available and Todo ID `1` exists.

**Test Data:**

```json
{
  "id": 1,
  "title": "Updated Todo",
  "completed": true,
  "userId": 1
}
```

**Steps:**

1. Send a PUT request to `/todos/1`.
2. Include the updated Todo data.
3. Check the HTTP response status.
4. Check the returned JSON response.

**Expected Result:**

* Response status is `200 OK`.
* The response contains ID `1`.
* The updated title is returned.
* `completed` is returned as `true`.

---

### TC007 — Delete an Existing Todo

**Test Type:** Positive / Functional

**Method:** DELETE

**Endpoint:** `/todos/1`

**Precondition:** The API is available.

**Test Data:** Todo ID `1`

**Steps:**

1. Send a DELETE request to `/todos/1`.
2. Check the HTTP response status.
3. Check the response body.

**Expected Result:**

* Response status is `200 OK`.
* The request is successfully processed by the API.

---

## Test Coverage

| Test Type               | Test Cases                               |
| ----------------------- | ---------------------------------------- |
| Positive testing        | TC001, TC002, TC004, TC005, TC006, TC007 |
| Negative / Edge testing | TC003                                    |
| Functional testing      | TC001–TC007                              |
| Response validation     | TC001–TC007                              |
| HTTP status validation  | TC001–TC007                              |
| JSON field validation   | TC001, TC002, TC004, TC005, TC006        |

## QA Test Flow

The test cases follow this basic QA process:

**Requirement → Test Case → Test Execution → Result → Investigation → Defect Report → Retest → Regression Testing**

This project uses the manual test cases as the foundation for the automated API tests.
