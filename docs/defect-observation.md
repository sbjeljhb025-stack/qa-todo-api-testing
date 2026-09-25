## API Behaviour Observation

## OBS-001 — Non-existent Todo response

Endpoint: GET /todos/9999

Scenario: Request a Todo ID that does not exist in the sample API.

Expected for a typical REST API: A non-existent resource is commonly represented by HTTP 404 Not Found.

Observed JSONPlaceholder behaviour: The test environment returns HTTP 200 with an empty JSON object for this request.

Classification: API behaviour observation, not automatically a defect in this learning project.

QA lesson: A tester should compare actual behaviour with the documented requirement or API contract instead of assuming that every API follows the same implementation.

Action: Keep the behaviour documented and revisit the expected result if an explicit API requirement is provided.