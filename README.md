# QA Todo API Testing

## Portfolio Project

A beginner-friendly Quality Assurance portfolio project demonstrating API test design, manual test cases, automated API testing, defect thinking, documentation, and Git-based development.

## Project Goal

The goal is to test the JSONPlaceholder Todo REST API and demonstrate a practical junior QA workflow without building an unnecessarily complicated application.

## What This Project Demonstrates

- Quality Assurance fundamentals
- Test case design
- Positive testing
- Negative and edge-case testing
- REST API testing
- HTTP methods and status codes
- JSON response validation
- Automated testing
- JUnit 5
- REST Assured
- Maven
- Git and GitHub
- Defect reporting
- Requirements traceability
- Continuous integration with GitHub Actions

## System Under Test

**API:** JSONPlaceholder Todo API

**Base URL:** `https://jsonplaceholder.typicode.com`

## API Operations Tested

| Method | Endpoint | Purpose |
|---|---|---|
| GET | `/todos/1` | Retrieve a Todo |
| POST | `/todos` | Create a Todo |
| PUT | `/todos/1` | Update a Todo |
| DELETE | `/todos/1` | Delete a Todo |

## Test Coverage

The project covers:

- Successful retrieval of a Todo
- Retrieval of another valid Todo
- Non-existent Todo behaviour
- Creating a Todo
- Updating a Todo
- Deleting a Todo
- Response field validation
- HTTP status-code validation

## QA Documentation

- [`TESTING_STRATEGY.md`](TESTING_STRATEGY.md) — scope, approach, test types, entry/exit criteria and risks
- [`test-cases/test-cases.md`](test-cases/test-cases.md) — manual test cases
- [`docs/traceability-matrix.md`](docs/traceability-matrix.md) — requirement-to-test coverage
- [`docs/defect-observation.md`](docs/defect-observation.md) — documented API behaviour/observation
- [`docs/bug-report-template.md`](docs/bug-report-template.md) — reusable defect template
- [`docs/test-execution-log.md`](docs/test-execution-log.md) — real test execution evidence

## Technologies

- Java 21
- Maven
- JUnit 5
- REST Assured
- Git
- GitHub
- GitHub Actions

## Project Structure

```text
qa-todo-api-testing/
├── .github/
│   └── workflows/
│       └── maven-tests.yml
├── docs/
│   ├── bug-report-template.md
│   ├── defect-observation.md
│   ├── test-execution-log.md
│   └── traceability-matrix.md
├── src/
│   └── test/
│       └── java/
│           └── tests/
│               ├── CreateTodoTests.java
│               ├── DeleteTodoTests.java
│               ├── GetTodoNegativeTests.java
│               ├── GetTodoTests.java
│               └── UpdateTodoTests.java
├── test-cases/
│   └── test-cases.md
├── .gitignore
├── pom.xml
├── README.md
└── TESTING_STRATEGY.md
```

## How to Run Locally

### 1. Requirements

Install Java 21 and Maven.

### 2. Run all tests

```bash
mvn test
```

### 3. View Maven test reports

After a test run, reports are available under:

```text
target/surefire-reports/
```

## QA Workflow

```text
Requirement
    ↓
Test Case Design
    ↓
Test Execution
    ↓
PASS / FAIL
    ↓
Investigate Failure
    ↓
Defect Report (if required)
    ↓
Retest
    ↓
Regression Test
```

## Test Design Examples

### Positive test

A valid request such as:

```text
GET /todos/1
```

is expected to return a successful response and valid Todo data.

### Negative/edge test

A request such as:

```text
GET /todos/9999
```

is used to observe how the API handles a Todo that does not exist.

The actual API behaviour is documented rather than assuming that every API must behave the same way.

## CI Testing

GitHub Actions runs `mvn test` automatically when code is pushed or a pull request is opened. This provides a simple regression check for the automated test suite.

## Git Development Practice

The project should be developed in small, meaningful increments. Example commit sequence:

```text
chore: initialise QA API testing project
build: configure Maven and testing dependencies
test: add successful GET todo test
docs: add manual API test cases
test: add create todo API tests
test: add update todo API test
test: add delete todo API test
test: add negative API scenarios
docs: add testing strategy and traceability
ci: add automated Maven test workflow
docs: improve project documentation
```

Do not create fake historical commits. Make genuine changes over time and commit them as you work.

## Learning Outcomes

By completing this project, I should be able to explain:

- What QA is
- What software testing is
- What an API is
- What REST means
- GET, POST, PUT and DELETE
- HTTP status codes
- Positive vs negative testing
- Test cases and test scenarios
- Assertions
- Automated testing
- JUnit
- REST Assured
- Maven
- Git and GitHub
- Defect reporting
- Regression testing
- Continuous integration


## Verification
WTC-UNZ7LUUS
## Author

**Sbongakonke Jele**

Quality Assurance Portfolio Project — 2026
