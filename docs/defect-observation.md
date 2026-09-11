# API Behaviour Observation

## OBS-001 — Non-existent Todo response

**Endpoint:** `GET /todos/9999`

**Scenario:** Request a Todo ID that does not exist in the sample API.

**Expected for a typical REST API:** A non-existent resource is commonly represented by HTTP `404 Not Found`.

**Observed JSONPlaceholder behaviour:** The API returns HTTP `404 Not Found` for this request. `/todos` only contains 200 records (IDs 1–200), so an out-of-range ID like `9999` correctly falls outside the dataset.

**Classification:** Not a defect. Matches standard REST semantics and JSONPlaceholder's documented behaviour for out-of-range IDs.

**Correction history:** This observation previously stated that the API returned `200` with an empty object. That was inaccurate — automated test runs (`GetTodoNegativeTests`, `GetTodoTests`) consistently returned `404`, and this was confirmed against JSONPlaceholder's own documentation. The tests and this observation have been corrected to assert `404`.

**QA lesson:** A tester should verify actual behaviour empirically (via test execution and/or source documentation) rather than recording an assumption as an observation. An unverified "observed behaviour" note can itself become a defect in the test suite.

**Action:** Closed. `GetTodoNegativeTests.shouldHandleNonExistentTodo` and `GetTodoTests.shouldReturnNotFoundForNonExistentTodo` (renamed from `shouldReturnEmptyObjectForNonExistentTodo`) now assert `404`.