# QA Testing Strategy

## 1. Purpose

This project demonstrates a simple junior Quality Assurance workflow by testing the JSONPlaceholder Todo REST API.

The focus is on clear test design, API validation, automation, defect thinking, documentation, and repeatable test execution.

## 2. Scope

### In scope
- GET Todo
- POST Todo
- PUT Todo
- DELETE Todo
- HTTP status-code validation
- JSON response validation
- Positive testing
- Negative/edge-case testing
- Automated regression tests

### Out of scope
- Performance/load testing
- Security/penetration testing
- Database testing
- UI testing
- Production data

## 3. Test Approach

Testing follows this basic flow:

Requirements → Test Cases → Test Execution → PASS/FAIL → Defect Report → Retest

Automated tests are written with Java, JUnit 5 and REST Assured and executed with Maven.

## 4. Test Types

| Test type | Purpose |
|---|---|
| Functional | Check that API operations behave as expected |
| Positive | Verify valid requests |
| Negative/edge | Observe behaviour for invalid or unusual input |
| Regression | Re-run automated tests after changes |
| Response validation | Verify status codes and response fields |

## 5. Entry Criteria

Testing can begin when:
- The project builds successfully.
- Maven dependencies are available.
- The API is reachable.
- Test cases have been defined.

## 6. Exit Criteria

Testing is considered complete for this portfolio scope when:
- All planned tests have been executed.
- Failures have been investigated.
- Defects/observations are documented.
- The automated suite runs successfully.
- Test evidence is available.

## 7. Risks and Assumptions

JSONPlaceholder is a public fake API intended for testing and learning. Its behaviour may differ from a production API, and data changes are not treated as permanent production transactions.

## 8. Environment

- Java 21
- Maven
- JUnit 5
- REST Assured
- IntelliJ IDEA or another Java IDE
- Internet connection
