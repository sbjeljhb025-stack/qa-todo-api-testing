


## QA Todo API Testing
## Portfolio Project
A junior Quality Assurance portfolio project demonstrating API test design, manual test cases, automated testing, negative testing, test reporting, traceability, defect documentation and continuous integration.

## Project Goal
The goal is to test the JSONPlaceholder Todo REST API and demonstrate a practical QA workflow without needing to build a separate website or application.

System Under Test
API: JSONPlaceholder Todo API
Base URL: https://jsonplaceholder.typicode.com

## The project tests these CRUD operations:

## Method	Endpoint	Purpose
GET	/todos/1	Retrieve a Todo
GET	/todos/5	Retrieve another Todo
GET	/todos/9999	Negative/edge-case behaviour
POST	/todos	Create a Todo
PUT	/todos/1	Update a Todo
DELETE	/todos/1	Delete a Todo

## Test Coverage
The automated suite contains 7 tests:

2 GET positive tests

1 GET negative/edge-case test

2 POST tests

1 PUT test

1 DELETE test

The tests validate HTTP status codes and important JSON response fields.

## Tools and Technologies
Java 21

JUnit 5

REST Assured

Maven

Git and GitHub

GitHub Actions

## Project Structure
qa-todo-api-testing/
├── .github/
│   └── workflows/
│       └── maven-tests.yml
├── docs/
│   ├── bug-report-example.md
│   ├── bug-report-template.md
│   ├── defect-observation.md
│   ├── test-execution-log.md
│   ├── test-reporting.md
│   └── traceability-matrix.md
├── src/test/java/tests/
│   ├── CreateTodoTests.java
│   ├── DeleteTodoTests.java
│   ├── GetTodoNegativeTests.java
│   ├── GetTodoTests.java
│   └── UpdateTodoTests.java
├── test-cases/
│   └── test-cases.md
├── DEMO_SCRIPT.md
├── TESTING_STRATEGY.md
├── SETUP.md
├── pom.xml
└── README.md
## How to Run the Tests
Requirements
Install:

Java 21

Maven

An internet connection

Run the automated suite
mvn test
A successful run currently contains:

Tests run: 7, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
Test Reports
Maven Surefire creates machine-readable reports in:

target/surefire-reports/
See docs/test-reporting.md for how the reports are used as QA evidence.

## QA Documentation
TESTING_STRATEGY.md — scope, approach, test types, entry/exit criteria and risks

test-cases/test-cases.md — manual test cases

docs/traceability-matrix.md — requirement-to-test coverage

docs/test-execution-log.md — real execution evidence

docs/test-reporting.md — local and CI test reporting

docs/defect-observation.md — observed API behaviour

docs/bug-report-example.md — requirement-dependent bug report example

docs/bug-report-template.md — reusable defect template

QA Workflow
Requirement
↓
Test Case Design
↓
Test Execution
↓
PASS / FAIL
↓
Investigate
↓
Defect / Observation
↓
Retest
↓
Regression Testing
Negative Testing Note
GET /todos/9999 is used to observe non-existent-resource behaviour. In this learning environment, JSONPlaceholder returns 200 OK with an empty object. This is documented as an observation rather than automatically being called a defect because a confirmed defect requires an agreed requirement or API contract.

## Continuous Integration
GitHub Actions runs the Maven test suite on every push and pull request. The workflow:

Sets up Java 21.

Runs mvn -B test.

Writes a test-count summary to the GitHub Actions job summary.

Uploads the Surefire reports as a workflow artifact, even when tests fail.

## Traceability
The traceability matrix connects expected behaviour to manual test cases and automated tests. This provides evidence that the important API behaviours are covered.

## Demonstration
A complete 5–10 minute presentation script is available in DEMO_SCRIPT.md.

The demonstration should show:

The API and test scope

Manual test cases

Automated tests

mvn test results

Negative testing and investigation

Traceability

GitHub Actions

Test reports

## Learning Outcomes
By completing this project, I can explain:

What QA and software testing are

What a REST API is

GET, POST, PUT and DELETE

HTTP status codes

Positive and negative testing

Test cases and assertions

JUnit 5 and REST Assured

Maven and Git/GitHub

Defect reporting

Requirements traceability

Regression testing

Continuous integration

Author
Sbongakonke Jele
Quality Assurance Portfolio Project — 2026




## Verification
WTC-UNZ7LUUS
## Video link

  [https://www.youtube.com/watch?v=KQCYIk_UbMM]